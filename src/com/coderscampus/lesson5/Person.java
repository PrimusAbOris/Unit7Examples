package com.coderscampus.lesson5;

import java.io.Serializable;

public class Person implements Comparable<Person>, Serializable {
	// Not to be confused with the Human class
	// Serializable is an interface, but has no methods
	// Classes implementing Serializable need a serialVersionUID declared
	// Serializable = can be saved to a file
	private static final long serialVersionUID = 1L;
	private String name;
	private Integer height;
	// if you add something like
	// private String gender;
	// you should change line 10 to
	// private static final long serialVersionUID = 2L;
	// as it's a different version of Person, incompatible with the existing one
	
	public Person (String name, Integer height) {
		this.name = name;
		this.height = height;
		// serialVersionUID = 2L;
		// this fails because of the final qualifier on line 10
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	
	// compareTo is a built-in method that returns 0 if two Strings are identical
	@Override
	public int compareTo(Person that) {
		if (this.height.compareTo(that.height) == 0) {
			return this.name.compareTo(that.name); // ascending order
		} else {
			return that.height.compareTo(this.height); // descending order
		}
	}
}
