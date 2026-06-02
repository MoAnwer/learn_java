package exersices.chapter_07;

public class AnalyzeNumbers {
    public static void main(String[] args) {
        int n = Math.abs(Integer.parseInt(IO.readln("Enter the number of items: ")));

        double[] numbers = new double[n];

        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            double number = Double.parseDouble(IO.readln("Enter number " + (i + 1) + " : "));
            numbers[i] = number;
            sum += number;
        }

        double avg = sum / n;

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > avg) {
                count += 1;
            }    
        }

        IO.println("Average is " + avg);
        IO.println("Number of elements above the average is " + count);

    }
}
