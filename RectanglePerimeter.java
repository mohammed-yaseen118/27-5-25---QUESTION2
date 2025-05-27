

public class RectanglePerimeter extends RectangleArea {

    RectanglePerimeter(double length, double width) {
        super(length, width);
        displayRectanglePerimeter();
    }

    void displayRectanglePerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }

    public static void main(String[] args) {
        RectanglePerimeter rp = new RectanglePerimeter(5, 3);
    }
}
