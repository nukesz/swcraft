package org.swcraft.javase.collections.algorithms;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class SortingTest {

	@Test
	public void testSortList() throws Exception {
		List<Integer> numbers = asList(1, 5, 4, 3, 2, 6, 7);
		
		Collections.sort(numbers);
		
		assertThat(numbers, equalTo(asList(1, 2, 3, 4, 5, 6, 7)));
	}
	
	
	
}
