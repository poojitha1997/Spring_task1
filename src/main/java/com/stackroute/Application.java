package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application
{
    public static void main( String[] args )
    {
        //using ApplicationContext to create the bean
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = context.getBean("movieid",Movie.class);
        movie.display();
        Movie movie1 = context.getBean("movieid2",Movie.class);
        //comparing the beans after making the scope as prototype
        System.out.println(movie==movie1);




    }
}
