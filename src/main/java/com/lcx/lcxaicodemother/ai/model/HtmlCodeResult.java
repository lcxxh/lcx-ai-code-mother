package com.lcx.lcxaicodemother.ai.model;

import dev.langchain4j.model.output.structured.Description;
import lombok.Data;

/**
 * projectName:lcx-ai-code-mother
 * author:LiuChenXi
 * time:2025/9/22 10:36
 * description:
 */
@Description("生成 HTML 代码文件的结果")
@Data
public class HtmlCodeResult {

    @Description("HTML代码")
    private String htmlCode;

    @Description("生成代码的描述")
    private String description;
}


