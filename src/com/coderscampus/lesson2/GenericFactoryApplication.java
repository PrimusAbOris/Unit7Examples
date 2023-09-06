package com.coderscampus.lesson2;

public class GenericFactoryApplication {

	public static void main(String[] args) {
		/* Abstract classes:
		 * When you need to create a lot of similar objects,
		 * an abstract class is good to have as a parent class for them
		 * 
		 * 
		 * Less restricted than interfaces; can have overriding methods
		 */
		
		// lesson 4
		GenericFactory carFactory = new CarFactory();
		Body body = new Body();
		Frame frame = new Frame();
		Electronics electronics = new Electronics();
		
		Part[] parts = new Part[3];
		// THESE parts (Parts) are specific to a car (Car)
		// BUT GenericFactory could have many possible implementations
		parts[0] = body;
		parts[1] = frame;
		parts[2] = electronics;
		
		Product car = carFactory.build(parts);
		System.out.println("A car has been built at the following "
				+ "memory location: " + car);
	}

}
