package io.ridham._39_methodReference;

public class D {
    D() {
        System.out.println("D() - no-arg constructor");
    }

    // Constructor reference
    // By using constructor reference we could implement method from constructor
    public static void main(String[] args) {
        Interf2 i = D::new;
        D d = i.get();
    }
}
