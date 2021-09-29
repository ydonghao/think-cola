package com.amos.think.user.validator;

import com.alibaba.cola.exception.Assert;
import com.amos.think.dto.clientobject.UserModifyCO;
import com.amos.think.dto.clientobject.UserRegisterCO;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

/**
 * UserValidator
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2021/1/10
 */
public class UserValidator {

    /**
     * 用户注册，用户名、密码都不能为空
     */
    public static void checkUserRegister(UserRegisterCO co) {
        Assert.isTrue(StringUtils.isNotBlank(co.getUsername()), "用户名不能为空");
        Assert.isTrue(StringUtils.isNotBlank(co.getPassword()), "密码不能为空");
    }

    /**
     * 用户信息修改用户名不能为空
     */
    public static void checkUserModify(UserModifyCO co) {
        Assert.isTrue(Objects.nonNull(co.getId()) && co.getId() > 0, "用户ID不能为空");
        Assert.isTrue(StringUtils.isNotBlank(co.getUsername()), "用户名不能为空");
    }

}
