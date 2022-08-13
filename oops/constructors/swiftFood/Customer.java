package oops.constructors.swiftFood;

class Customer {
    public String customerId;
    public String customerName;
    public long contactNumber;
    public String address;


    public Customer(String custName, long contactNum, String add) {
        this.customerName = custName;
        this.contactNumber = contactNum;
        this.address = add;
    }
}