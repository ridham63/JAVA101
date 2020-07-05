package io.ridham._19_innerclass;

public class N {
	
	static {
		System.out.println("Outer SIB-1");
	}	
	{
		System.out.println("Outer IIB-1");
	}
	
	static class Ni {
		
		static {
			System.out.println("SIB-1");
		}
		{
			System.out.println("IIB-1");
		}
		
		public void mi1() {
			System.out.println("inside inner class");
		}
		public static void mi2() {
			System.out.println("static - inside inner class");
		}
		
		static N n = new N();
		static Ni ni = new Ni();
		
		public static void main(String[] args) {	
			System.out.println("Inside inner main");
			n.m1();
			N.m2();
		}
	}

	public static void main(String[] args) {
		System.out.println("Inside outer main");
		N n = new N();
		n.m1();
		N.m2();
		Ni ni = new Ni();
	}
	public void m1() {
		System.out.println("inside m1()");
	}
	public static void m2() {
		System.out.println("static - inside m2()");
	}
}
