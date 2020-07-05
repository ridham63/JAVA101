package io.ridham._19_innerclass;

// Anonymous inner class
// A class without name
// It is classifies as :
// 		extends a class(either one only)
// 		implements an interface(either one only)
//		defined inside arguments
// As it don't have name, constructor consept is not availible
// If requirement is temporary and only once we should go for AIC 
public class J {
	public void taste() {
		System.out.println("salty");
	}
}

class Test2 {
	public static void main(String[] args) {

		// This is anonymous inner class
		// Parent reference to create child class without name
		// Here child class extends parent class, it has parent reference and
		// implementation
		J j = new J() {

			@Override
			public void taste() {
				System.out.println("salty");
			}

		};

		// Permanent class
		J j1 = new J();
		j1.taste();

		
		// Anonymous inner class
		J j2 = new J() {

			@Override
			public void taste() {
				System.out.println("spicy");
			}

		};
		j2.taste();
	}
}