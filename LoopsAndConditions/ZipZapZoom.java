package LoopsAndConditions;

import java.util.Scanner;

public class ZipZapZoom {

    public static void main(String[] args) {

        int input;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a NUMBER");
        input = scan.nextInt();

        if ((input % 3) == 0 && (input % 5) != 0) {
            System.out.println("Zip");
        } else if ((input % 3) != 0 && (input % 5) == 0) {
            System.out.println("Zap");
        } else if ((input % 3) == 0 && (input % 5) == 0) {
            System.out.println("Zoom");
        } else {
            System.out.println("Invalid");
        }
        scan.close();
    }
}
