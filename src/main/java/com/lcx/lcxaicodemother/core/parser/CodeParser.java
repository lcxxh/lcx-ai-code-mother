package com.lcx.lcxaicodemother.core.parser;

/**
 * projectName:lcx-ai-code-mother
 * author:LiuChenXi
 * time:2025/9/23 18:08
 * description:  代码解析器策略接口
 */
public interface CodeParser<T> {

    /**
     * 解析代码内容
     *
     * @param codeContent 原始代码内容
     * @return 解析后的结果对象
     */
    T parseCode(String codeContent);
}

