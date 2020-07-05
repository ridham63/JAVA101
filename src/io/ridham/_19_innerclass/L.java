package io.ridham._19_innerclass;

// creating a thread by implementing Runnable in AIC
public class L {
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				for (int i = 11; i < 20; i++) {
					System.out.println(i);
				}
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}
