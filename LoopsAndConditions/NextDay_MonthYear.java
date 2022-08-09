package LoopsAndConditions;

import java.util.Scanner;

public class NextDay_MonthYear {
    public static void main(String[] args) {
        int day;
        int month;
        int year;

        Scanner scan = new Scanner(System.in);

        System.out.print("Day = ");
        day = scan.nextInt();

        System.out.print("Month = ");
        month = scan.nextInt();

        System.out.print("Year = ");
        year = scan.nextInt();

        System.out.println(day + 1 + "-" + month + "-20" + year);
    }
}
