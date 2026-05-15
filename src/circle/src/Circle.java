

public class Circle {

    private String color = "red";
    private double radius = 1.0;

    // default constructor
    public Circle() {
        this.color = "red";
        this.radius = 1.0;
    }

    // first constructor
    public Circle(String color) {
        this.color = color;
    }

    // second constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // third constructor
    public Circle(String color, double radius) {
        this.radius = radius;
        this.color = color;
    }

    // set methods
    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // get methods
    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}