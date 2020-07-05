package io.ridham._19_innerclass;

// How to access inner class from outer class static context
public class C {
	
	class Ci{	
		public void m1() {
			System.out.println("Inner class method");
		}		
	}
	
	// static context
	public static void main(String[] args) {
		C c = new C();
		C.Ci i = c.new Ci();
		i.m1();
		
		// or
		
		C.Ci i1 = new C().new Ci();
		i1.m1();
		
		//or
		
		new C().new Ci().m1();
	}
}
