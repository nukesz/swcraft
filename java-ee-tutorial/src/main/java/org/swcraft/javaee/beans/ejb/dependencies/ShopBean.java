package org.swcraft.javaee.beans.ejb.dependencies;

import javax.ejb.EJB;
import javax.ejb.Stateful;

import org.swcraft.javaee.beans.ejb.services.HelloServiceBean;
import org.swcraft.javaee.beans.ejb.services.IncrementerServiceBean;

@Stateful
public class ShopBean {

	@EJB
	private IncrementerServiceBean incrementerService;
	
	@EJB
	private HelloServiceBean helloService;

	public void enter() {
		System.out.println("Visitors today: " + incrementerService.getNext());
		System.out.println(helloService.sayHello());
	}
}
