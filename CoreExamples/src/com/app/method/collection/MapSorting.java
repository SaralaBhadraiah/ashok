package com.app.method.collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapSorting {

	public static void main(String[] args) {

		/**
		 * Advantages:
		 * 
		 * Thread-safe Readable. Default Sorting in ascending order.
		 * 
		 */
		// Sorting by key and value
		Map<String, String> map = new HashMap<>();
		map.put("C", "c");
		map.put("B", "b");
		map.put("Z", "z");
		List<Map.Entry<String, String>> sortedByKey = map.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toList());
		System.out.println("Sorting By Key ::: ");
		sortedByKey.forEach(System.out::println);

		Map<String, String> map1 = new HashMap<>();
		map1.put("C", "c");
		map1.put("B", "b");
		map1.put("Z", "z");
		map1.put("P", "a");
		List<Map.Entry<String, String>> sortedByValue = map1.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toList());
		System.out.println("Sorting By Value ::: ");
		sortedByValue.forEach(System.out::println);

		// Get rid of ugly if-else condition, use getOrDefault()
		map.clear();
		map = new HashMap<>();
		map.put("C", "c");
		String val = map.getOrDefault("B", "Nah!");
		System.out.println(val); // prints Nah!

		// Replace and Remove utilities
		map.clear();
		map = new HashMap<>();
		map.put("C", "c");
		map.put("B", "b");
		map.replaceAll((k, v) -> "x"); // value is "x" for all keys.

		// And replace(K key, V oldValue, V newValue) method replaces the entry
		// for the
		// specified key only if currently mapped to the specified value. In the
		// same
		// way you can use replace, remove methods to check by key and values
		// pairs
		// together.

		// Do not override keys accidentally use putIfAbsent()
		map.clear();
		map = new HashMap<>();
		map.put("C", "c");
		map.put("B", "b");
		map.putIfAbsent("B", "x");
		System.out.println(map.get("B")); // prints "b"

		// Operate directly on values

		map.clear();
		map = new HashMap<>();
		map.put("C", "c");
		map.put("B", "b");
		map.compute("B", (k, v) -> v.concat(" - new "));
		System.out.println(map.get("B")); // prints "b - new"

		// Conditional computes are also available. Look at computeIfPresent,
		// computeIfAbsent methods.

		// computeifAbsent
		map.clear();
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("A", 1);
		map2.put("B", 2);
		map2.put("C", 3);

		System.out.println("===================================");
		System.out.println("Before Compute Data from Map ::: ");

		map2.forEach((k, v) -> System.out.println("Key is : " + k + " Value is : " + v));
		System.out.println("====================");

		Function<String, Integer> function = (k) -> 0; // Default value
		// Same Value is returning, as it is present
		// map.compute(key, remappingFunction)
		map2.computeIfAbsent("A", function);
		System.out.println(map.get("A"));
		// It will not through any NullPointer Exception if key is not present,
		// BUt make
		// a entry of not present key with value
		map2.computeIfAbsent("Hello", function);
		System.out.println("====================");
		System.out.println("After Compute Data from Map ::: ");
		map2.forEach((k, v) -> System.out.println("Key is : " + k + " Value is : " + v));
		
		
		
	}

}
