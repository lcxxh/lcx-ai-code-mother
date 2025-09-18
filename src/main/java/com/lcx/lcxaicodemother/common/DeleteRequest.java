package com.lcx.lcxaicodemother.common;

import lombok.Data;

import java.io.Serializable;

/**
 * projectName:lcx-code-mother
 * author:LiuChenXi
 * time:2025/9/14 18:31
 * description:
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}

