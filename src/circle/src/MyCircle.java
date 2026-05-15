

public class MyCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // default object
        Circle c = new Circle();

        // first object
        Circle c1 = new Circle("red");

        // radius object
        Circle c2 = new Circle(2.0);

        // radius and color
        Circle c3 = new Circle("blue", 3.0);

        MyCircle mycircle = new MyCircle();

        // access the method
        mycircle.displayInfo(c, "The value of circle with default constructor");
        mycircle.displayInfo(c1, "The value of first constructor");
        mycircle.displayInfo(c2, "The value of second constructor");
        mycircle.displayInfo(c3, "The value of third constructor");
    }

    public void displayInfo(Circle c1, String name) {

        System.out.println(name);
        System.out.println("The color of the circle is " + c1.getColor());
        System.out.println("The radius of the circle is " + c1.getRadius());

        // print radius
        System.out.println("The radius of the circle is " + c1.getRadius());

        // print perimeter
        System.out.println("The perimeter of the circle is " + c1.calculatePerimeter());

        // print area
        System.out.println("The area of the circle is " + c1.calculateArea());

        System.out.println("-----------------------------------");
    }
}