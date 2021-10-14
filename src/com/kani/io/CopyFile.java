package com.kani.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException {

		FileReader fileReader = new FileReader("E:\\names.txt");
		FileWriter fileWriter = new FileWriter("E:\\names3.txt");

		int i = fileReader.read();
		// end of file (eof= -1) 
		while (i != -1) {
			fileWriter.write(i);

			i = fileReader.read();
		}
		fileReader.close();
		fileWriter.close();
		System.out.print("I am done copying");
		
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
