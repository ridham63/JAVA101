package io.ridham._16_exception_handling;

// If exception rise, further execution halted till exception handling
// Program terminate normally only if all method terminate normally
public class B {
	public static void main(String[] args) {
		System.out.println(10/0);
		doStuff();
	}

	private static void doStuff() {
		doMoreStuff();		
	}

	private static void doMoreStuff() {
		System.out.println("HI");		
	}
}
/*
 * 'Throwable' act as root class for exception and errors
 * 
 * 'Exception' is recoverable, 'Errors' are not
 * 'Exception' raised by programmer, 'Errors' raised by lack of system resources
 * */
