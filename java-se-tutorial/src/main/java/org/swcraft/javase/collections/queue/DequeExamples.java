package org.swcraft.javase.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeExamples {

	public static void main(String[] args) {
		Deque<String> letters = new ArrayDeque<>();
		letters.push("A"); // at the head
		letters.push("B"); // B -> A
		letters.add("C"); // at the end B -> A -> C
		letters.add("D"); // B -> A -> C -> D
		
		for (String letter : letters) {
			System.out.println(letter);
		}
		
		System.out.println("First element: " + letters.getFirst());
		System.out.println("Last element: " + letters.getLast());
		
		// Traversing backwards
		Iterator<String> it = letters.descendingIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
