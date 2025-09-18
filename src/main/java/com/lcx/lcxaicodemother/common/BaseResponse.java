package com.lcx.lcxaicodemother.common;

import com.lcx.lcxaicodemother.exception.ErrorCode;
import lombok.Data;

import java.io.Serializable;

/**
 * projectName:lcx-code-mother
 * author:LiuChenXi
 * time:2025/9/14 18:26
 * description:
 */
@Data
public class BaseResponse<T> implements Serializable {

    private int code;

    private T data;

    private String message;

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}

