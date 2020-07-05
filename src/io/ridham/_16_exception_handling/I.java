package io.ridham._16_exception_handling;

// We can create our customized Exception
// We inherit appropriate Exception class and class super(s)
public class I {
	public static void main(String[] args) {
		int age = 88;
		if(age > 60) {
			throw new TooYoungException("Wait please");
		}
		if(age < 18) {
			throw new TooYoungException("Too old to be married");
		}
		else {
			System.out.println("Searching...");
		}
	}
}
