package com.coderscampus.lesson2;

public class Electronics implements Part {
	
	public Electronics () {
		System.out.println("A car's electronics are being constructed.");
	}
	
	@Override
	public Integer getSize() {
		return 2;
	}

	@Override
	public Integer getBuildTime() {
		return 30;
	}

}
