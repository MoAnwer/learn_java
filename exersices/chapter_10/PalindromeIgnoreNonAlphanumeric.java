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
            if (isChar(c)) {
                newString.append(c);
            }
        }

        return newString;
    }

    public static boolean isPalindrome(StringBuilder s) 
    {
        return new StringBuilder(s).reverse().compareTo(new StringBuilder(s)) == 0 ? true : false;
    }

    public static boolean isChar(char c)
    {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') ? true : false;
    }
}