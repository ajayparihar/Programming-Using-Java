import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        double f;
        double c;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the TEMPERATURE in FAHRENHEIT");
        f = scan.nextDouble();

        c = ((f - 32) / 9) * 5;

        System.out.println(f + " Fahrenheit is " + Math.round(c * 100.00) / 100.00 + " Celsius");
        scan.close();
    }
}
