package io.ridham._20_fileIO;

import java.io.*;

public class C {

	// FileWriter is not convenient
	// Instead of throwing Exception use try-catch-finally
	public static void main(String[] args) {

		// To write on file, we need file(or its reference)
		File f = new File("E://", "abc.txt");
		FileWriter fw = null;
		

		try {
			// Set FileWriter to specific file
			// Append by default false(it override changes)
			// If its true it add new changes
			fw = new FileWriter(f, false);
			
			// To add a new Line you have to provide escape character
			fw.write(97); // can write Ascii code
			fw.write('a'); // can write character
			fw.write("\nHello motherFucker!!"); // can write String
		}
		catch(IOException e) {
			e.printStackTrace();
		}		
		finally {
			if(fw != null) {
				try {
					// flush() --> to apply the changes to existing file
					fw.flush();
			
					// close() --> to close FileWriter
					fw.close();
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("done");
	}
}
