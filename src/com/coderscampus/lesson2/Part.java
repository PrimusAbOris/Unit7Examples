package com.coderscampus.lesson2;

public interface Part {
	Integer getSize();
	// if this is really big, you might want to know it before doing
	// file operations on it
	Integer getBuildTime();
}
