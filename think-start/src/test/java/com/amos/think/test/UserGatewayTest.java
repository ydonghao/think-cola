package com.amos.think.test;

import com.amos.think.domain.user.gateway.UserGateway;
import com.amos.think.domain.user.model.UserEntity;
import com.amos.think.gateway.impl.database.dataobject.UserDO;
import com.amos.think.gateway.impl.database.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * MockUserGatewayTest
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2021/10/28
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserGatewayTest {

    @Resource
    private UserGateway userGateway;
    /**
     * 通过 @MockBean 来单独测试 UserGateway，
     * 从而不受 UserGateway 内部依赖的影响
     */
    @MockBean
    private UserMapper userMapper;

    @Test
    public void mockGetUserInfo() {
        String username = "amos";

        UserDO userDO = new UserDO();
        userDO.setUsername(username);
        userDO.setPassword("123456");
        userDO.setName("amos.wang");

        Mockito.when(userMapper.getUserInfo(username))
                .thenReturn(userDO);

        UserEntity amos = userGateway.getUserInfo(username);

        Assert.assertNotNull(amos);
        Assert.assertEquals(amos.getUsername(), username);
    }

}
