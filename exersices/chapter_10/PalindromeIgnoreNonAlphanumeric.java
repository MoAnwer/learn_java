package exersices.chapter_10;

public class PalindromeIgnoreNonAlphanumeric {

    public static void main(String[] args) 
    {
        String s = new String(IO.readln("Enter a string : "));
        IO.println("Ignoring nonalphanumeric characters, \n is " + s + " a palindrome ? "  + isPalindrome(filter(s.toString())));
    }

    public static StringBuilder filter(String s)
    {
        StringBuilder newString = new StringBuilder();

        char[] chars = s.toCharArray();

        for (char c : chars) {
            if (Character.isLetterOrDigit(c)) {
                newString.append(Character.toLowerCase(c));
            }
        }

        return newString;
    }

    public static boolean isPalindrome(StringBuilder s) 
    {
        return new StringBuilder(s).reverse().compareTo(new StringBuilder(s)) == 0 ? true : false;
    }

    /**
     * Checks whether the given character is an ASCII alphabetic character (A-Z or a-z).
     *
     * @param c the character to check
     * @return true if c is an ASCII letter, false otherwise
     * @deprecated This method is limited to ASCII letters. Use {@link Character#isLetter(char)}
     *             or {@link Character#isLetterOrDigit(char)} for a more general Unicode-aware check.
     */
    @Deprecated
    public static boolean isChar(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
}