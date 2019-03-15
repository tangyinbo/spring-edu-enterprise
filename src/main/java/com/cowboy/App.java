package com.cowboy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Hello world!
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
@PropertySource("classpath:p1.properties")
@PropertySource("classpath:p2.properties")
@SpringBootApplication
public class App {
    @Autowired
    private Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
