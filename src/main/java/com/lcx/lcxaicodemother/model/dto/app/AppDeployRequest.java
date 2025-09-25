package com.lcx.lcxaicodemother.model.dto.app;

import lombok.Data;

import java.io.Serializable;

/**
 * projectName:lcx-ai-code-mother
 * author:LiuChenXi
 * time:2025/9/25 17:40
 * description:部署请求参数
 */
@Data
public class AppDeployRequest implements Serializable {

    /**
     * 应用 id
     */
    private Long appId;

    private static final long serialVersionUID = 1L;
}

