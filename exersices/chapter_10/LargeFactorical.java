package exersices.chapter_10;

import java.math.BigInteger;

public class LargeFactorical {
    public static void main(String[] args) {
        // System.out.println("10000! is \n" + factorial(10000));
        java.math.BigInteger x = new java.math.BigInteger("3");
        java.math.BigInteger y = new java.math.BigInteger("7");
        java.math.BigInteger z = x.add(y);
        System.out.println("x is " + x); // 3
        System.out.println("y is " + y); // 7
        System.out.println("z is " + z); // 10

    }

    public static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(new BigInteger(i + ""));
        }
        return result;
    }
}
