package io.ridham._33_lambda;

// Interface containing single abstract method called functional interface(must be one)
// Restriction is only for abstract method
// Runnable() , Callable(), Comparable() are functional interfaces

// We can use annotation to set interface to functional interface explicitly
// After @FunctionalInterface if we make any mistake while defining functional interface, compiler raise error

@java.lang.FunctionalInterface
public interface FunctionalInterface {
	
	public void m1();

	
	default void m2() {
		
	}
	
	public static void m3() {
		
	}
}

// If child inherit parent and use @FunctionalInterface it can't define new abstract method
// But it can override parent method
//@FunctionalInterface
interface X extends FunctionalInterface {
	// Its good practice to use @Override
	@Override
	public void m1();
	
	// But creating more then one method, make interface non-functional, So, no new methods allowed
	// In this case either remove method or remove @FunctionalInterface annotation
	public void m2();
}
