package org.swcraft.javaee.beans.ejb.name;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Stateless
@Path("viewname")
public class SpecifyNameDemoBean {

    @EJB(beanName = "FirstBean")
    LocalInterface bean;

    // Not allowed:
    //
    // @EJB
    // LocalInterface bean;

    @GET
    public String get() {
        return bean.getMessage();
    }
}
