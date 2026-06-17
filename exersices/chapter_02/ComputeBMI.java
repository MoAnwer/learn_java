package exersices.chapter_02;

public class ComputeBMI {

    /**
     * (Health application: computing BMI)
     * Body Mass Index (BMI) is a measure of
     * health on weight. It can be calculated by taking your weight in kilograms and
     * dividing by the square of your height in meters. Write a program that prompts
     * the
     * user to enter a weight in pounds and height in inches and displays the BMI.
     * Note
     * that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
     * 
     * BMI = weight / sqr(height)
     * 1 pound = 0.45359237 Kg
     * 10 pounds = 0.45359237 * 10 = 4.5359237 Kg
     * weightInKg = pounds * 0.45359237;
     * 
     * heightInMeters = 0.0254 * heightInInchs
     */

    public static void main() 
    {
        double weight = Double.valueOf(IO.readln("Enter weight in pounds: "));
        double height = Double.valueOf(IO.readln("Enter height in inches: "));
        computeBMI(weight, height);
    }

    public static void computeBMI(double weightInPounds, double heightInInchs) 
    {
        double weightInKg = weightInPounds * 0.45359237;
        double heightInMeters = heightInInchs * 0.0254;
        double BMI = weightInKg / Math.pow(heightInMeters, 2);
        IO.println("BMI is " + BMI);
    }
}
