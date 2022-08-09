import java.util.Scanner;

public class DivisibleBySum {
    public static void main(String[] args) {
        int num;
        int rem;
        int revSum = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a NUMBER");
        num = scan.nextInt();
        int temp = num;
        while (num > 0) {
            rem = num % 10;
            revSum = revSum + rem;
            num = num / 10;
        }
        if ((temp % revSum) == 0) {
            System.out.println(temp + " is DIVISIBLE by SUM of its Digits");
        } else {
            System.out.println(temp + " is NOT DIVISIBLE by SUM of its Digits");
        }
        scan.close();
    }
}
