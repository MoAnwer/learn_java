package examples;

public class MultiplicationTabel {
    public static void main(String[] args) {
        
        IO.print(" ".repeat(6));
        for (int k = 1; k <= 9; k++) {
            System.out.printf("%5d",k);
        }

        IO.println(" \n" + " ".repeat(9) + "-".repeat(43));
        
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%4d |", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%5d", i * j);
            }
            IO.println("");

        }
    }
}
