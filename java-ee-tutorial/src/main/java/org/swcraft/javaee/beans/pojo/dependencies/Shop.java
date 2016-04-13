package org.swcraft.javaee.beans.pojo.dependencies;

import org.swcraft.javaee.beans.pojo.services.HelloService;
import org.swcraft.javaee.beans.pojo.services.IncrementerService;

public class Shop {

    private IncrementerService incrementerService;
    private HelloService helloService;

    public Shop() {
        incrementerService = new IncrementerService();
        helloService = new HelloService();
    }

    public void enter() {
        System.out.println("Visitors today: " + incrementerService.getNext());
        System.out.println(helloService.sayHello());
    }
}
