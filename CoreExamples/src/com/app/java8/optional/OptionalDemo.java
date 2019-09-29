package com.app.java8.optional;

import java.util.Optional;

public class OptionalDemo {


	public static void main(String[] args) {

		/*Program wtihout optional class
		String str[] = new String[10];
		String str1 = str[5].toLowerCase();
		System.out.println(str1);*/

		/*Program with optional class*/
		String str2[] = new String[20];
		Optional<String> checkNull = Optional.ofNullable(str2[10]);
		if(checkNull.isPresent())
		{
			String s = str2[10].toLowerCase();
			System.out.println(s);
		}
		else
		{
			System.out.println("s is null");
		}


	}

}
