package org.swcraft.functional.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		Optional<Integer> findMax = findMax(Arrays.asList(1, 6, 2, 3, 5));
		Integer converted;
		if (!findMax.isPresent()) {
			converted = -1;
		} else {
			Integer value = findMax.get();
			if (value > 5) {
				converted = value * 2;
			} else {
				converted = value;
			}
		}
		System.out.println(converted);
		
		System.out.println(zip(Arrays.asList("John", "Doe"), Arrays.asList(25, 40)));
	}
	
	public static Optional<Integer> findMax(List<Integer> list) {
		return list.stream().max(Integer::compare);
	}
	
	
	private static List<Pair<String, Integer>> zip(List<String> names, List<Integer> ages) {
		Iterator<String> these = names.iterator();
		Iterator<Integer> those = ages.iterator();
		List<Pair<String, Integer>> zipped = new ArrayList<>();
		while (these.hasNext() && those.hasNext()) {
			zipped.add(new Pair<String, Integer>(these.next(), those.next()));
		}
		return zipped;
	}
	
	private static class Pair<X, Y> {
		public final X x;
		public final Y y;

		public Pair(X x, Y y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "Pair [x=" + x + ", y=" + y + "]";
		}
	}
	
	// Triple? 
}
