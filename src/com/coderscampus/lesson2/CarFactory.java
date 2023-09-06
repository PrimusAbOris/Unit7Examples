package com.coderscampus.lesson2;

import java.io.Serializable;

public class CarFactory extends GenericFactory implements Serializable {

	/**
	 * Hover over class name -> Add serial version ID
	 */
	private static final long serialVersionUID = 4546162754071415681L;
	// Serializing an Object means giving it a specific ID so it can be recalled
	// in a specific sense later
	// "this is car 1, this is car 4873264872658732465824, this is car 73..."
	// Serializable is an Interface and can be put pretty much anywhere

	public CarFactory () {
		this.totalCapacity = 1000;
	}
	
	@Override
	public Product build(Part[] parts) {
		Body body = null;
		Frame frame = null;
		Electronics electronics = null;
		
		for (Part part : parts) {
			if (part instanceof Electronics) {
				electronics = (Electronics) part;
			} else if (part instanceof Frame) {
				frame = (Frame) part;
			} else if (part instanceof Body) {
				body = (Body) part;
			}
		}
		
		if (body != null && frame != null && electronics != null) {
			Car car = new Car();
			car.setBody(body);
			car.setElectronics(electronics);
			car.setFrame(frame);
			return car;
		}
		
		return null;
	}

}
