package exersices.chapter_06;

/**
 * (Financial: credit card number validation) Credit card numbers follow certain
 * patterns. A credit card number must have between 13 and 16 digits. It must
 * start with:
 * ■ 4 for Visa cards
 * ■ 5 for Master cards
 * ■ 37 for American Express cards
 * ■ 6 for Discover cards
 * In 1954, Hans Luhn of IBM proposed an algorithm for validating credit card
 * numbers. The algorithm is useful to determine whether a card number is
 * entered
 * correctly or whether a credit card is scanned correctly by a scanner. Credit
 * card
 * numbers are generated following this validity check, commonly known as the
 * Luhn check or the Mod 10 check, which can be described as follows (for
 * illustra-
 * tion, consider the card number 4388576018402626):
 * 1. Double every second digit from right to left. If doubling of a digit
 * results in a
 * two-digit number, add up the two digits to get a single-digit number.
 * 
 * 1. Double every second digit from right to left. If doubling of a digit
 * results in a
 * two-digit number, add up the two digits to get a single-digit number.
 * 
 * 2. Now add all single-digit numbers from Step 1.
 * 4 + 4 + 8 + 2 + 3 + 1 + 7 + 8 = 37
 * 
 * 3. Add all digits in the odd places from right to left in the card number.
 * 6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 38
 *
 * 4. Sum the results from Step 2 and Step 3.
 * 37 + 38 = 75
 * 
 * 5. If the result from Step 4 is divisible by 10, the card number is valid;
 * otherwise,
 * it is invalid. For example, the number 4388576018402626 is invalid, but the
 * number 4388576018410707 is valid.
 * 
 * Write a program that prompts the user to enter a credit card number as a long
 * integer. Display whether the number is valid or invalid. Design your program
 * to
 
    public static boolean isValid(String number) {
        if (number == null)
            return false;

        number = number.replaceAll("[\\s-]", "");

        if (number.length() < 13 || number.length() > 16)
            return false;

        if (!(number.startsWith("4") || number.startsWith("5") ||
                number.startsWith("6") || number.startsWith("37")))
            return false;

        int sum = 0;
        boolean doubleDigit = false;

        for (int i = number.length() - 1; i >= 0; i--) {
            int digit = number.charAt(i) - '0';

            if (doubleDigit) {
                digit *= 2;
                if (digit > 9)
                    digit -= 9;
            }

            sum += digit;
            doubleDigit = !doubleDigit;
        }

        return sum % 10 == 0;
    }

 */
public class CreditCardNumberValidation {


    public static void main(String[] args) {
        String creditCard = String.valueOf(IO.readln("Enter a credit card number as a long integer: "));
        if (isValid(creditCard)) {
            IO.println(creditCard + " is valid");
        } else {
            IO.println(creditCard + " is invalid");
        }
    }

    /** Return true if the card number is valid */
    public static boolean isValid(String number) {
        if (prefixMatched(number, 4) ||
                prefixMatched(number, 5) ||
                prefixMatched(number, 6) ||
                prefixMatched(number, 37)) {
            if (getSize(number)) {
                int result = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
                return result % 10 == 0;
            }
        }
        return false;

    }

    /** Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(String number) {
        int sum = 0;
        try {
            String[] numbers = number.split("");
            // add every second digit to string
            for (int i = numbers.length - 2; i >= 0; i -= 2)
                sum += getDigit(Integer.parseInt(numbers[i]) * 2);
        } catch (NullPointerException e) {
            IO.println("Credit card number can not be empty !");
        }

        return sum;
    }

    /**
     * Return this number if it is a single digit, otherwise, return the sum of
     * the two digits
     */
    public static int getDigit(int number) {
        int extracted = 0, sum = 0;
        if (number < 10) {
            return number;
        }
        while (number != 0) {
            extracted = (int) (number % 10);
            number = (int) (number / 10);
            sum += extracted;
        }
        return sum;
    }

    /** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(String number) {

        int sum = 0;

        try {
            String[] numbers = number.split("");

            // add every odd digit to string
            for (int i = numbers.length - 1; i >= 0; i -= 2) {
                sum += Integer.parseInt(numbers[i]);
            }

        } catch (NullPointerException e) {
            IO.println("Credit card number can not be empty !");
        }

        return sum;
    }

    /** Return true if the digit d is a prefix for number */
    public static boolean prefixMatched(String number, int d) {
        try {
            if (number.startsWith(String.valueOf(d))) {
                return true;
            }
        } catch (NullPointerException e) {
            IO.println("Credit card cannot be empty !");
        }
        return false;
    }

    public static boolean getSize(String number) {
        return number.length() >= 13 && number.length() <= 16;
    }
}
