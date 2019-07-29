package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Appconfig {

    @Bean
//    @Scope("prototype")
    public Actor actor() {
        Actor actor = new Actor();
        return actor;
    }


@Bean
    public Movie movie() {
    Movie movie = new Movie();
    movie.setActor(actor());
    return movie;
}
    @Bean
    public Movie movie2 ()
    {
        Movie movie= new Movie();
        return movie;

    }
}
