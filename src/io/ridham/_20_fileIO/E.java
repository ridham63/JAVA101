package io.ridham._20_fileIO;

import java.io.*;

// To overcome problems of FileWriter we use BufferReader
public class E {
	public static void main(String[] args) throws IOException {
		
		// It can't communicate to file directly, so we use FileWriter with it
		// Its possible of two level buffering
		BufferedWriter bw = new BufferedWriter(new FileWriter("E://abc.txt"));
		
		// can use charInt, char array or String
		bw.write("Hello MotherFucker!!");
		
		// newLine() --> to add a new Line
		bw.newLine();
		
		bw.write("Hey, YOU.");
		
		bw.flush();
		// It will close underlying FileWriter also
		bw.close();
	}
}
