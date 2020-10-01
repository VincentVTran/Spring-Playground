package com.example.SpringPlayground.configuration;

import com.example.SpringPlayground.model.TestModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public TestModel testBean() {
        return new TestModel(4);
    }
}
