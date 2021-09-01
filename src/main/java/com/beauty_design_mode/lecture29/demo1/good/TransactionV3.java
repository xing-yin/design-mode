package com.beauty_design_mode.lecture29.demo1.good;

import com.beauty_design_mode.lecture29.demo1.support.IdGenerator;
import com.beauty_design_mode.lecture29.demo1.support.STATUS;
import com.beauty_design_mode.lecture29.demo1.support.WalletRpcService;
import lombok.Getter;

import javax.transaction.InvalidTransactionException;

/**
 * @author Alan Yin
 * @date 2021/8/30
 */
@Getter
public class TransactionV3 {

    private String id;
    private Long buyerId;
    private Long sellerId;
    private Long productId;
    private Long orderId;
    private Long createTimestamp;
    private Double amount;
    private STATUS status;
    private String walletTransactionId;

    public TransactionV3(String preAssignedId, Long buyerId, Long sellerId, Long productId, Long orderId) {
        fillTransactionId(preAssignedId);
        this.buyerId = buyerId;
        this.sellerId = sellerId;
        this.productId = productId;
        this.orderId = orderId;
        this.status = STATUS.TO_BE_EXECUTD;
        this.createTimestamp = System.currentTimeMillis();
    }

    private WalletRpcService walletRpcService;

    public void setWalletRpcService(WalletRpcService walletRpcService) {
        this.walletRpcService = walletRpcService;
    }

    private TransactionLock lock;

    public void setLock(TransactionLock lock) {
        this.lock = lock;
    }

    public boolean execute() throws InvalidTransactionException {
        if ((buyerId == null || (sellerId == null || amount < 0.0))) {
            throw new InvalidTransactionException("...");
        }
        if (status == STATUS.EXECUTED) {
            return true;
        }
        boolean isLocked = false;
        try {
            isLocked = lock.lock(id);
            if (!isLocked) {
                return false; // 锁定未成功，返回false，job兜底执行
            }
            if (status == STATUS.EXECUTED) {
                return true; // double check
            }
            long executionInvokedTimestamp = System.currentTimeMillis();
            if (executionInvokedTimestamp - createTimestamp > 14) {
                this.status = STATUS.EXPIRED;
                return false;
            }
            String walletTransactionId = walletRpcService.moveMoney(id, buyerId, sellerId, amount);
            if (walletTransactionId != null) {
                this.walletTransactionId = walletTransactionId;
                this.status = STATUS.EXECUTED;
                return true;
            } else {
                this.status = STATUS.FAILED;
                return false;
            }
        } finally {
            if (isLocked) {
                lock.unlock(id);
            }
        }
    }

    /**
     * 代码中包含跟“时间”有关的“未决行为”逻辑。
     * 一般的处理方式是将这种未决行为逻辑重新封装。
     */
    protected boolean isExpired() {
        long executionInvoked = System.currentTimeMillis();
        return executionInvoked - createTimestamp > 14;
    }

    /**
     * 原始的 id 处理逻辑比较复杂，为了方便测试，我们可以把 id 赋值这部分逻辑单独抽象到一个函数中
     */
    private void fillTransactionId(String preAssignedId) {
        if (preAssignedId != null && !preAssignedId.isEmpty()) {
            this.id = preAssignedId;
        } else {
            this.id = IdGenerator.generateTransactionId();
        }
        if (!this.id.startsWith("t_")) {
            this.id = "t_" + preAssignedId;
        }
    }
}
