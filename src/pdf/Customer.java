package pdf;

public class Customer {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;

    public static void main(String[] args) {
        Customer objCustomer = new Customer();
        objCustomer.displayCustomerInformation();
        objCustomer.changeCustomerAddress(objCustomer.customerAddress);
    }

    void changeCustomerAddress(String address) {
        customerAddress = address;
    }

    void displayCustomerInformation() {
        System.out.println("Customer Identification Number: " + customerID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Address: " + customerAddress);
        System.out.println("Customer Age: " + customerAge);
    }
}
//    public static void main(String[] args) {
//        Customer objCustomer1 = new Customer();
//        objCustomer1.customerID = 100;
//        objCustomer1.customerName = "John";
//        objCustomer1.customerAddress = "123Street";
//        objCustomer1.customerAge=30;
//        System.out.println("Customer Identification Number: "+ objCustomer1.customerID);
//        System.out.println("Customer Name: "+objCustomer1.customerName);
//        System.out.println("Customer Address: "+ objCustomer1.customerAddress);
//        System.out.println("Customer Age: "+ objCustomer1.customerAge);
//    }
//}