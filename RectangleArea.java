

class RectangleArea {

    double  length;
    double width;

    RectangleArea(double  length, double  width) {
        this.length = length;
        this.width = width;
        display();
    }
    
    void display() {
        double  area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    }
}