package org.swcraft.javase.collections.algorithms;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class SearchingTest {

	@Test
	public void testBinarySearch() throws Exception {
		List<Integer> numbers = Arrays.asList(1, 3, 6, 8, 12, 15);
		int index = Collections.binarySearch(numbers, 6);
		assertThat(index, equalTo(2));
	}
	
	@Test
	public void testBinarySearchOnNotSortedList() throws Exception {
		List<Integer> numbers = Arrays.asList(3, 1, 2, 5, 6);
		int indexOfSix = Collections.binarySearch(numbers, 6);
		System.out.println(indexOfSix);
		int indexOfThree = Collections.binarySearch(numbers, 3);
		System.out.println(indexOfThree);
	}
}
