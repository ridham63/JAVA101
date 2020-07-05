package io.ridham._19_innerclass;

// Regular inner class
// Any inner class declared directly inside a class without static modifier

// B.class
// Applicable modifiers for outer class :
//		public, <default>, final, abstract, strictfp
public class B {
	
	// B$Bi.class
	// Inner class can't have static declaration as it is not static class
	// This is because we can't create inner class object without outer class object
	
	// Applicable modifiers for inner class :
	//		public, <default>, final, abstract, strictfp + private, protected, static
	class Bi {
		
	}
	
	public static void main(String[] args) {
		System.out.println("Outer class main method");
	}
}
