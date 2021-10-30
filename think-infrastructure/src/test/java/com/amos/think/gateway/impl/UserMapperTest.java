package com.amos.think.gateway.impl;

import com.amos.think.domain.user.gateway.UserGateway;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class UserMapperTest {

    @Resource
    private UserGateway userGateway;

    @Test
    public void testFindByID() {
        System.out.println(userGateway.getUserInfo("amos"));
    }
}
