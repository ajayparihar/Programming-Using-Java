package LoopsAndConditions;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        double rate;
        double principal;
        double time;
        double simpleInterest;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the PRINCIPAL Amount");
        principal = scan.nextDouble();

        System.out.println("Enter the RATE");
        rate = scan.nextDouble();

        System.out.println("Enter the TIME");
        time = scan.nextDouble();

        simpleInterest = (principal * rate * time) / 100;
        System.out.println("SIMPLE INTEREST is:- " + Math.round(simpleInterest * 100.00) / 100.00);

        scan.close();

    }
}
