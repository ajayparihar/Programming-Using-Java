package LoopsAndConditions;

import java.util.Scanner;

public class SeedNumber {
    public static void main(String[] args) {
        int num1;
        int num2;
        int rem;
        int revProd = 1;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the FIRST NUMBER");
        num1 = scan.nextInt();

        System.out.println("Enter the SECOND NUMBER");
        num2 = scan.nextInt();
        int temp = num1;

        while (num1 > 0) {
            rem = num1 % 10;
            revProd = revProd * rem;
            num1 = num1 / 10;
        }
        if ((num2 % (revProd * temp)) == 0) {
            System.out.println(temp + " is a SEED of " + num2);
        } else {
            System.out.println(temp + " is NOT a SEED of " + num2);
        }
        scan.close();
    }
}
