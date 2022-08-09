package LoopsAndConditions;

import java.util.Scanner;

public class PlayWith7 {

    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter FIRST NUMBER");
        num1 = scan.nextInt();

        System.out.println("Enter SECOND NUMBER");
        num2 = scan.nextInt();

        System.out.println("Enter THIRD NUMBER");
        num3 = scan.nextInt();

        if (num1 == 7 || num2 == 7 || num3 == 7) {
            if (num1 == 7) {
                System.out.println("Output is:- " + num2 * num3);
            } else if (num2 == 7) {
                System.out.println("Output is:- " + num3);
            } else if (num3 == 7) {
                System.out.println("Output is:- " + "-1");
            }
        } else if (num1 != 7 && num2 != 7 && num3 != 7) {
            System.out.println(num1 * num2 * num3);
        }
    }
}
