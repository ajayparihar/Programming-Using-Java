import java.util.Scanner;

public class GeometricSequence {
    public static void main(String[] args) {
        int num;
        int seq = 1;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the NUMBER");
        num = scan.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print(seq);

            seq = seq * 2;
            if (i == num - 1) {
                break;
            } else {
                System.out.print(", ");
            }
        }
        scan.close();
    }
}
