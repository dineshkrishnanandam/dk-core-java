package com.kani.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLineReader {

	public static void main(String[] args) throws IOException {

		FileReader fileReader = new FileReader("E:\\names.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line = bufferedReader.readLine();

		// int i = fileReader.read();
		// end of file (eof = -1)
		while (line != null) {

			System.out.println(line);

			line = bufferedReader.readLine();
		}
		bufferedReader.close();
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
