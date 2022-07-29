import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

//    addBranch(), has one parameter of type String (name of the branch) and returns a boolean.
//    It returns true if the branch was added successfully or false otherwise.

    public boolean addBranch(String branchName) {
        //.add(branchName);
        if (true) return true;
        else return false;
    }

//addCustomer(), has three parameters of type String (name of the branch),
// String (name of the customer), double (initial transaction) and returns a boolean.
// It returns true if the customer was added successfully or false otherwise.
//
//addCustomerTransaction(), has three parameters of type String (name of the branch),
// String (name of the customer), double (transaction) and returns a boolean.
// It returns true if the customers transaction was added successfully or false otherwise.
//
//findBranch(), has one parameter of type String (name of the Branch) and returns a Branch.
// Return the Branch if it exists or null otherwise. PRIVATE
//
//listCustomers(), has two parameters of type String (name of the Branch), boolean (print transactions)
// and returns a boolean. Return true if the branch exists or false otherwise.
// This method prints out a list of customers.

}
