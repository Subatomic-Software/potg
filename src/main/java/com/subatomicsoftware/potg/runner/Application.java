package com.subatomicsoftware.potg.runner;

import java.util.Arrays;

import com.subatomicsoftware.potg.oauth2.Oauth2Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

@SpringBootApplication
@ComponentScan("com.subatomicsoftware.potg")
public class Application {

    public static void main(String[] args) {
          SpringApplication.run(Application.class, args);
     }

}