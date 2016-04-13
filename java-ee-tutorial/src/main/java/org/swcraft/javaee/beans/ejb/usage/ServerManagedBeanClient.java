package org.swcraft.javaee.beans.ejb.usage;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.swcraft.javaee.beans.ejb.services.HelloServiceBean;

@Stateless
@Path("client")
public class ServerManagedBeanClient {

    @EJB
    HelloServiceBean serviceWithEJB;

    @Inject
    HelloServiceBean serviceWithInject;

    @GET
    @Path("/ejb")
    public String ejbClient() {
        return "EJB: " + serviceWithEJB.sayHello();
    }

    @GET
    @Path("/inject")
    public String injectClient() {
        return "Inject: " + serviceWithInject.sayHello();
    }

    @GET
    @Path("/jndi")
    public String jdniClient() {
        try {
            InitialContext ic = new InitialContext();
            HelloServiceBean service = (HelloServiceBean) ic.lookup("java:module/HelloServiceBean");
            return "Jndi: " + service.sayHello();
        } catch (NamingException e) {
            e.printStackTrace();
            return "error?";
        }

    }
}
