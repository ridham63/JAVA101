package io.ridham._10_accessModifier;

// abstract modifiers
// applicable for class, methods]
public abstract class D {
	// class defined abstract when it has partial implementation
	// therefor instantiation is not possible
	// if class have even one abstract method it must be defined abstract
	// even though class don't have any abstract method it can be defined abstract(optional)
	// illegal combo: final, native, synchronized, static, private, strictfp
	// if class extends abstract class it must implement all methods or should be abstract

	// abstract method must not have implementation
	// although child class can provide implementation for abstract methods
	abstract void m1() ;

}
// final vs abstract

// final class can't be override
// abstract class must be override for implementation

// abstract class can't have final methods
// abstract method in final class is not possible