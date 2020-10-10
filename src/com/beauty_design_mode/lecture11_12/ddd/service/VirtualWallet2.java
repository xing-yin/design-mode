package com.beauty_design_mode.lecture11_12.ddd.service;

import com.beauty_design_mode.lecture11_12.anemia_model.error.InsufficientBalanceException;
import com.beauty_design_mode.lecture11_12.anemia_model.error.InvalidAmountException;

import java.math.BigDecimal;

/**
 * 如果虚拟钱包系统需要支持更复杂的业务逻辑，那充血模型的优势就显现出来了。比如，我们要支持透支一定额度和冻结部分余额的功能
 *
 * @author Alan Yin
 * @date 2020/10/10
 */

public class VirtualWallet2 {

    private Long id;
    private Long createTime = System.currentTimeMillis();
    ;
    private BigDecimal balance = BigDecimal.ZERO;
    /**
     * 允许透支
     */
    private boolean isAllowedOverdraft = true;
    private BigDecimal overdraftAmount = BigDecimal.ZERO;
    private BigDecimal frozenAmount = BigDecimal.ZERO;

    public VirtualWallet2(Long preAllocatedId) {
        this.id = preAllocatedId;
    }

    public void freeze(BigDecimal amount) {
        //...
    }

    public void unfreeze(BigDecimal amount) {
        //...
    }

    public void increaseOverdraftAmount(BigDecimal amount) {
        //...
    }

    public void decreaseOverdraftAmount(BigDecimal amount) {
        //...
    }

    public void closeOverdraft() {
        //...
    }

    public void openOverdraft() {
        //...
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getAvailableBalance() {
        BigDecimal totalAvailableBalance = this.balance.subtract(this.frozenAmount);
        if (isAllowedOverdraft) {
            totalAvailableBalance = totalAvailableBalance.add(this.overdraftAmount);
        }
        return totalAvailableBalance;
    }

    public void debit(BigDecimal amount) {
        BigDecimal totalAvailableBalance = getAvailableBalance();
        if (totalAvailableBalance.compareTo(amount) < 0) {
            throw new InsufficientBalanceException();
        }
        this.balance.subtract(amount);
    }


    public void credit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new InvalidAmountException();
        }
        this.balance.add(amount);
    }

    /**
     * 领域模型 VirtualWallet 类添加了简单的冻结和透支逻辑之后，功能看起来就丰富了很多，代码也没那么单薄了。
     * 如果功能继续演进，我们可以增加更加细化的冻结策略、透支策略、支持钱包账号（VirtualWallet id 字段）自动生成的逻辑
     * （不是通过构造函数经外部传入 ID，而是通过分布式 ID 生成算法来自动生成 ID）等等。
     * VirtualWallet 类的业务逻辑会变得越来越复杂，也就很值得设计成充血模型了。
     */
}

