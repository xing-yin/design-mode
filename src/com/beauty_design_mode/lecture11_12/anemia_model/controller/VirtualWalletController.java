package com.beauty_design_mode.lecture11_12.anemia_model.controller;

import com.beauty_design_mode.lecture11_12.anemia_model.service.VirtualWalletService;

import java.math.BigDecimal;

/**
 * Controller 和 VO 负责暴露接口
 *
 * @author Alan Yin
 * @date 2020/10/10
 */

public class VirtualWalletController {

    /**
     * 通过构造器或 IOC 框架注入
     */
    private VirtualWalletService virtualWalletService;

    //查询余额
    public BigDecimal getBalance(Long walletId) {
        // ...
        return null;
    }

    //出账
    public void debit(Long walletId, BigDecimal amount) {
        // ...
    }

    //入账
    public void credit(Long walletId, BigDecimal amount) {
        // ...
    }

    //转账
    public void transfer(Long fromWalletId, Long toWalletId, BigDecimal amount) {
        // ...
    }

}
