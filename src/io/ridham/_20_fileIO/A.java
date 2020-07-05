package io.ridham._20_fileIO;

import java.io.File;
import java.io.IOException;

// File IO implemented based on UNIX OS
// AS It IOException is checked exception, it must be thrown or use try-catch
public class A {
	public static void main(String[] args) throws IOException {

		// This will not create any file, it create an object named 'abc.txt'
		// Can be used for any file type
		File f = new File("abc.txt");

		// exists() --> check whether file exists or not
		System.out.println(f.exists());

		// createNewFile() --> this will create actual file
		// File/Folder will be in the root of projects
		// If file already created it return false
		f.createNewFile();

		// now it returns true
		System.out.println(f.exists());
	}
}
