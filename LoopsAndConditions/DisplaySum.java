import java.util.Scanner;

public class DisplaySum {
    public static void main(String[] args) {
        int num1;
        int num2;
        int sum;
        int doubleSum;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter FIRST NUMBER");
        num1 = scan.nextInt();

        System.out.println("Enter SECOND NUMBER");
        num2 = scan.nextInt();

        if (num1 == num2) {
            sum = num1 + num2;
            System.out.println("Both the NUMBERS are same...");
            System.out.println("here is their Sum:- " + sum);
        } else {
            doubleSum = (num1 + num2) * 2;
            System.out.println("Both the NUMBERS are NOT same...");
            System.out.println("here is their Double of Sum:- " + doubleSum);
        }
        scan.close();
    }
}

