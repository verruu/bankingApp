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
        for (int i = 0; i < branches.size(); i++) {
//            Branch tempBranch = branches.get(i);
            if (branches.get(i).getName().equals(branchName))
                return branches.get(i);
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
            ArrayList<Customer> var = tempBranch.getCustomers();

            for (int i = 0; i < var.size(); i++) {
                System.out.println("Customer: " + var.get(i).getName() + "[" + (i+1) + "]");
                ArrayList<Double> varAdd = tempBranch.getCustomers().get(i).getTransactions();

                if (printTransactions) {
                    System.out.println("Transactions");

                    for (int j = 0; j < varAdd.size(); j++)
                        System.out.println("[" + (j+1) + "]" + "  Amount " + varAdd.get(j));
                }
            }
            return true;
        }
        return false;
    }
}