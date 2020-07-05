package io.ridham._33_lambda;

// Creating a thread by implementing Runnable using lambada expression
public class F {
	public static void main(String[] args) {

		// Runnable(I) contains only one method: run()
		Runnable r = () -> {
			for(int i=0 ; i<10 ; i++) {
				System.out.println(i);
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i=10 ; i<20 ; i++) {
			System.out.println(i);
		}
	}
}
