package com.subatomicsoftware.potg.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

@SpringBootApplication
@ComponentScan("com.subatomicsoftware.potg")
@EnableOAuth2Client
public class Application {

    public static void main(String[] args) {
          SpringApplication.run(Application.class, args);
     }

}