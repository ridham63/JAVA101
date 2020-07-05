package io.ridham._04_variables;

// Local variable defined inside method, block or constructor for temporary use
// Local variable created at the time of block starts and destroyed at block completes
// It stored in stack memory
// it's also called temporary variable or stack variable or Automatic variable
// It must be initialized before use
// It is advisable to initialize local variable at declaration
// Only local variables are thread-safe
public class E {
	public static void main(String[] args) {
		// it can only accept final modifier(or <default>)
		int x = 10;
		System.out.println(x);
	}

	// it can be only used or accessed in same block
	public void m1() {
//		System.out.println(x);
	}
}
