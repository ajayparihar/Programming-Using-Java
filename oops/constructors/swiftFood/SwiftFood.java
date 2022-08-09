package constructors.swiftFood;

public class SwiftFood {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Jacob", 5648394590L, "13th Street, New York");

        System.out.println("Displaying customer details");
        System.out.println(customer1.customerId);
        System.out.println(customer1.customerName);
        System.out.println(customer1.contactNumber);
        System.out.println(customer1.address);

        Order order1 = new Order(101, "Spinach Alfredo Pasta", "Ordered");

        System.out.println("Order details");
        System.out.println(order1.orderId);
        System.out.println(order1.orderedFoods);
        System.out.println(order1.status);
        System.out.println(order1.calculateTotalPrice(35));


        Restaurant rest1 = new Restaurant("McDonalds's", 9988676767l, "SH1109, Carolina Street, Springfield", 4.1f);
        rest1.displayRestaurantDetails();
    }
}
