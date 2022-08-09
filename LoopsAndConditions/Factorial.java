import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int num;
        int factorial = 1;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the NUMBER");
        num = scan.nextInt();
        for (int i = 2; i <= num; i++) {
            factorial = factorial * i;
            System.out.println(factorial);
        }
        System.out.println("FACTORIAL of " + num + " is:- " + factorial);

        scan.close();
    }
}
