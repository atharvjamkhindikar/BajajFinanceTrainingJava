package com.training.org.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class TryCatchThrows {

	static void readFile() throws IOException {
		FileReader file = new FileReader("file.txt");
	}

	public static void main(String[] args) {

		try {
			readFile();
		} catch (IOException e) {
			System.out.println("File not found: " + e.getMessage());
		}

	}

}
