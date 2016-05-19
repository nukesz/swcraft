package org.swcraft.javase.collections.create;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateCollections {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		Set<Integer> hashSet = new HashSet<>();
		Map<Integer, String> hashMap = new HashMap<>();
		
		List<Integer> arrayArrayList = Arrays.asList(1, 2, 3, 4);
		
		List<Integer> singletonList = Collections.singletonList(2);
		Set<String> singletonSet = Collections.singleton("B");
		Map<Integer, String> singletonMap = Collections.singletonMap(1, "B");
		
		List<Integer> emptyList = Collections.emptyList();
		Set<Object> emptySet = Collections.emptySet();
		Map<Object, Object> emptyMap = Collections.emptyMap();
		
		List<Integer> unmodifiableList = Collections.unmodifiableList(arrayList);
		Set<Integer> unmodifiableSet = Collections.unmodifiableSet(hashSet);
		Map<Integer, String> unmodifiableMap = Collections.unmodifiableMap(hashMap);
		
		// Collections.synchronizedList(list);
		// Collections.synchronizedSet(set);
		// Collections.synchronizedMap(map);
		
		List<Integer> listFromStream1 = Stream.of(1, 2, 3).collect(Collectors.toList());
		List<Integer> listFromStream2 = Stream.of(1, 2, 3).collect(Collectors.toCollection(ArrayList::new));
		
		List<Integer> listFromStream3 = IntStream.range(0, 100).boxed().collect(Collectors.toList());
		List<Integer> listFromStream4 = IntStream.rangeClosed(0, 100).boxed().collect(Collectors.toList());
		
		// LongStream...
		// DoubleStream

			
		
		Stream<String> streamOfLetters = Stream.of("abc", "cde", "efg", "jkd", "res"); 
		ArrayList<String> list = new ArrayList<>(); 
		streamOfLetters.forEach(list::add);
		
	}
}
