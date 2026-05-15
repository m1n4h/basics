public class RectangleDriver {
    public static void main(String[] args) {
        // 1.  To create four objects using different constructors
        // object with default constructor
        Rectangle r1 = new Rectangle();
        // color only
        Rectangle r2 = new Rectangle("blue");

        // object with the length and width
        Rectangle r3 = new Rectangle(5.0, 2.0);

        // the object with color, length and width
        Rectangle r4 = new Rectangle("black", 10.0, 4.0);



        // 2. Use mutators to modify some objects (Requirement 'b')
        r1.setColour("green");
        r1.setLength(9.0);
        r1.setWidth(3.0);



        // 3. Display details for each rectangle
        System.out.println("Rectangle Details Summary:");
        System.out.println("-----");

        displayRectangle(r1, "Object 1 (Modified Default)");
        displayRectangle(r2, "Object 2 (String Constructor)");
        displayRectangle(r3, "Object 3 (Double Constructor)");
        displayRectangle(r4, "Object 4 (Full Constructor)");
    }


    // Helper method to display info cleanly
    public static void displayRectangle(Rectangle r, String label) {
        System.out.println(label + ":");
        System.out.println("   Colour: " + r.getColour());
        System.out.println("   Length: " + r.getLength());
        System.out.println("   Width:  " + r.getWidth());
        System.out.println("   Area:   " + r.calculateArea());
        System.out.println("   Perim:  " + r.calculatePerimeter());
        System.out.println();
    }
}