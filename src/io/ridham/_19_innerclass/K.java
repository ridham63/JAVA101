package io.ridham._19_innerclass;

// we can define a thread by anonymous inner class easily
public class K {

	public static void main(String[] args) {
		// Here AIC will extend Thread class and we can override run()
		Thread t = new Thread() {
			@Override
			public void run() {
				for (int i = 11; i < 20; i++) {
					System.out.println(i);
				}
			}
		};
		
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}		
	}
}
