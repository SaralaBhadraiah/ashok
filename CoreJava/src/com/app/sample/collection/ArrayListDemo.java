package com.app.sample.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Ashok");
		list.add("Naveen");
		list.add("Naresh");
		list.add("RamyaAsh");
		list.add("Ramya");
		
		System.out.println("The List of Strings are "+list);
		System.out.println("The size of List "+list.size());
		
		list.remove("Ramya");
	
		System.out.println("The List of Strings are "+list);
		System.out.println("The size of List "+list.size());
		/*ArrayList with Iterator*/
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
		
		}
		
		/*ArrayList with foreach*/
		for(String s:list)
		{
			System.out.println("The List of Strings are "+s);
		}
	}

}
