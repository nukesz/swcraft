package org.swcraft.javase.collections.puzzle;

import java.util.ArrayList;
import java.util.List;

public class Remove {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(4);
		numbers.add(0);
		numbers.add(1);
		numbers.add(5);
		numbers.add(3);
		// => [4, 0, 1, 5, 3]
		
		numbers.remove(3);
		
		// What will it print?
		System.out.println(numbers);
	}
}
