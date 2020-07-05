package io.ridham._19_innerclass;


public class G {	
	// We can declare class inside inner class(nesting of class is possible)
	class Gi {		
		class Gii {
			public void m1() {
				System.out.println("Inner most class");
			}
		}		
	}	 
}

class Test1 {
	public static void main(String[] args) {
		G g = new G();
		G.Gi i = g.new Gi();
		G.Gi.Gii ii = i.new Gii();
		ii.m1();
	}
}