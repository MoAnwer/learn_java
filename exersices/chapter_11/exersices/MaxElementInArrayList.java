package exersices.chapter_11.exersices;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxElementInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        IO.println("Enter numbers (with space between two numbers): ");

        try (Scanner scanner = new Scanner(System.in)) {
            
            String[] s = scanner.nextLine().split(" ");

            for (String string : s) 
            {
                list.add(Integer.valueOf(string));
            }

            IO.println("The max number is : " + max(list));
        }

    }

    public static Integer max(ArrayList<Integer> list) {
        Integer max = Integer.MIN_VALUE;

        if (list == null) {
            return null;
        }

        if (list.size() <= 0) {
            return 0;
        }

        for (Integer integer : list) {
            if (max < integer) {
                max = integer;
            }
        }

        return max;
    }
}