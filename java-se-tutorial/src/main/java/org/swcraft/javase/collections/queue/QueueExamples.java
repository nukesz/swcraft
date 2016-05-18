package org.swcraft.javase.collections.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {

	public static void main(String[] args) {
		Queue<String> words = new LinkedList<>();
		words.add("A");
		words.add("B");
		words.add("C");
		words.add("D");
		words.add("E");
		
		while (!words.isEmpty()) {
			System.out.println(words.poll());
		}
		
		Queue<Integer> numbers = new PriorityQueue<>();
		numbers.add(5);
		numbers.add(2);
		numbers.add(1);
		numbers.add(3);
		numbers.add(8);
		
		while (!numbers.isEmpty()) {
			System.out.println(numbers.poll());
		}
	}
}
