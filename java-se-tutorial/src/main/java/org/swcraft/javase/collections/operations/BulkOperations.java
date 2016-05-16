package org.swcraft.javase.collections.operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public class BulkOperations {

	public static void main(String[] args) {
		Collection<String> abcd = Arrays.asList("A", "B", "C", "D");
		Collection<String> cd = Arrays.asList("C", "D");
		Collection<String> de = Arrays.asList("D", "E");
		
		// containsAll  
		// returns true if the target Collection contains all of the elements in the specified Collection.
		System.out.println("abcd.containsAll(cd) containsAll = " + abcd.containsAll(cd));
		System.out.println("abcd.containsAll(de) containsAll = " + abcd.containsAll(de));
		
		// addAll
		// adds all of the elements in the specified Collection to the target Collection.
		Collection<String> collectionToModify = new ArrayList<>();
		collectionToModify.add("X");
		collectionToModify.add("Y");
		boolean addAll = collectionToModify.addAll(de);
		System.out.println("addAll = " + addAll);
		System.out.println("collectionToExtend = " + collectionToModify);
		
		// removeAll
		// removes from the target Collection all of its elements that are also contained in the specified Collection.
		boolean removeAll = collectionToModify.removeAll(de);
		System.out.println("removeAll = " + removeAll);
		System.out.println("collectionToExtend = " + collectionToModify);
		
		// retainAll (intersection)
		// removes from the target Collection all its elements that are not also contained in the specified Collection. 
		// That is, it retains only those elements in the target Collection that are also contained in the specified Collection
		collectionToModify.add("A");
		boolean retainAll = collectionToModify.retainAll(abcd);
		System.out.println("retainAll = " + retainAll);
		System.out.println("collectionToExtend = " + collectionToModify);
		
		// Clear
		// removes all elements from the Collection.
		collectionToModify.clear();
		System.out.println("collectionToExtend = " + collectionToModify);
	}
}
