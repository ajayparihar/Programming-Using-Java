package oops.constructors.swiftFood;

public class Restaurant {

    public String restaurantName;
    public long restaurantContact;
    public String restaurantAddress;
    public float rating;


    public Restaurant(String restName, long restContact, String restAddress, float rating) {
        this.restaurantName = restName;
        this.restaurantContact = restContact;
        this.restaurantAddress = restAddress;
        this.rating = rating;
    }

    public void displayRestaurantDetails() {
        System.out.println("Restaurant Details");
        System.out.println("*******************************");

        System.out.println(restaurantName);
        System.out.println(rating);
        System.out.println(restaurantContact);
        System.out.println(restaurantAddress);
    }

}
