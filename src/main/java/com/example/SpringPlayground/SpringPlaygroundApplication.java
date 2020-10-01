package com.example.SpringPlayground;

import com.example.SpringPlayground.model.TestModel;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringPlaygroundApplication {

	@Autowired
	static TestModel testModel;

	static ConfigurableApplicationContext context;

	public static void main(String[] args) {
		context = SpringApplication.run(SpringPlaygroundApplication.class, args);
		TestModel test = (TestModel)context.getBean("testBean");
		System.out.println(test.value);
	}

}
