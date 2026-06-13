package exersices.chapter_10;

public class DynamicBinding {
    public static void main(String[] args) {
        new T().print(); 
        new E().print();
    }
}

class T {
    public void print(){
        IO.println(toString());
    }
}

class E extends T {
}
