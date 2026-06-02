package exersices.chapter_09;

public class IntersectingPoint 
{
    static double a, b, c, d, e, f, x1, y1, x2, y2, x3, y3, x4, y4;
    
    public static void main() 
    {

        x1 = Double.parseDouble(IO.readln("Enter x1: "));
        y1 = Double.parseDouble(IO.readln("Enter y1: "));
        x2 = Double.parseDouble(IO.readln("Enter x2: "));
        y2 = Double.parseDouble(IO.readln("Enter y2: "));
        x3 = Double.parseDouble(IO.readln("Enter x3: "));
        y3 = Double.parseDouble(IO.readln("Enter y3: "));
        x4 = Double.parseDouble(IO.readln("Enter x4: "));
        y4 = Double.parseDouble(IO.readln("Enter y4: "));
        
        a = y1 - y2;
        b = x1 - x2;
        c = y3 - y4;
        d = x3 - x4;
        e = (a * x1) - (b * y1);
        f = (c * x3) - (d * y3);

        LinearEquation e1 = new LinearEquation(a, b, c, d, e, f);

        if (!e1.isSolvable()) {
            IO.println("The two lines are parallel");
        }
        else {
            System.out.println("The intersecting point is at (" + e1.getX() + ", " + e1.getY() + ")");
        }

        /*
            (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
            (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
        */
    }    
}
