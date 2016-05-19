package org.swcraft.javase.collections.algorithms;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class CompositionTest {
	
	@Test
	public void testFrequency() throws Exception {
		List<String> letters = asList("A", "B", "B", "C");
		int frequencyOfB = Collections.frequency(letters, "B");
		assertThat(frequencyOfB, equalTo(frequencyOfB));
	}
	
	@Test
	public void testFrequencyWithStream() throws Exception {
		List<String> letters = asList("A", "B", "B", "C");
		long frequencyOfB = letters.stream()
								   .filter(letter -> "B".equals(letters))
								   .count();
		assertThat(frequencyOfB, equalTo(frequencyOfB));
	}
	
	@Test
	public void testDisjointWithoutCommonElements() throws Exception {
		boolean disjoint = Collections.disjoint(asList("A", "B", "B", "C"), asList("D", "E"));
		assertTrue(disjoint);
	}
	
	@Test
	public void testDisjointWithCommonElements() throws Exception {
		boolean disjoint = Collections.disjoint(asList("A", "B", "B", "C"), asList("D", "B"));
		assertFalse(disjoint);
	}
}
