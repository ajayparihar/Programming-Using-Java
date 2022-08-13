package oops.constructors;

class RectanglePpt {
    public float length;
    public float width;

    double calculateArea(float len, float wid) {
        double area;
        this.length = len;
        this.width = wid;
        area = length * width;

        return area;
    }

    double calculatePerimeter(float len, float wid) {
        double per;
        this.length = len;
        this.width = wid;
        per = (length + width) * 2;

        return per;
    }
}


public class Rectangle {
    public static void main(String[] args) {
        RectanglePpt rectangle = new RectanglePpt();

        double area = rectangle.calculateArea(12, 5);
        double perimeter = rectangle.calculatePerimeter(12, 5);
        System.out.println("Area of the rectangle is " + area);
        System.out.println("Perimeter of the rectangle is " + perimeter);
    }
}
