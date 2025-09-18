package com.lcx.lcxaicodemother.controller;

import com.lcx.lcxaicodemother.common.BaseResponse;
import com.lcx.lcxaicodemother.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName:lcx-code-mother
 * author:LiuChenXi
 * time:2025/9/14 17:25
 * description:
 */
@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping("/")
    public BaseResponse<String> healthCheck(){
        return ResultUtils.success("ok");
    }
}
