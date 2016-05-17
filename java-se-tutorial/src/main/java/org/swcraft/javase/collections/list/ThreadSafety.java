package org.swcraft.javase.collections.list;

import java.util.ArrayList;
import java.util.List;

import net.jcip.annotations.NotThreadSafe;

@NotThreadSafe
public class ThreadSafety {

	private List<Integer> numbers = new ArrayList<>();
	
	public void add(Integer number) {
		numbers.add(number);
	}
	
	public int size() {
		return numbers.size();
	}
}
