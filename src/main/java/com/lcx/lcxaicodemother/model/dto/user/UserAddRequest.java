package com.lcx.lcxaicodemother.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * projectName:lcx-ai-code-mother
 * author:LiuChenXi
 * time:2025/9/19 18:10
 * description:
 */
@Data
public class UserAddRequest implements Serializable {

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 用户头像
     */
    private String userAvatar;

    /**
     * 用户简介
     */
    private String userProfile;

    /**
     * 用户角色: user, admin
     */
    private String userRole;

    private static final long serialVersionUID = 1L;
}

