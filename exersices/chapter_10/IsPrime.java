package exersices.chapter_10;

public class IsPrime {
    public static void main(String[] args) {
        for (int i = 1; i <= 120; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        return n % 2 == 0 ? false : true;
    }

}
