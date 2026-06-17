package exersices.chapter_02;


public class CheckISBN {
    public static void main(String[] args) 
    {
        int x = Integer.parseInt(IO.readln("Enter number : "));
        CheckISBN.checkISBN(Integer.parseInt(String.valueOf(x), 10));
    }

    /**
     * (Business: check ISBN-10)
     * 
     * An ISBN-10 (International Standard Book Number)
     * consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a
     * checksum,
     * which is calculated from the other nine digits using the following formula:
     * 
     * (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 *
     * 9) % 11
     * 
     * If the checksum is 10, the last digit is denoted as X according to the
     * ISBN-10 convention. Write a program that prompts the user to enter the first
     * 9 digits
     * and displays the 10-digit ISBN (including leading zeros). Your program should
     * read the input as an integer.
     * 
     * @param number
     */
    public static void checkISBN(int number) 
    {        
        String ISBN = stringPadWithZeros(number, 9);

        int checksum = checksum(ISBN);

        if (checksum == 10) {
            IO.println("The ISBN-10 number is " + ISBN + "X");
        } else {
            IO.println("The ISBN-10 number is " + ISBN + checksum);
        }
    }

    /**
     * Pad start of number with zeros
     * 
     * @param number
     * @return
     */
    public static String stringPadWithZeros(int number, int totalDigits)
    {

        StringBuilder builder = new StringBuilder();

        int numberLength = String.valueOf(number).length();

        if (totalDigits - numberLength > 0) { // 123 => [digits - 3 = 6] => 000000123
            for (int i = 0; i < totalDigits - numberLength; i++) {
                builder.insert(i, 0);
            }
        }

        builder.append(number);

        return builder.toString();
    }


    /**
     * Calculate checksum of ISBN
     * 
     * @param ISBN
     * @return checksum
     */
    public static int checksum(String ISBN) 
    {
        int checksum = 0, multiplyResult =  0;

        String[] numbers = ISBN.split("");

        for (int i = 0; i < numbers.length; i++) {
            multiplyResult += Integer.parseInt(numbers[i]) * (i + 1);    
        }
        
        checksum = multiplyResult % 11;

        return checksum;
    }
}
