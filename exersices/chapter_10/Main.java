package exersices.chapter_10;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        // Integer x = new Integer(3);
        Double x = 3.5;
        System.out.println(x.intValue());
        System.out.println(x.compareTo(4.5));

        BigDecimal a = new BigDecimal(1.0);
        BigDecimal b = new BigDecimal(3);
        BigDecimal c = a.divide(b, 2, BigDecimal.ROUND_UP);
        IO.println(c);

    }
}
