package org.swcraft.javaee.beans.ejb.view;

import javax.ejb.Stateless;

@Stateless
public class LocalBean implements ExampleLocal {

	@Override
	public String localMethod() {
		return "local";
	}

}
