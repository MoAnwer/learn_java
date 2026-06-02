package exersices.chapter_09;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getDiscriminant() {
        return Math.pow(getB(), 2) - ((4 * a) * c);
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    double getRoot1() {
        if (isNagative())
            return 0;
        return -getB() + Math.sqrt(getDiscriminant()) / 2 * getA();
    }

    double getRoot2() {
        if (isNagative())
            return 0;
        return -getB() - Math.sqrt(getDiscriminant()) / 2 * getA();
    }

    boolean isNagative() {
        boolean isNagative = false;
        if (getDiscriminant() < 0)
            isNagative = true;
        return isNagative;
    }

    public static void main() {
        try {
            QuadraticEquation q = new QuadraticEquation(
                    Double.parseDouble(IO.readln("Enter value of a: ")),
                    Double.parseDouble(IO.readln("Enter value of b: ")),
                    Double.parseDouble(IO.readln("Enter value of c: "))
            );

            if (q.isNagative()) {
                IO.println("the root is 0");
            }

            else {
                IO.println("The root 1 = " + q.getRoot1());
                IO.println("The root 2 = " + q.getRoot2());
            }

        } catch (NumberFormatException e) {
            IO.println("Invalid number, please enter valid number");
            QuadraticEquation.main();
        }
    }
}
