package io.ridham._16_exception_handling;

// Sometime we can create and throw exception manually(explicitly)
// This is done by 'throw' keyword
// While throwing exception, it don't matter that exception raised logically or not
// Here instead of any method, programmer is responsible for exception
// Best used for customized exception
// Should be used in JVM
public class G {
	
	public static void main(String[] args) {
		//Creation exception object
		ArithmeticException e = new ArithmeticException("I suck at math");
		
		// Exception object is thrown explicitly
		// Hand-over our created object to JVM
		throw e;
	}
}
