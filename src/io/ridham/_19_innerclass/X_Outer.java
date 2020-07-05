package io.ridham._19_innerclass;


public interface X_Outer {
	public void m1();

	interface X_Inner {
		public void m2();
	}
}

class X1 implements X_Outer {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
}

class X2 implements X_Outer.X_Inner {

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
}