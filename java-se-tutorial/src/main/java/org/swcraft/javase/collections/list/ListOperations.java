package org.swcraft.javase.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Robert");
		names.add("Emma");
		names.add("Steven");
		names.add("Gordon");
		names.add("Alisha");
		names.add("John");
		names.add("Garry");
		
		System.out.println(names);
		
		String name = names.get(0);
		System.out.println("Name with get = " + name);
		
		List<String> subNames = names.subList(1, 5);
		System.out.println("SubNames = " + subNames);
	}
}
