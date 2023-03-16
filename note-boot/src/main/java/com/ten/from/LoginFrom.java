package com.ten.from;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * 登录入参
 *
 * @author shisen
 * @date 2022/2/1 10:45
 */
@Data
@ToString
public class LoginFrom {

    @NotBlank(message = "手机号不能为空")
    @Pattern(regexp = "^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(166)|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\\d{8}$",message = "手机号格式不正确")
    private String mobile;

    @NotBlank(message = "密码不能为空")
    private String password;
}