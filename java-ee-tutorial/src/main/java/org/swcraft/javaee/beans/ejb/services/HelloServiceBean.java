package org.swcraft.javaee.beans.ejb.services;

import javax.ejb.Stateless;

@Stateless
public class HelloServiceBean {

    private final String message = "Hello world!";

    public String sayHello() {
        return message;
    }

}
