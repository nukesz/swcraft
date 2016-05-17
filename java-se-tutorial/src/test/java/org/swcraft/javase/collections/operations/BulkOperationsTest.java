package org.swcraft.javase.collections.operations;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BulkOperationsTest {

	@Test
	public void testContainsAll() throws Exception {
		assertThat(asList("A", "B", "C").containsAll(asList("B", "C")), equalTo(true));
	}
	 
	@Test
	public void testNotContainsAll() throws Exception {
		assertThat(asList("A", "B", "C").containsAll(asList("B", "E")), equalTo(false));
	}
	
	@Test
	public void testAddAll() throws Exception {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.addAll(asList("C", "D"));
		assertThat(list, equalTo(asList("A", "B", "C", "D")));
	}
	
	@Test
	public void testRemoveAll() throws Exception {
		List<String> list = new ArrayList<>(asList("A", "B", "C", "D"));
		list.removeAll(asList("C", "D"));
		assertThat(list, equalTo(asList("A", "B")));
	}
	
	@Test
	public void testRetainAll() throws Exception {
		List<String> list1 = new ArrayList<>(asList("A", "B", "C"));
		List<String> list2 = new ArrayList<>(asList("B", "C", "D"));
		list1.retainAll(list2);
		assertThat(list1, equalTo(asList("B", "C")));
	}
	
	@Test
	public void testEmpty() throws Exception {
		List<String> list = new ArrayList<>(asList("A", "B", "C"));
		list.clear();
		assertThat(list.isEmpty(), equalTo(true));
	}
}
