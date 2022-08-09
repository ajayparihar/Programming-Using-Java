package LoopsAndConditions;

import java.util.Scanner;

public class NoteOf5And1 {
    public static void main(String[] args) {
        int noteOne;
        int noteFive;
        int totalAmount;


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter No of 1$ Notes");
        noteOne = scan.nextInt();

        System.out.println("Enter No of 5$ Notes");
        noteFive = scan.nextInt();

        System.out.println("Enter PURCHASE AMOUNT");
        totalAmount = scan.nextInt();

        int reqFive = totalAmount / 5;
        int reqOne = totalAmount - (reqFive * 5);
        System.out.println(reqFive);
        System.out.println(reqOne);

        if (reqFive <= noteFive && reqOne <= noteOne) {
            System.out.println("$1 notes needed = " + reqOne);
            System.out.println("$5 notes needed = " + reqFive);

        } else {
            System.out.println("-1");
        }
        scan.close();
    }
}
