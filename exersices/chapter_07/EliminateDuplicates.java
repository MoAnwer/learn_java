package exersices.chapter_07;

import java.util.Arrays;

public class EliminateDuplicates {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 2, 1, 6, 3, 4, 5, 2};
        IO.println("The distinct numbers are: " + Arrays.toString(eliminateDuplicates(arr)));

    }

    public static int[] eliminateDuplicates(int... list) {
        int[] temp = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            int ele = list[i];
            int count = 0;
            for (int j = 0; j < list.length; j++) {
                if (ele == list[j]) {
                    count++;
                    if (count >= 2) {
                        count = 0;
                        continue;
                    }
                    temp[j] = list[j];
                }
            }
        }
        return temp;
    }
}
