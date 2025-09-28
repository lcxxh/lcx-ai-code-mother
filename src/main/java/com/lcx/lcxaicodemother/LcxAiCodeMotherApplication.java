package com.lcx.lcxaicodemother;

import dev.langchain4j.community.store.embedding.redis.spring.RedisEmbeddingStoreAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lcx.lcxaicodemother.mapper")
@SpringBootApplication(exclude = {RedisEmbeddingStoreAutoConfiguration.class})
public class LcxAiCodeMotherApplication {

    public static void main(String[] args) {
        SpringApplication.run(LcxAiCodeMotherApplication.class, args);
    }

}
