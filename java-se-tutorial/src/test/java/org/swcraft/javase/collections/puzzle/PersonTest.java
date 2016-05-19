package org.swcraft.javase.collections.puzzle;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testReflexive() throws Exception {
		Person x = new Person("A", "B");
		assertTrue(x.equals(x));
	}
	
	@Test
	public void testSymmetric() throws Exception {
		Person x = new Person("A", "B");
		Person y = new Person("A", "B");
		assertTrue(x.equals(y) && y.equals(x));
	}
	
	@Test
	public void testDifferentPeople() throws Exception {
		Person x = new Person("A", "B");
		Person y = new Person("C", "B");
		assertFalse(x.equals(y));
	}
	
	@Test
	public void testTransitive() throws Exception {
		Person x = new Person("A", "B");
		Person y = new Person("A", "B");
		Person z = new Person("A", "B");
		assertTrue(x.equals(y) && y.equals(z) && x.equals(y));
	}
	
	@Test
	public void testNull() throws Exception {
		Person x = new Person("A", "B");
		assertFalse(x.equals(null));
	}
}
