package io.ridham._39_methodReference;

public class B {
    // Implementation of m2()
    // static implementation use class name
    public static void m2() {
        System.out.println("lambada implementation-2");
    }

    // instance implementation use object reference
    public void m3() {
        System.out.println("lambada implementation-3");
    }

    // to implement m1() of Interf(I), we can use implementation of m2()
    // m2()(method that we are used to get implementation) should be static
    // to use method reference, both methods should have same argument type(other properties can be difference)
    public static void main(String[] args) {
        Interf i = B::m2;
        i.m1();

        B b = new B();
        Interf i2 = b::m3;
        i2.m1();
    }
}
