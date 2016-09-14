package org.swcraft.springframework.core.configuration.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MovieXmlApp {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"movie-beans.xml"});
        context.registerShutdownHook();
 
        SimpleMovieLister movieLister = context.getBean(SimpleMovieLister.class);
        movieLister.listAll();
    }
}
