package com.nageoffer.shortlink.admin.dto.req;

import lombok.Data;

import java.util.Date;

/**
 * 用户注册入参
 */
@Data
public class UserRegisterReqDTO {


    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String mail;

}
