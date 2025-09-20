package com.lcx.lcxaicodemother.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * projectName:lcx-ai-code-mother
 * author:LiuChenXi
 * time:2025/9/19 18:15
 * description:
 */
@Data
public class UserUpdateRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 用户头像
     */
    private String userAvatar;

    /**
     * 简介
     */
    private String userProfile;

    /**
     * 用户角色：user/admin
     */
    private String userRole;

    private static final long serialVersionUID = 1L;
}

