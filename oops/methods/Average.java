package oops.methods;

import java.util.Scanner;

class Calculator {

    public double findAverage(double num1, double num2, double num3) {
        double avg = (num1 + num2 + num3) / 3;
        return avg;
    }
}

class Average {

    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter FIRST Number");
        double num1 = scan.nextDouble();
        System.out.println("Enter SECOND Number");
        double num2 = scan.nextDouble();
        System.out.println("Enter THIRD Number");
        double num3 = scan.nextDouble();
        double average = calculator.findAverage(num1, num2, num3);

        System.out.println(Math.round(average * 100.0) / 100.0);
        scan.close();
    }
}