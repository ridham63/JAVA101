package io.ridham._11_interfaces;

// Interface is just the set of services you are provided
// Interface cannot be instantiated
// Interface is pure abstract class, so using abstract keyword is optional
// Interface can either be public or <default>
public interface A1 {
	
	//Interface don't have constructors, IIB, SIB
	
	
	// Interface can have variables
	// Each variable is static and final whether you define it or not
	// So you must initialize it
	int i =10;
	int j = 20;
	
	//You can define methods inside interface
	//Whether you define or not it is always abstract, so it must not have implementation
	void method1();
	abstract void method2();
}
