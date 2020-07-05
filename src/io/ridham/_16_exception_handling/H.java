package io.ridham._16_exception_handling;

// 'throws' keywords is also option to handle exception
public class H {
	
	// 'throws' keywords must be used with methods & constructor
	// 'throws' is only valid with throwable types
	// 'throws' is only to convince compiler, it still abnormal termination
	// so try-catch is advisable
	public static void main(String[] args) throws InterruptedException{
		System.out.println("Hello!!");
		Thread.sleep(1000);
		System.out.println("World!!");

	}
}
