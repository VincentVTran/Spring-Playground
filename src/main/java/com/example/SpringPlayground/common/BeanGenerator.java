package com.example.SpringPlayground.common;

import com.example.SpringPlayground.model.TestModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //Only configurations can create beans
public class BeanGenerator {
    @Bean(name = "bean1")
    public TestModel testBean() {
        return new TestModel(4);
    }
    @Bean(name = "bean2")
    public TestModel testBean2() {
        return new TestModel(2);
    }
}
