import java.util.Scanner;

public class MaxOf3 {
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

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("GREATEST among " + num1 + ", " + num2 + " and " + num3 + " is:- " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("GREATEST among " + num1 + ", " + num2 + " and " + num3 + " is:- " + num2);
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println("GREATEST among " + num1 + ", " + num2 + " and " + num3 + " is:- " + num3);
        }
        scan.close();
    }
}
