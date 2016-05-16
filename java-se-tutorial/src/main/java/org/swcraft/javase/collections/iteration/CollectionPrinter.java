package org.swcraft.javase.collections.iteration;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionPrinter {

	public void printWithIterator(Collection<?> collection) {
		Iterator<?> iterator = collection.iterator();
		while (iterator.hasNext()) {
			Object object = iterator.next();
			System.out.println(object);
		}
	}
	
	public void printWithForEach(Collection<?> collection) {
		for (Object object : collection) {
			System.out.println(object);
		}
	}
	
	public void printWithStream(Collection<?> collection) {
		collection.forEach(x -> System.out.println(x));
	}
	
	public static void main(String[] args) {
		Collection<String> letters = Arrays.asList("A", "B", "C", "D");
		CollectionPrinter cp = new CollectionPrinter();
		cp.printWithIterator(letters);
		cp.printWithForEach(letters);
		cp.printWithStream(letters);
	}
}
