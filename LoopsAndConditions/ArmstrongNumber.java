package LoopsAndConditions;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num;
        int rem;
        int revProdSum = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a NUMBER");
        num = scan.nextInt();

        int temp = num;
        int len = String.valueOf(num).length();

        while (num > 0) {
            rem = (int) Math.pow(num % 10, len);
            revProdSum = revProdSum + rem;
            num = num / 10;
        }
        if (revProdSum == temp) {
            System.out.println(temp + " is an ARMSTRONG Number");
        } else {
            System.out.println(temp + " is NOT an ARMSTRONG Number");
        }
        scan.close();
    }
}
