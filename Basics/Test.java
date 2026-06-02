import java.util.*;

public class Test {
    public void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        // double i = 50.0;
        // double k = i + 50.0;
        // double j = k + s.nextDouble();
        // System.out.println("j is " + j + " and k is " + k);
        // int i = k + 2;
        // for (int i = 0; i < 14; i++) {
        // IO.print((char)('\u2764' + Math.random() * ('\u2764' - '\u2764' + 1)));
        // }

        Object obj = true ? 'A' : 1.0;
        System.out.println(obj.getClass().getSimpleName());


    }

    public void checkScope() {
        int x;
        boolean condition = false;
        if (condition) {
            x = 10;
        }
        System.out.println(x);
    }
}