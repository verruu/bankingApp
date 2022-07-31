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

//        TIM'S SOLUTION - BETTER AND SHORTER ONE
//        if (findBranch(branchName) == null) {
//            this.branches.add(new Branch(branchName));
//            return true;
//        }

        Branch tempBranch = findBranch(branchName);
//        System.out.println(tempBranch);
        if (tempBranch == null) {
            Branch branch = new Branch(branchName);
            branches.add(branch);
//            System.out.println(branchName + " branch added.");
            return true;
        }
        return false;
    }

//addCustomer(), has three parameters of type String (name of the branch),
// String (name of the customer), double (initial transaction) and returns a boolean.
// It returns true if the customer was added successfully or false otherwise.
    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch tempBranch = findBranch(branchName);
        if (tempBranch != null && customerName != null)
            return tempBranch.newCustomer(customerName, initialTransaction);
        return false;
    }

//addCustomerTransaction(), has three parameters of type String (name of the branch),
// String (name of the customer), double (transaction) and returns a boolean.
// It returns true if the customers transaction was added successfully or false otherwise.
    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch tempBranch = findBranch(branchName);
        if (tempBranch != null)
            return tempBranch.addCustomerTransaction(customerName, transaction);
        return false;
    }

//findBranch(), has one parameter of type String (name of the Branch) and returns a Branch.
// Return the Branch if it exists or null otherwise. PRIVATE
    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch tempBranch = this.branches.get(i);
            if (tempBranch.getName().equals(branchName))
                return tempBranch;
        }
        return null;
    }

//listCustomers(), has two parameters of type String (name of the Branch), boolean (print transactions)
// and returns a boolean. Return true if the branch exists or false otherwise.
// This method prints out a list of customers.
    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch tempBranch = findBranch(branchName);

        if (tempBranch != null) {
            System.out.println("Customer details for branch " + tempBranch.getName());
            ArrayList<Customer> customers = tempBranch.getCustomers();

            for (int i = 0; i < customers.size(); i++) {
                Customer customer = customers.get(i);
                System.out.println("Customer: " + customer.getName() + "[" + (i+1) + "]");

                if (printTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = customer.getTransactions();

                    for (int j = 0; j < transactions.size(); j++)
                        System.out.println("[" + (j+1) + "]  Amount " + transactions.get(j));
                }
            }
            return true;
        } else {
            System.out.println("Warning! An error occurred!");
            return false;
        }
        return false;
    }
}