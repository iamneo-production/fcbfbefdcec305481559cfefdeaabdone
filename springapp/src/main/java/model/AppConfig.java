package com.examly;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.examly")
public class AppConfig {

    @Bean
    public Student student() {
        return new Student();
    }
}

public class AppConfig {

}
