package org.swcraft.springframework.core.configuration.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MovieApp {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
        context.registerShutdownHook();

        SimpleMovieLister movieLister = context.getBean(SimpleMovieLister.class);
        movieLister.listAll();

    }
}
