import java.util.Scanner;

public class LcmOf2Nos {
    public static void main(String[] args) {
        int num1;
        int num2;
        int max;
        int min;
        int lcm = 1;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the FIRST Number");
        num1 = scan.nextInt();

        System.out.println("Enter the SECOND Number");
        num2 = scan.nextInt();


        if (num1 >= num2) {
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }


        if ((num1 % num2) == 0 || (num2 % num1) == 0) {
            if (max == num1) {
                System.out.println(num1);
            } else if (max == num2) {
                System.out.println(num2);
            }
        } else {
            for (int i = 1; i <= max; i++) { // i=1 to max number
                int mul = min * i;
                if ((mul % max) == 0) {
                    lcm = mul;
                    break;
                }
            }
            System.out.println(lcm);
        }
        scan.close();
    }
}
