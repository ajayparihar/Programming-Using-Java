import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        int num;
        int sumSquare = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a NUMBER");
        num = scan.nextInt();

        String numString = String.valueOf(num);

        for (int i = 1; i < String.valueOf(num).length(); ) {
            int numTemp = Integer.parseInt(String.valueOf(numString.charAt(i)));
            int sqr = (int) (Math.pow(numTemp, 2));
            sumSquare = sumSquare + sqr;
            i = i + 2;
        }
        if ((sumSquare % 9) == 0) {
            System.out.println("The number " + num + " is a LUCKY number");
        } else {


            System.out.println("The number " + num + " is NOT a LUCKY number");
        }
        scan.close();
    }
}
