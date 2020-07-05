package io.ridham._35_defaultStatic;

// If class Implements more then one method there may be a chance of ambiguity problem

public class B implements Right, Left{
	

	@Override
	public void m1() {
		// You can solve ambiguity problem by override it
		 System.out.println("Override method");
		
		// Or you can specify it
		Left.super.m1();
		Right.super.m1();
	}
}

interface Right {
	public default void m1() {
		System.out.println("Right method");
	}
}

interface Left {
	public default void m1() {
		System.out.println("Left method");
	}
}