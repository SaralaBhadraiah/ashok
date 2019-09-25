package com.app.method.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEntrySetExample {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", null);
		map.put(null, "100");

		Set<Entry<String,String>> entrySet = map.entrySet();
		Iterator<Entry<String, String>> iterator = entrySet.iterator();
		Entry<String, String> next = null;
		
		System.out.println("map before processing = "+map);
		System.out.println("entrySet before processing = "+entrySet);
		while(iterator.hasNext()){
			next = iterator.next();
			System.out.println("Processing on: "+next.getValue());
			if(next.getKey() == null) iterator.remove();
		}
	}
}
