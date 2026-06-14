package exersices.chapter_11.exersices;

import java.util.ArrayList;

/**
 * Write a program that randomly fills in 0s and 1s 
 * into an n-by-n matrix, prints the matrix, 
 * and finds the rows and columns with the most 1s
 */

public class LargestRowsAndColumns {

    public static void main(String[] args) {

        // ask user to enter size n
        int n = Integer.parseInt(IO.readln("Enter the array size n: "));
        
        //create arr[n][n]
        int[][] arr = generateRandomBinaryMatrix(n);

        // Use two ArrayLists to store the row and column indices with the most 1s
        ArrayList<Integer> columnOnes = new ArrayList<>();


        // Use to compare the max number of 1s row-by-row
        int maxInRow = Integer.MIN_VALUE;
        int maxInColumn = Integer.MIN_VALUE;

        // The indexes of largest dimention contain 1s
        int rowIndex = -1;
        int columnIndex = -1;

        // 
        int sumOfOnesInRow = 0;
        int sumOfOnesInColumn = 0;

        for (int i = 0; i < arr.length; i++) {

            sumOfOnesInRow = sumOfOnes(arr[i]);

            // Check row that contain max number of ones
            if (maxInRow < sumOfOnesInRow) 
            {
                maxInRow = sumOfOnesInRow;

                // store the index of the row contain max number of ones
                rowIndex = i;
            }                

            for (int j = 0; j < arr[i].length; j++) {
                columnOnes.add(arr[j][i]);
            }

            // Calculate the sum of ones in column
            sumOfOnesInColumn = sumOfOnes(columnOnes);

            // Check row that contain max number of ones
            if (maxInColumn <= sumOfOnesInColumn) {

                maxInColumn = sumOfOnesInColumn;

                // store the index of the row contain max number of ones   
                columnIndex = i;
            }

            // clear columns items to recive new column items in next iteration
            columnOnes.clear();         
        }
        
        printMatrix(arr);

        IO.println("The largest row index : " + rowIndex);
        IO.println("The largest column index: " + columnIndex);

    }


    public static int sumOfOnes(ArrayList<Integer> nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i == 1 ? i : 0;
        }
        return sum;
    }

    public static int sumOfOnes(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i == 1 ? i : 0;
        }
        return sum;
    }

    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                IO.print(arr[i][j]);
            }
            IO.println();
        }
    }

    static int[][] generateRandomBinaryMatrix(int n) 
    {
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)((0) + (int) (Math.random() * 2));
            }
        }
        return arr;
    }
    
}
