package com.beauty_design_mode.lecture11_12.ddd.service;

import com.beauty_design_mode.lecture11_12.anemia_model.error.InsufficientBalanceException;
import com.beauty_design_mode.lecture11_12.anemia_model.error.InvalidAmountException;

import java.math.BigDecimal;

/**
 * DDD 跟基于贫血模型的传统开发模式的主要区别就在 Service 层，Controller 层和 Repository 层的代码基本上相同。
 * <p>
 * Domain领域模型(充血模型)
 * <p>
 * 在 DDD 开发模式下，我们把虚拟钱包 VirtualWallet 类设计成一个充血的 Domain 领域模型，
 * 并且将原来在 Service 类中的部分业务逻辑移动到 VirtualWallet 类中，让 Service 类的实现依赖 VirtualWallet 类。
 *
 * @author Alan Yin
 * @date 2020/10/10
 */

public class VirtualWallet {

    private Long id;
    private Long createTime = System.currentTimeMillis();
    private BigDecimal balance = BigDecimal.ZERO;

    public VirtualWallet(Long preAllocatedId) {
        this.id = preAllocatedId;
    }

    public BigDecimal balance() {
        return this.balance;
    }

    public void debit(BigDecimal amount) {
        if (this.balance.compareTo(amount) < 0) {
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
}
