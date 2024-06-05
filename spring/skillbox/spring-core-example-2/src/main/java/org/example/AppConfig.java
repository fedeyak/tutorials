package org.example;

import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean
    public LogicClass simpleLogicClass() {
        return new LogicClass();
    }
}
