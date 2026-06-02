package exersices.chapter_07;


public class processingArrays {
    public static void main(String[] args) {
        int x = 30;
        int[] numbers = new int[x];
        x = 60;
        System.out.println("x is " + x);
        System.out.println("The size of numbers is " + numbers.length);
    }

    public static void onePrint() {
        char[] city = { 'D', 'a', 'l', 'l', 'a', 's' };
        System.out.println(city);
    }

    public static int largestElement(int... myList) {
        int max = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (max < myList[i]) {
                max = myList[i];
            }
        }
        return max;
    }

    public static int indexOflargestElement(int... myList) {
        int max = myList[0];
        int indexOfLargestElement = 0;

        for (int i = 0; i < myList.length; i++) {
            if (max < myList[i]) {
                max = myList[i];
                indexOfLargestElement = i;
            }
        }
        return indexOfLargestElement;
    }

    public static int[] shifting(int... list) {
        int temp = list[0];

        for (int i = 1; i < list.length; i++) {
            list[i - 1] = list[i];
        }

        list[list.length - 1] = temp;
        return list;
    }

    public static int[] shuffling(int... list) {
        for (int i = list.length - 1; i > 0; i--) {

            int j = (int) (Math.random() * (i + 1));

            int temp = list[i];
            list[i] = list[j];
            temp = list[j];
        }
        return list;
    }

    public static double[] shuffling(double... list) {
        for (int i = list.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            double temp = list[i];
            list[i] = list[j];
            temp = list[j];
        }
        return list;
    }
}
