package exersices.chapter_09;

public class LinearEquation 
{
    private double a, b, c, d, e, f;

    public LinearEquation(double a, double b, double c, double d, double e, double f)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public boolean isSolvable()
    {
        boolean result = false;

        double de = (a * d) - (b * c);

        if (0 != de) {
            result = true;
        }

        return result;
    }

    public double getX() 
    {
        double x = 0;

        if (isSolvable()) {
            x =  ((e * d) - (b * f)) / ((a * d) - (b * c));    
        }

        return x;
    }

    public double getY() 
    {
        double y = 0;

        if (isSolvable()) {
            y =  ((a * f) - (e * c)) / ((a * d) - (b * c));
        }

        return y;
    }

    public static void main()
    {
        LinearEquation equation = new LinearEquation(
            Double.parseDouble(IO.readln("Enter a: ")),
            Double.parseDouble(IO.readln("Enter b: ")),
            Double.parseDouble(IO.readln("Enter c: ")),
            Double.parseDouble(IO.readln("Enter d: ")),
            Double.parseDouble(IO.readln("Enter e: ")),
            Double.parseDouble(IO.readln("Enter f: "))
        );

        if (!equation.isSolvable()) {
            IO.println("The equation has no solution.");
        }
        else {
            IO.println("The value of X: " + equation.getX());
            IO.println("The value of Y: " + equation.getY());
        }
    }
}
