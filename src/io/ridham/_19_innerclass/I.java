package io.ridham._19_innerclass;

public class I {
	int x = 10;
	static int y = 200;
	
	public static void m1() {
		final int z = 3000;
		int a = 50000;
		// We can access local variable of method in which method local inner class defined from 1.8
		// Unless it defined as final
		class Ii {
			public void m2() {
				//System.out.println(x);
				System.out.println(y);
				System.out.println(z);
				System.out.println(a);
			}
		}
		
		Ii ii = new Ii();
		ii.m2();
	}
	
	public static void main(String[] args) {
		I i = new I();
		i.m1();
	}
	
}
