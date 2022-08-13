package oops.constructors.swiftFood;

class Order {
    public int orderId;
    public String orderedFoods;
    public double totalPrice;
    public String status;


    /*public Order(int id, String foodName, String status) {
        this.orderId = id;
        this.orderedFoods = foodName;
        this.status = status;
    }*/

    public Order() {
        this.status = "Ordered";
    }

    public Order(int orderId, String orderedFoods) {
        this.orderId = orderId;
        this.orderedFoods = orderedFoods;
        this.status = "Ordered";
    }

    public double calculateTotalPrice(int unitPrice) {
        this.totalPrice = (unitPrice * (5 / 100)) + unitPrice;
        System.out.println(totalPrice);
        return totalPrice;
    }
}
