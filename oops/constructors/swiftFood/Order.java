package constructors.swiftFood;

class Order {
    public int orderId;
    public String orderedFoods;
    public double totalPrice;
    public String status;


    public Order(int id, String foodName, String status) {
        this.orderId = id;
        this.orderedFoods = foodName;
        this.status = status;
    }

    public double calculateTotalPrice(int unitPrice) {
        this.totalPrice = (unitPrice * (5 / 100))+unitPrice;
        System.out.println(totalPrice);
        return totalPrice;
    }
}
