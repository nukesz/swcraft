package org.swcraft.javaee.beans.ejb.view;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Stateless
@Path("view")
public class ViewDemoBean {

	@EJB
	ExampleLocal localBean;
	
	@EJB
	ExampleRemote remoteBean;
	
	@EJB
	NoInterfaceBean noInterfaceBean;
	
	@GET
	public JsonObject get() {
		JsonObjectBuilder views = Json.createObjectBuilder();
		return views.add("Local", localBean.toString() + " says " + localBean.localMethod())
				    .add("Remote", remoteBean.toString() + " says " + remoteBean.remoteMethod())
				    .add("No-interface", noInterfaceBean.toString() + " says " + noInterfaceBean.getMessage())
				    .build();
	}
	
}
