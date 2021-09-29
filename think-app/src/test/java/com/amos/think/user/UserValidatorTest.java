package com.amos.think.user;

import com.amos.think.dto.clientobject.UserModifyCO;
import com.amos.think.dto.clientobject.UserRegisterCO;
import com.amos.think.user.validator.UserValidator;
import org.junit.Test;

public class UserValidatorTest {

    @Test
    public void checkUserRegister() {
        UserRegisterCO userRegisterCO = new UserRegisterCO();
        userRegisterCO.setId(1L);
        userRegisterCO.setUsername("amos");
        userRegisterCO.setPassword("123456");

        UserValidator.checkUserRegister(userRegisterCO);
    }

    @Test
    public void checkUserModify() {
        UserModifyCO userRegisterCO = new UserModifyCO();
        userRegisterCO.setId(1L);
        userRegisterCO.setUsername("amos");

        UserValidator.checkUserModify(userRegisterCO);
    }
}
