package com.amos.think.gateway.impl.database.dataobject;

import com.amos.think.common.api.BaseDO;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 钱包 DO
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2021/9/29
 */
@Getter
@Setter
public class WalletDO extends BaseDO {

    private Long userId;

    private BigDecimal balance;

    @Override
    public String toString() {
        return super.toString();
    }
}
