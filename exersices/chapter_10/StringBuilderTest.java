package exersices.chapter_10;

public class StringBuilderTest {

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Java");
        StringBuilder s2 = new StringBuilder("HTML");
        s1.append(" is fun"); // Java is fun
        s1.append(s2); // Java is funHTML
        IO.println(s1.insert(2, "is fun")); // Jais funva is funHTML
        IO.println(s1.insert(1, s2)); // JHTMLais funva is funHTML
        IO.println(s1.length()); // T
        IO.println(s1.deleteCharAt(3)); // JHTLais funva is funHTML
        IO.println(s1.delete(1, 3)); // JLais funva is funHTML
        IO.println(s1.reverse()); // LMTHnuf si avnuf siaLJ 
        IO.println(s1.replace(1, 3, "Computer")); // LComputerHnuf si avnuf siaLJ 
        IO.println(s1.substring(1, 3)); // Co
        IO.println(s1.substring(2)); // omputerHnuf si avnuf siaLJ
    }
}