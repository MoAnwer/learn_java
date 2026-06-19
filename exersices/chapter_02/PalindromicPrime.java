package exersices.chapter_02;

public class PalindromicPrime {
    public static void main(String[] args) {
        run();
    }

    /**
     * (Palindromic prime) A palindromic prime is a prime number and also
     * palindromic.
     * For example, 131 is a prime and also a palindromic prime, as are 313 and 757.
     * Write a program that displays the first 100 palindromic prime numbers.
     * Display 10 numbers per line, separated by exactly one space, as follows:
     */
    public static void run() {
        int elementsPerLine = 1, iterations = 0;

        for (int i = 1; i < 100000; i++) {

            if (isPrime(i) && isPalindromic(i)) {

                // to check the displayed numbers is first 100 prime number
                if (iterations >= 100)
                    break;

                IO.print(i + "\s");

                // print 10 numbers per line and move to next line
                if (elementsPerLine >= 10) {
                    IO.println("");
                    elementsPerLine = 0;
                }

                elementsPerLine++;

                iterations++;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromic(int number) {
        return number == reverse(number);
    }

    public static int reverse(int number) {
        StringBuilder builder = new StringBuilder();
        int ext = 0;
        while (number != 0) {
            ext = (int) (number % 10);
            number = (int) (number) / 10;
            builder.append(ext);
        }
        return Integer.parseInt(builder.toString());
    }

}
