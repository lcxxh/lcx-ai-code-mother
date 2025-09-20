package com.lcx.lcxaicodemother;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lcx.lcxaicodemother.mapper")
public class LcxAiCodeMotherApplication {

    public static void main(String[] args) {
        SpringApplication.run(LcxAiCodeMotherApplication.class, args);
    }

}
