package com.naya.exception_handling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Evgeny Borisov
 */
@SpringBootApplication
public class MainConf {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MainConf.class);
        JEEconfService jeeconfService = context.getBean(JEEconfService.class);
        try {
            jeeconfService.saveModel();
        } catch (Exception e) {
            System.out.println("что-то пошло не так...");
            System.out.println("но мы это исправим");
        }
    }
}
