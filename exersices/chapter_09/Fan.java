package exersices.chapter_09;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    String color = "blue";

    public Fan() {
    }

    public boolean isOn() {
        return on;
    }

    public Fan turnOn() {
        this.on = true;
        return this;
    }

    public Fan setOn(boolean on) {
        this.on = on;
        return this;
    }

    public int getSpeed() {
        return speed;
    }

    public Fan setSpeed(int speed) throws Exception {
        if (speed < 0) {
            throw new Exception("Speed must be grater than 0 !");
        }

        if (speed <= 3) {
            this.speed = speed;
        } else if (speed > 3) {
            this.speed = FAST;
        }
        
        return this;
    }

    public double getRadius() {
        return radius;
    }

    public Fan setRadius(double radius) {
        this.radius = radius;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Fan setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public String toString() {
        if (on) {
            return "color: " + this.color + ", speed: " + this.speed + ", radius: " + this.radius;
        } else {
            return "fan is off, color: " + this.color + ", radius: " + this.radius;
        }
    }

    public static void main(String[] args) throws Exception {
        Fan fan = new Fan();
        fan.setColor("blue")
           .setRadius(5)
           .setSpeed(5);

        IO.println("\n\n" + fan);
    }
}