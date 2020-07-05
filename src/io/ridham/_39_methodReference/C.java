package io.ridham._39_methodReference;

// create thread using method reference
public class C {
    public void m1() {
        for (int i=1 ; i<=10 ; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        C c = new C();
        Runnable r = c::m1;
        Thread t = new Thread(r);
        t.start();
        for (int i=11 ; i<=20 ; i++) {
            System.out.println(i);
        }
    }
}
