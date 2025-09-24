package com.lcx.lcxaicodemother.ai;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.chat.StreamingChatModel;
import dev.langchain4j.service.AiServices;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * projectName:lcx-ai-code-mother
 * author:LiuChenXi
 * time:2025/9/21 19:17
 * description:
 */

@Configuration
public class AiCodeGeneratorServiceFactory {

    @Resource
    ChatModel chatModel;

    @Resource
    StreamingChatModel streamingChatModel;

    @Bean
    public AiCodeGeneratorService aiCodeGeneratorService(){
        return AiServices.builder(AiCodeGeneratorService.class)
                .chatModel(chatModel)
                .streamingChatModel(streamingChatModel)
                .build();
    }
}
