package org.swcraft.javaee.beans.pojo.services;

import java.util.ArrayList;
import java.util.List;

public class Cache {
	
	private List<String> data = new ArrayList<>();
	
	private Cache() {
	}

	private static class CacheHolder {
		private static final Cache INSTANCE = new Cache();
	}

	public static Cache getInstance() {
		return CacheHolder.INSTANCE;
	}
	
	public void add(String value) {
		data.add(value);
	}
	
	public List<String> getData() {
		return data;
	}
}
