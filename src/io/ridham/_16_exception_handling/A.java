package io.ridham._16_exception_handling;

// Exception is an unwanted event that disturbs the normal flow of execution.
// You should handle exception for graceful termination of program
// Exception handling doesn't mean repairing exception
// It is provide an alternate way to continue flow

public class A {
	public static void main(String[] args) {
		doStuff();
	}

	private static void doStuff() {
		doMoreStuff();		
	}

	private static void doMoreStuff() {
		System.out.println(10/0);		
	}
}
/*
 * This is Runtime Stack Mechanism: 
 * 
 * Here method who raise exception is responsible to handle it.
 * Here JVM create exception object & try to find handling code
 * If method don't have handling code, it terminates method abnormally & remove stack entry
 * After that JVM goes to the caller and find handling code
 * This is happen till main method or we found handling code
 * If main method have handling code, exception hand-over to Default Exception Handler
 * It will terminate program abnormally and print StackTrace
 * StackTrace have Exact information about the exception to resolve it.
 * 
 * StackTrace:
 * 
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 * at exception_handling.A.doMoreStuff(A.java:20)
 * at exception_handling.A.doStuff(A.java:16)
 * at exception_handling.A.main(A.java:12)
 */
