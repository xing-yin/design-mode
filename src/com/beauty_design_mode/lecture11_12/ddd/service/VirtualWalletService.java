package com.beauty_design_mode.lecture11_12.ddd.service;

import com.beauty_design_mode.lecture11_12.anemia_model.entity.VirtualWalletEntity;
import com.beauty_design_mode.lecture11_12.anemia_model.repository.VirtualWalletRepository;
import com.beauty_design_mode.lecture11_12.anemia_model.repository.VirtualWalletTransactionRepository;

import java.math.BigDecimal;

/**
 * 区别于 Domain 的职责，Service 类主要有下面这样几个职责：
 * <p></p>
 * 1.Service 类负责与 Repository 交流。
 * 2.Service 类负责跨领域模型的业务聚合功能。
 * 3.Service 类负责一些非功能性及与三方系统交互的工作。
 * @author Alan Yin
 * @date 2020/10/10
 */

public class VirtualWalletService {

    // 通过构造函数或者IOC框架注入
    private VirtualWalletRepository walletRepo;
    private VirtualWalletTransactionRepository transactionRepo;

    public VirtualWallet getVirtualWallet(Long walletId) {
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        VirtualWallet wallet = convert(walletEntity);
        return wallet;
    }

    private VirtualWallet convert(VirtualWalletEntity walletEntity) {
        // ...
        return null;
    }

    public BigDecimal getBalance(Long walletId) {
        return walletRepo.getBalance(walletId);
    }

    public void debit(Long walletId, BigDecimal amount) {
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        VirtualWallet wallet = convert(walletEntity);
        /// todo 区别贫血模型的关键:将贫血模型 service 中的业务逻辑抽取到了领域模型中实现
        wallet.debit(amount);
        walletRepo.updateBalance(walletId, wallet.balance());
    }

    public void credit(Long walletId, BigDecimal amount) {
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        VirtualWallet wallet = convert(walletEntity);
        wallet.credit(amount);
        walletRepo.updateBalance(walletId, wallet.balance());
    }

    public void transfer(Long fromWalletId, Long toWalletId, BigDecimal amount) {
        //...跟基于贫血模型的传统开发模式的代码一样...
    }
}
