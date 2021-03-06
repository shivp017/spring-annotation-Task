package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Appconfig;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
        Movie movie = context.getBean("movie", Movie.class);
        System.out.println(movie);

    }

}
