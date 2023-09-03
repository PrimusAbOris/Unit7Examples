package com.coderscampus.lesson1;

import java.io.File;
import java.io.IOException;

public interface FileService {
	// These are all public; declaring them as public wouldn't change them
	
	String standardFilename = "data.txt";
	
	String readLine (File file) throws IOException;
	
	void writeLine (File file, String input) throws IOException;
	
}
