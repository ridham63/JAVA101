package io.ridham._16_exception_handling;

// You can provide handling code for exceptions
// Either by try-catch or 'throws' keyword

public class D {
	public static void main(String[] args) {
		System.out.println("This line not raising exception ever.");
		System.out.println("But following 2 line might.");
		
		// In try block you should paste risky code, and keep it as small as possible
		// If try block raise exception we may handle it in catch block
		try {
			System.out.println(10 / 0);
			System.out.println("This line wont executes as above line raise exception");
		}
		
		// In catch block we provide handling code
		// Only catch exception if we defined it (defined or its child exception)
		// Its possible that catch block can't catch exception(If not defined)
		catch (ArithmeticException e) {
			System.out.println("\nException handled.");
		}
	}
}
