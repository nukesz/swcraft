package org.swcraft.javase.collections.set;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class SetImplementationsTest {

	@Test
	public void testAddSingleElement() throws Exception {
		Set<String> set = new HashSet<>();
		set.add("A");
		assertThat(set.size(), equalTo(1));
		assertThat(set, hasItem("A"));
	}
	
	@Test
	public void testAddTheSameTwice() throws Exception {
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("A");
		assertThat(set.size(), equalTo(1));
	}
	
	@Test
	public void testOrderOfLinkedHashSet() throws Exception {
		Set<String> set = new LinkedHashSet<>();
		set.add("A");
		set.add("C");
		set.add("B");
		List<String> list = new ArrayList<>(set); 
		assertThat(list, equalTo(Arrays.asList("A", "C", "B")));
	}
	
	@Test
	public void testOrderOfThreeSet() throws Exception {
		Set<Integer> treeSet = new HashSet<>();
		treeSet.add(4);
		treeSet.add(2);
		treeSet.add(1);
		treeSet.add(6);
		List<Integer> list = new ArrayList<>(treeSet); 
		assertThat(list, equalTo(Arrays.asList(1, 2, 4, 6)));
	}
}
