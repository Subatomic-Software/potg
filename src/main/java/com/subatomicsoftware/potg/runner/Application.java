package com.subatomicsoftware.potg.runner;

import com.subatomicsoftware.potg.services.rest.heroes.dao.HeroRepository;
import com.subatomicsoftware.potg.services.rest.maps.dao.MapsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

@SpringBootApplication
@ComponentScan("com.subatomicsoftware.potg")
@EnableOAuth2Client
@EnableMongoRepositories("com.subatomicsoftware.potg")
public class Application {

    @Autowired
    HeroRepository heroRepository;

    @Autowired
    MapsRepository mapsRepository;

    public static void main(String[] args) {
          SpringApplication.run(Application.class, args);
     }

}