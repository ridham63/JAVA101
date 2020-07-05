package io.ridham._20_fileIO;

import java.io.File;
import java.io.IOException;

public class B {
	public static void main(String[] args) throws IOException {
		
		// Either use // or \ to for path
		// If you don't provide absolute path, it will use current working directory
		File f = new File("E://", "ridham");
		
		// mkdir() --> to create folder
		f.mkdir();

		// Another pending.constructor to create file in specific location
		File f1 = new File("E://ridham", "detail.txt");
		f1.createNewFile();

		// Another pending.constructor to create file in specific location(by reference)
		File f2 = new File(f, "resume.txt");
		f2.createNewFile();

		// To add file to specific location
		File f3 = new File("E://", "resume1.txt");
		f3.createNewFile();

		// ifFile() --> return if objects is file or not
		System.out.println(f.isFile());

		// ifDirectory() --> return if objects is directory or not
		System.out.println(f.isDirectory());

		// list() --> return all file/directory of that directory
		// return type will be String[]
		String[] list = f.list();
		for (String s : list) {
			System.out.print(s + ", ");
			System.out.println();
		}
		
		// length() --> return the length of character in file
		System.out.println(f1.length());
		
		// delete() --> will delete file
		f3.delete();
	}
}
