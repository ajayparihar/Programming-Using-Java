package oops.constructors;

class Customer {
    public String customerId;
    public String customerName;
    public long contactNumber;
    public String address;

    public Customer() {
        System.out.println("Parameterless constructor called");
    }

    public Customer(String cId, String cName, String add, long contact) {
        System.out.println("Parameterized constructor called");
        customerId = cId;
        customerName = cName;
        contactNumber = contact;
        address = add;
    }
}

class Tester {
    public static void main(String args[]) {
        //the below line will lead to an error as there is no default constructor
        Customer customer2 = new Customer();
        //if a parameterized constructor is created in a class, java doesn't create a default constructor
        //uncomment the parameterless constructor and then execute the code

        //the below code leads to an error as the parameters accepted by the constructor does not match the parameters passed
        Customer customer1 = new Customer("C103", "Jacob", "13th Street, New York", 5648394590L);
        System.out.println(customer1.customerId);
        //the order and type of the parameters passed for a parameterized constructor should match the definition properly

    }
}