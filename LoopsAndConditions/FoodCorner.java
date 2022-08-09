import java.util.Scanner;

public class FoodCorner {
    public static void main(String[] args) {
        char foodType;
        int totalPrice;
        int distance;
        int foodQuantity;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter FOOD TYPE:- \"V\" for Veg, \"N\" for Non-Veg");
        foodType = scan.next().charAt(0);

        System.out.println("Enter the QUANTITY of FOOD");
        foodQuantity = scan.nextInt();

        System.out.println("Enter the DELIVERY DISTANCE");
        distance = scan.nextInt();
        if (foodQuantity <= 0) {
            System.out.println("Minimum Order Quantity is 1");
            System.out.println("BILL AMOUNT is -1");
        } else {
            if (distance <= 0) {
                System.out.println("Distance must be greater than 0");
                System.out.println("BILL AMOUNT is -1");
            } else {
                if (foodType == 'V' || foodType == 'v') {
                    if (distance <= 3) {
                        totalPrice = 12 * foodQuantity;
                        System.out.println("BILL AMOUNT is:- " + totalPrice);
                    } else if (distance <= 6) {
                        distance = distance - 3;
                        totalPrice = 12 * foodQuantity + (distance);
                        System.out.println("BILL AMOUNT is:- " + totalPrice);
                    } else {
                        distance = distance - 6;
                        totalPrice = 12 * foodQuantity + 3;
                        totalPrice = totalPrice + (distance * 2);
                        System.out.println("BILL AMOUNT is:- " + totalPrice);
                    }
                } else if (foodType == 'N' || foodType == 'n') {
                    if (distance <= 3) {
                        totalPrice = 15 * foodQuantity;
                        System.out.println("BILL AMOUNT is:- " + totalPrice);
                    } else if (distance <= 6) {
                        distance = distance - 3;
                        totalPrice = 15 * foodQuantity + (distance);
                        System.out.println("BILL AMOUNT is:- " + totalPrice);
                    } else {
                        distance = distance - 6;
                        totalPrice = 15 * foodQuantity + 3;
                        totalPrice = totalPrice + (distance * 2);
                        System.out.println("BILL AMOUNT is:- " + totalPrice);
                    }
                } else {
                    System.out.println("Invalid Food Type!!!");
                }
            }
        }
        scan.close();
    }
}
