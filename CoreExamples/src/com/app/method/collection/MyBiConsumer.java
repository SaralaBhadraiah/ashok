package com.app.method.collection;

import java.util.function.BiConsumer;

public class MyBiConsumer implements BiConsumer<String, String> {

	@Override
	public void accept(String str, String str1) {
		System.out.println("Key = " + str);
		System.out.println("Processing on value = " + str1);
		
	}

}
