package io.ridham._20_fileIO;

import java.io.*;

//To overcome problems of FileWriter we use BufferReader
public class F {
public static void main(String[] args) throws IOException {
		
		// It can't communicate to file directly, so we use FileReader with it
		BufferedReader br = new BufferedReader(new FileReader("E://abc.txt"));
		
				
		// But best of all it can read whole line
		String line1 = br.readLine();
		String line2 = br.readLine();
		
		System.out.println(line1);
		System.out.println(line2);
		
		// It will close underlying FileWriter also
		br.close();
	}
}
