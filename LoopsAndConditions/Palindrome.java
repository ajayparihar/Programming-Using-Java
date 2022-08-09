package LoopsAndConditions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int num;
        int rem;
        int rev = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a NUMBER");
        num = scan.nextInt();
        int temp = num;
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if (rev == temp) {
            System.out.println(temp + " is a PALINDROME");
        } else {
            System.out.println(temp + " is NOT a PALINDROME");
        }
        scan.close();
    }
}
