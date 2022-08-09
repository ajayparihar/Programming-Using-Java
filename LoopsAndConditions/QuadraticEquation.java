package LoopsAndConditions;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        int a;
        int b;
        int c;

        double discriminant;
        double root1;
        double root2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter \"a\"");
        a = scan.nextInt();

        System.out.println("Enter \"b\"");
        b = scan.nextInt();

        System.out.println("Enter \"c\"");
        c = scan.nextInt();

        discriminant = ((b * b) - (4 * a * c));

        root1 = ((-b) + discriminant) / (2 * a);
        root2 = ((-b) - discriminant) / (2 * a);

        if (discriminant == 0) {
            System.out.println("The ROOT is:- " + root1);
        } else if (discriminant > 0) {
            System.out.println("The ROOTS are:- " + root1 + " and " + root2);
        } else {
            System.out.println("The equation has no real root");
        }
        scan.close();
    }
}
