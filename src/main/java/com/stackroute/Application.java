package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class Application
{
    public static void main( String[] args )
    {
        //Using ApplicationContext
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Movie moviereference = context.getBean("movieid",Movie.class);
//        moviereference.display();

        //using XmlBeanFactory
//        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
//        Movie moviereference = factory.getBean("movieid",Movie.class);
//        moviereference.display();
//

        BeanDefinitionRegistry beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(new FileSystemResource("src/beans.xml"));
        Movie m =((DefaultListableBeanFactory)beanFactory).getBean(Movie.class);

        m.display();




    }
}
