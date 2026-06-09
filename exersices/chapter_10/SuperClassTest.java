package exersices.chapter_10;

class SuperClass {
    int value = 5;

    public SuperClass() {
        show();
    }

    public void show() {
        System.out.println("SuperClass value = " + value);
    }
}

class SubClass extends SuperClass {
    int value = 50;

    public void show() {
        System.out.println("SubClass value = " + value);
    }
}

public class SuperClassTest {
    public static void main(String[] args) {
        new SubClass();
    }
}
