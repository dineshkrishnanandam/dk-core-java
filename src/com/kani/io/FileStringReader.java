package com.kani.io;

import java.io.FileReader;
import java.io.IOException;

public class FileStringReader {

	public static void main(String[] args) throws IOException {

		FileReader fileReader = new FileReader("E:\\names.txt");

		int i = fileReader.read();
		while (i != -1) {
			char c = (char) i;

			System.out.print(c);

			i = fileReader.read();
		}
		fileReader.close();
		System.out.print("I am done Reading");
		
		// ascii value for carriage return(13) and line feed(10)
		
//		i = fileReader.read();
//		System.out.println(i);
//
//		i = fileReader.read();
//		System.out.println(i);
//
//		i = fileReader.read();
//		System.out.println(i);
//
//		i = fileReader.read();
//		System.out.println(i);
//
//		i = fileReader.read();
//		System.out.println(i);

		// casting to char
		// char c = (char) i;

		// System.out.println(c);

	}

}
