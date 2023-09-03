package com.coderscampus.lesson1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileServiceImpl extends Object implements FileService, GenericService {
	// Every method in an interface must be defined in a class that
	// implements it
	
	// You can only extend one class at a time, but
	// implement multiple interfaces

	@Override
	public String readLine(File file) throws IOException {
		BufferedReader reader = null;
		
		try {
			reader = new BufferedReader(new FileReader("data.txt"));
		} finally {
			reader.close();
		}
		return reader.readLine();
	}

	@Override
	public void writeLine(File file, String input) throws IOException {
		
	}

	@Override
	public void writeLog() {
		// TODO Auto-generated method stub
		
	}


}
