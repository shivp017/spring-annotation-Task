package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {

@Bean
    public Actor actor() {
    Actor actor = new Actor();
    return actor;
}

@Bean
    public Movie movie() {
    Movie movie = new Movie();
    return movie;

}

}
