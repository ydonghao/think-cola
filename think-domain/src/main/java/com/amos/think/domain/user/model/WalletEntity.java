package com.amos.think.domain.user.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 钱包--实体
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2021/9/29
 */
@Getter
@Setter
public class WalletEntity {

    private Long id;

    private BigDecimal balance;

    private LocalDateTime modifyTime;

    public WalletEntity(Long id) {
        this.id = id;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void debit(BigDecimal amount) {
        if (getBalance().compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException(String.format("user balance invalid. balance is [%s]", amount));
        }
        this.balance = getBalance().subtract(amount);
    }

    public void credit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException(String.format("credit amount error. amount is [%s]", amount));
        }
        this.balance = getBalance().add(amount);
    }

    @Override
    public String toString() {
        return "WalletEntity{" +
                "id=" + id +
                ", balance=" + balance +
                ", modifyTime=" + modifyTime +
                '}';
    }
}
