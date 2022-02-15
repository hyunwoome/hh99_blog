package com.sparta.hh99blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Hh99BlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(Hh99BlogApplication.class, args);
    }

}
