package org.swcraft.javase.collections.algorithms;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class FindingValuesTest {

	@Test
	public void testMin() throws Exception {
		List<Integer> numbers = asList(8, 1, 5, 4, 3, 2, 6, 7);
		Integer min = Collections.min(numbers);
		assertThat(min, equalTo(1));
	}
	
	@Test
	public void testMax() throws Exception {
		List<Integer> numbers = asList(8, 1, 5, 4, 3, 2, 6, 7);
		Integer min = Collections.max(numbers);
		assertThat(min, equalTo(8));
	}
	
//	@Test
//	public void testMinOnEmpty() throws Exception {
//		Collections.min(Collections.emptyList());
//	}
}
