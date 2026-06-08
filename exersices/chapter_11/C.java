package exersices.chapter_11;

// public class Apple extends Fruit {
//     Apple() {
//         super("");
//     }
// }

// class Fruit {
//     public Fruit(String name) {
//         System.out.println("Fruit's constructor is invoked");
//     }
// }

class A {
    public A() {
        IO.println("hello from A class");
    }

    public A(int x) {
    }
}

class B extends A {
    public B() {        // super(0);
    }
}

public class C {
    public static void main(String[] args) {
        B b = new B();
    }
}