package exersices.chapter_09;

public class RegularPolygon 
{
    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon() {
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double sideLength) {
        this.n = n;
        this.side = sideLength;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double sideLength, double x, double y) {
        this.n = n;
        this.side = sideLength;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter(){
        return getArea();
    }

    public double getArea()
    {
        double co = n * Math.pow(side, 2);
        double de = 4 * Math.tan(Math.PI / n);
        return co / de;
    }


    public static void main() {
        RegularPolygon p1 = new RegularPolygon();
        RegularPolygon p2 = new RegularPolygon(6, 4);
        RegularPolygon p3 = new RegularPolygon(10, 4, 5.6, 7.8);

        IO.println("The area of p1: " + p1.getPerimeter());
        IO.println("The area of p2: " + p2.getPerimeter());
        IO.println("The area of p3: " + p3.getPerimeter());
    }

}
