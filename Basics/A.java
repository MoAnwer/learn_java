import java.util.Date;

public class A {

    public static void main() {
        Date date = new Date(1234567);
        m1(date);
        System.out.println(date.getTime());
    }

    public static void m1(Date date) {
        date = null;
    }

}

class T {
    static int i = 0;
    int j = 0;

    T() {
        i++;
        j = 1;
    }
}
