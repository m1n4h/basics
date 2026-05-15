public class Rectangle {
    // Private instance variables with default values
    private String colour = "yellow";
    private double length = 9.0;
    private double width = 8.0;

    // Default Constructor
    public Rectangle() {
        this.colour = "yellow";
        this.width = 1.0;
        this.length = 1.0;
    }

    // Constructor with colour(first constructor)
    public Rectangle(String colour) {
        this.colour = colour;
    }


    // Constructor with length and width(second constructor)
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Constructor with all three attributes(third constructor)
    public Rectangle(String colour, double length, double width) {
        this.colour = colour;
        this.length = length;
        this.width = width;
    }



    // Mutators (Setters)
    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }




    // Accessors (Getters)
    public String getColour() {
        return colour;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }


    // Calculation Methods
    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}