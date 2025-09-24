package com.rinyal.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProfileApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ProfileApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE); // nếu có dòng này thì sẽ không start web server
        app.run(args);
    }
}

