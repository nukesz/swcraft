package org.swcraft.javaee.beans.pojo.services;

public class IncrementerService {

	private int startIndex = 0;

	public int getNext() {
		return ++startIndex;
	}
	
	
}
