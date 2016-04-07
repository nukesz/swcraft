package org.swcraft.javaee.beans.ejb.view;

import javax.ejb.Stateless;

@Stateless
public class NoInterfaceBean {

	public String getMessage() {
		return "no-interface";
	}
}
