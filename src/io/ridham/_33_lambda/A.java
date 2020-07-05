package io.ridham._33_lambda;

// Lambda expression is anonymous function(no name, no modifiers, no return-type)

/* 		Advantages
 * enable functional programming
 * reduce length of code code and improve readability
 * resolve complexity of AIC to some extent
 * can handle procedures/functions like values
 * can handle procedures/functions like argument
 * easier to use updated APIs and libraries
 * best support for parallel programming
 * */
public class A {
	public static void main(String[] args) {
		
	}
	
	public void m1() {
		System.out.println("Hello");
	}
	/*
		() -> {
			System.out.println("Hello");
		}
	*/
	
	// If body contains single statement Curly braces are optional
	// If there is multiple lines, we must enclosed it with curly braces
	
	/*
		() -> System.out.println("Hello");
	*/


	public void add(int a, int b) {
		System.out.println(a+b);
	}
	//	(int a, int b) -> {
	//		System.out.println(a+b);
	//	}
	
	// Based on context compiler can guess data-type : Type-Inference
	
	//	(a, b) -> System.out.println(a+b);


	public int getLength(String s) {
		return s.length();
	}
	/*
		() -> {
			return s.length();
		}
	*/

	// Based on context compiler can guess what are you returning, so no need of 'return'
	// Also there is only one parameter you can skip the parentheses
	
	// s -> s.length();
}
