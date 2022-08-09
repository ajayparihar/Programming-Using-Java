package LoopsAndConditions;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        final float PI = 3.14f;
        double radius;
        double area;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the RADIUS");
        radius = scan.nextDouble();

        area = radius * radius * PI;

        System.out.println("Area of the CIRCLE is:- " + Math.round(area * 100.00) / 100.00);

        scan.close();
    }
}
