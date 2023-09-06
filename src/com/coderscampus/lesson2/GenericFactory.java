package com.coderscampus.lesson2;

public abstract class GenericFactory {
	// At least one abstract method
	
	protected Integer totalCapacity;
	
	public abstract Product build (Part[] parts);

	public Integer getTotalCapacity() {
		return totalCapacity;
	}
}
