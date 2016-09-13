package org.swcraft.springframework.core.configuration.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldApp {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
        HelloWorld obj = context.getBean(HelloWorld.class);
        // HelloWorld obj = context.getBean("helloWorld", HelloWorld.class);
        obj.printMessage();
    }
}
