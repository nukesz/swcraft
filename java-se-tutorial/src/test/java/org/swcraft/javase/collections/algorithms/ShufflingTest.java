package org.swcraft.javase.collections.algorithms;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.assertThat;

import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class ShufflingTest {

	@Test
	public void testShufflingList() throws Exception {
		List<Integer> numbers = asList(1, 2, 3, 4, 5, 6, 7);
		
		Collections.shuffle(numbers);
		
		System.out.println(numbers);
		assertThat(numbers, hasItem(1));
	}
	
	
}
