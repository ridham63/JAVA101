package io.ridham._10_accessModifier;

// final modifiers
// applicable for class, methods, variables
// only use if you need it
public final class C {
	// final class cannot have child class
	// that's inheritance is not possible with final keyword

	// for final variables JVM won't provide default values
	// for final instance variable we must complete initialization before constructor completion
	// initialization can be done in declaration, IIB, Constructor
	final int x = 10;
	// for final static variable we must complete initialization before class loading
	// initialization can be done in declaration, SIB
	final static int y = 20;

	final void m1() {
		// final methods cannot be override
	}

	public static void main(String[] args) {
		// final local variable must be initialize if we are using it
		// only applicable modifier is final
		// if local variable is not final, it's never <default>
		// as parameters are local variable, it can be final and we can't re-assign them in block
		final int x = 100;
	}

}
