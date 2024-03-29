package com.app.method.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class HashMapForEachExample {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", null);
		map.put(null, "100");

		BiConsumer<String, String> action = new MyBiConsumer();
		map.forEach(action);
		
		//lambda expression example
		System.out.println("\nHashMap forEach lambda example\n");
		map.forEach((k,v) -> {System.out.println("Key = "+k+", Value = "+v);});
	}
}
