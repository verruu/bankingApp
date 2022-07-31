import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    //newCustomer(), has two parameters of type String (name of customer), double (initial transaction)
// and returns a boolean. Returns true if the customer was added successfully or false otherwise.
    public boolean newCustomer(String customerName, double initialTransaction) {

//        TIM'S SOLUTION - BETTER AND SHORTER ONE
//        if (findCustomer(customerName) == null) {
//            this.customers.add(new Customer(customerName, initialTransaction));
//            return true;
//        }

        Customer tempCust = findCustomer(customerName);
        if (tempCust == null) {
            Customer customer = new Customer(customerName, initialTransaction);
            customers.add(customer);
            return true;
        }
        return false;
    }

    //addCustomerTransaction(), has two parameters of type String (name of customer), double (transaction)
// and returns a boolean. Returns true if the customers transaction was added successfully or false otherwise.
    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer tempCust = findCustomer(customerName);
        if (tempCust != null) {
            tempCust.addTransaction(transaction);
            return true;
        }
        return false;
    }

//findCustomer(), has one parameter of type String (name of customer) and returns a Customer.
// Return the Customer if they exist, null otherwise. PRIVATE
    private Customer findCustomer(String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer tempCust = this.customers.get(i);
            if (tempCust.getName().equals(customerName)) return tempCust;
        }
        return null;
    }
}