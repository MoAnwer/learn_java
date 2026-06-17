package exersices.chapter_02;

public class DistanceOfTwoPoints {
    public static void main(String[] args) {
        double distance = distance(
                Double.valueOf(IO.readln("Enter x1: ")),
                Double.valueOf(IO.readln("Enter x2: ")),
                Double.valueOf(IO.readln("Enter y1: ")),
                Double.valueOf(IO.readln("Enter y2: ")));
        IO.println("The distance between the two points is " + distance);

    }


    /**
     * (Geometry: distance of two points) Write a program that prompts the user to
     * enter two points (x1, y1) and (x2, y2) and displays their distance between them.
     * The formula for computing the distance is 2(x2 - x1)2 + (y2 - y1)2. Note that
     * you can use Math.pow(a, 0.5) to compute 2a
     * 
     * @param x1
     * @param x2
     * @param y1
     * @param y2
     * @return result
     */
    public static double distance(double x1, double x2, double y1, double y2) {
        double x = Math.pow((x2 - x1), 2);
        double y = Math.pow((y2 - y1), 2);
        double result = Math.pow(x + y, 0.5);
        return result;
    }
}
