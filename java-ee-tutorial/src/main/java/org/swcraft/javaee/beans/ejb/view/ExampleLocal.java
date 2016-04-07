package org.swcraft.javaee.beans.ejb.view;

import javax.ejb.Local;

@Local
public interface ExampleLocal {
	
	String localMethod();
	
}
