package com.training.org.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionsWithFile {

	public static void main(String[] args) throws IOException {

		try {
			FileInputStream fis = new FileInputStream("abc.txt");
			System.out.println("File opened successfully");
			
			FileWriter fw = new FileWriter("abc.txt");
			fw.write("Welcome to the Corporate Training");
			fw.close();
			System.out.println("File written successfully");
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
