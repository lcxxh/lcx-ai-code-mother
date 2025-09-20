package com.lcx.lcxaicodemother.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * projectName:lcx-ai-code-mother
 * author:LiuChenXi
 * time:2025/9/19 11:45
 * description: 用户登录请求参数
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;
}
