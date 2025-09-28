package com.lcx.lcxaicodemother.ai;

import com.lcx.lcxaicodemother.ai.model.HtmlCodeResult;
import com.lcx.lcxaicodemother.ai.model.MultiFileCodeResult;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AiCodeGeneratorServiceTest {

    @Resource
    AiCodeGeneratorService aiCodeGeneratorService;

    @Test
    void generateHtmlCode() {

        HtmlCodeResult generateHtmlCode = aiCodeGeneratorService.generateHtmlCode(1,"做一个程序员星痕的工作记录小工具");
        Assertions.assertNotNull(generateHtmlCode);
    }

    @Test
    void generateMultiFileCode() {
        MultiFileCodeResult generateMultiFileCode = aiCodeGeneratorService.generateMultiFileCode("做个程序员星痕的留言板");
        Assertions.assertNotNull(generateMultiFileCode);
    }
    @Test
    void testChatMemory() {
        HtmlCodeResult result = aiCodeGeneratorService.generateHtmlCode("做个登录网站，总代码量不超过20行");
        Assertions.assertNotNull(result);
        result = aiCodeGeneratorService.generateHtmlCode("不要生成网站，告诉我你刚刚做了什么？");
        Assertions.assertNotNull(result);
        result = aiCodeGeneratorService.generateHtmlCode("做个登录网站，总代码量不超过20行");
        Assertions.assertNotNull(result);
        result = aiCodeGeneratorService.generateHtmlCode("不要生成网站，告诉我你刚刚做了什么？");
        Assertions.assertNotNull(result);
    }

}