package com.amos.think.test;

import com.alibaba.cola.dto.MultiResponse;
import com.amos.think.api.IUserService;
import com.amos.think.dto.data.UserVO;
import com.amos.think.dto.query.UserListByNameQuery;
import com.amos.think.web.UserController;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import javax.annotation.Resource;


/**
 * UserController Test
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2021/10/28
 */
@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class UserControllerTest {

    @Resource
    private MockMvc mockMvc;
    @MockBean
    private IUserService userService;

    @Test
    public void mockList() throws Exception {
        String name = "amos";

        UserVO userVO = new UserVO();
        userVO.setId(0L);
        userVO.setName(name);
        userVO.setUsername("amos.wang");

        Mockito.when(userService.listByName(UserListByNameQuery.builder().name(name).build()))
                .thenReturn(MultiResponse.of(Lists.list(userVO)));

        mockMvc.perform(MockMvcRequestBuilders.get("/user/list").param("name", name))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

}
