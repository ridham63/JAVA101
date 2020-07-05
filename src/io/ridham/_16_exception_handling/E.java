package io.ridham._16_exception_handling;

public class E {
	public static void main(String[] args) {
		// try block can have multiple blocks
		// This is due to try block can raise any unchecked exception
		// If try-block don't have related code, don't try to catch checked exception
		// In multiple catch blocks, specific exception must have only one catch block
		// In multiple catch blocks, parent exception class should not be defined before child
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println("");
		}
		catch(NullPointerException e) {
			System.out.println("");
		}
		catch(Exception e) {
			System.out.println("");
		}
	}
}
