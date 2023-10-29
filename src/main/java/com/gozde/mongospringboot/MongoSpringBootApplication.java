package com.gozde.mongospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class MongoSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoSpringBootApplication.class, args);
    }

}
