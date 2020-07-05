package io.ridham._20_fileIO;

import java.io.*;

public class D {

	// FileReader is not sonvenient
	public static void main(String[] args) throws IOException {
		// To read on file, we need file(or its reference)
		File f = new File("E://", "abc.txt");

		// Set FileReader to specific file
		FileReader fr1 = new FileReader(f);

		// Store int of character to 'i'
		int i = fr1.read();

		// After reading first letter it moves to next letters
		while (i != -1) {
			System.out.print((char) i);
			i = fr1.read();
		}
		System.out.println();

		// Recommended way to do it
		char[] ch = new char[(int) f.length()];
		FileReader fr2 = new FileReader(f);
		fr2.read(ch);
		for (char ch1 : ch) {
			System.out.print(ch1);
		}

		// Its always recommended to close any IO class
		fr1.close();
		fr2.close();
	}
}
