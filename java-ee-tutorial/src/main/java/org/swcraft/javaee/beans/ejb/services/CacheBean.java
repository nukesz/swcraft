package org.swcraft.javaee.beans.ejb.services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Singleton;

@Singleton
public class CacheBean {
	
	private List<String> data = new ArrayList<>();
	
	public void add(String value) {
		data.add(value);
	}
	
	public List<String> getData() {
		return data;
	}
}
