package com.coderscampus.lesson5;

import java.util.Arrays;
import java.util.Comparator;

public class SortingApplication {

	public static void main(String[] args) {
		String[] names = new String[4];
		// String by default implements the interface Comparable
		// and Serializable

		names[0] = "Guy Ross";
		names[1] = "Trevor Page";
		names[2] = "Elon Musk";
		names[3] = "Jordan Bellfast";
		System.out.println("Pre-sorting" +
						"\nNames:");
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println(); // separate the lists
		Arrays.sort(names); // alphabetical
		System.out.println("Post-sorting");
		System.out.println("Names:");
		for (String name : names) {
			System.out.println(name);
		}
		
		// Those are just Strings. How about a custom class?
		Person[] people = new Person[5];

		people[0] = new Person("Guy Ross", 68);
		people[1] = new Person("Trevor Page", 70);
		people[2] = new Person("Elon Musk", 74);
		people[3] = new Person("Jordan Bellfast", 71);
		people[4] = new Person("Jane Doe", 70);
		
		Arrays.sort(people, new PersonHeightComparator()); // invokes PersonHeightComparator with an overriding method

		System.out.println("\nHEIGHT REPORT\n" +
							"(ascending order)");
		Arrays.sort(people, new Comparator<Person>() {
			// Comparator is an interface that can take two objects
			// built-in method compare() compares 2 ints
			@Override
			public int compare(Person person1, Person person2) {
				return person1.getHeight().compareTo(person2.getHeight());
			}
		});

		for (Person person : people) {
			System.out.println(person.getName() + " is " + person.getHeight() + " inches tall.");
		}
	}

}
