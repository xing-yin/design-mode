package com.beauty_design_mode.lecture11_12.anemia_model.entity;

import java.math.BigDecimal;

/**
 * @author Alan Yin
 * @date 2020/10/10
 */

public class VirtualWalletTransactionEntity {

    private Status status;
    private Long toWalletId;
    private BigDecimal amount;
    private long createTime;
    private long fromWalletId;

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public void setFromWalletId(Long fromWalletId) {
        this.fromWalletId = fromWalletId;
    }

    public void setToWalletId(Long toWalletId) {
        this.toWalletId = toWalletId;
    }

    public Long getToWalletId() {
        return toWalletId;
    }
}
