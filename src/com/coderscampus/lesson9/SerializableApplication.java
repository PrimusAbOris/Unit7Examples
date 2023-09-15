package com.coderscampus.lesson9;

import java.io.FileInputStream;
import java.io.FileNotFoundException; // extends IOException, but is more specific
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.coderscampus.lesson5.Person;

public class SerializableApplication {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		savePeopleToFile(); 
		
		loadPeopleFromFile();
	}

	private static void loadPeopleFromFile() throws IOException, ClassNotFoundException {
		try (FileInputStream fileInput = new FileInputStream("people.txt"); // try can be one line, like if
			 ObjectInputStream objectInput = new ObjectInputStream(fileInput);) {
			Person trevor = (Person) objectInput.readObject();
			Person jane = (Person) objectInput.readObject();
			Person elon = (Person) objectInput.readObject();
			
			System.out.println(trevor.getName());
			System.out.println(jane.getName());
			System.out.println(elon.getName());
			
			System.out.println("Data read from people.txt");
		}
		
	}

	private static void savePeopleToFile() throws IOException, FileNotFoundException {
		Person trevor = new Person("Trevor Page", 70);
		Person jane = new Person("Jane Doe", 65);
		Person elon = new Person("Elon Musk", 75);
		
		try (FileOutputStream fileOutput = new FileOutputStream("people.txt");
			 ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);) {
			objectOutput.writeObject(trevor);
			objectOutput.writeObject(jane);
			objectOutput.writeObject(elon);
			// This is outputting the objects themselves, so it'll look messy
			// Try looking at it in a hex editor
			System.out.println("Data written to people.txt");
		}
	}

}
