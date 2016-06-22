package com.subatomicsoftware.potg.runner;

import com.subatomicsoftware.potg.services.rest.guides.dao.GuidesRepository;
import com.subatomicsoftware.potg.services.rest.heroes.dao.HeroRepository;
import com.subatomicsoftware.potg.services.rest.maps.dao.MapsRepository;
import com.subatomicsoftware.potg.services.rest.users.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

@SpringBootApplication
@ComponentScan("com.subatomicsoftware.potg")
@EnableOAuth2Client
@EnableMongoRepositories("com.subatomicsoftware.potg")
public class Application {

    @Autowired
    HeroRepository heroRepository;

    @Autowired
    MapsRepository mapsRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    GuidesRepository guidesRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
     }

}