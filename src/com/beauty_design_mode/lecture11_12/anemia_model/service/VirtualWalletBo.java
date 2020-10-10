package com.beauty_design_mode.lecture11_12.anemia_model.service;

import java.math.BigDecimal;

/**
 * Service 和 BO 负责核心业务逻辑
 *
 * @author Alan Yin
 * @date 2020/10/10
 */

public class VirtualWalletBo {

    private Long id;
    private Long createTime;
    private BigDecimal balance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
