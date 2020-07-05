package io.ridham._19_innerclass;

// From inner class we can access static & instance context of outer class

// In inner class this() always referees to current inner class object
// To refer outer class we should use Outer.this()
public class F {

	int x = 100;
	static int y = 200;
	
	class Fi {
		
		int x = 300;
		
		public void m1() {
			System.out.println(F.this.x);
			System.out.println(y);
			System.out.println(this.x);
		}
	}
	
	public static void main(String[] args) {
		new F().new Fi().m1();
	}
}
