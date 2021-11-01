package com.amos.think.gateway.impl;

import com.amos.think.gateway.impl.database.dataobject.WalletDO;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Wallet Test
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2021/9/29
 */
public class WalletTest {

    @Test
    public void init() {
        WalletDO walletDO = new WalletDO();
        walletDO.setUserId(1L);
        walletDO.setBalance(new BigDecimal("100"));
        walletDO.setId(1L);
        walletDO.setGmtCreate(LocalDateTime.now());
        walletDO.setCreator("amos.wang");
        walletDO.setGmtModify(LocalDateTime.now());
        walletDO.setModifier("amos.wang");
        walletDO.setDeleteFlag(false);

        System.out.println(walletDO);
    }

}
