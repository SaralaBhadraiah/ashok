package com.app.java8.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemoJava8 {

	public static void main(String[] args) {

		Address ashokaddress = new Address("1-46, 1st Street", "Warangal", "India", 506002);
		Person ashok = new Person("Ashok",Optional.of(ashokaddress), 874731232);
		Person naveen = new Person("Naveen", Optional.empty(), 333299911);
		Person naresh = new Person("Naresh", Optional.empty(), 533299911);
		List<Person> people = new ArrayList<>(); 
		people.add(ashok);
		people.add(naveen);
		people.add(naresh); 
		people.stream()
		.forEach((p) -> { System.out.printf("%s from %s %n", p.name(), 
				p.address().orElse(Address.EMPTY_ADDRESS)); });
	}

}
