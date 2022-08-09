package LoopsAndConditions;

import java.util.Scanner;

public class StarPatternDescending {
    public static void main(String[] args) {

        int num;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a NUMBER");
        num = scan.nextInt();

        for (int i = num; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        scan.close();
    }
}
