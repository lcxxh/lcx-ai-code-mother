package com.lcx.lcxaicodemother.common;

import lombok.Data;

/**
 * projectName:lcx-code-mother
 * author:LiuChenXi
 * time:2025/9/14 18:30
 * description:
 */
@Data
public class PageRequest {

    /**
     * 当前页号
     */
    private int pageNum = 1;

    /**
     * 页面大小
     */
    private int pageSize = 10;

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 排序顺序（默认降序）
     */
    private String sortOrder = "descend";
}

