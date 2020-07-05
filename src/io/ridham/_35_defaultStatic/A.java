package io.ridham._35_defaultStatic;

// default methods in interface

// until v1.7 methods inside interface is public and abstract
// until v1.7 variables inside interface is public, static and final

// in v1.8 default method is introduced
// default method can be used as it is or can be override
// it is still different than abstract class

/* 		Differences
 * Interface variables are public, static and final
 * Abstract class variable can be specified explicitly
 * 
 * Interface can never talks about state of object
 * Abstract class talks about state of interface
 * 
 * Constructor is only applicable for Constructor not for interface
 * 
 * SIB/IIB are only applicable for Constructor not for interface
 * 
 * Functional interface with default method can refer lambda expression
 * Abstract class don't refer to lambda expression
 * 
 * Inside interface we can't override object class methods
 * Inside Abstract class we can override object class methods
 * 
 * */
interface X1 {
	default void m1() {
		System.out.println("Default method");
	} 
}

public class A implements X1 {
//	public void m1() {
//		System.out.println("Default method - override");
//	}
	public static void main(String[] args) {
		A a = new A();
		a.m1();
	}
}