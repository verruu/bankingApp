import java.util.ArrayList;

public class Customer {
    private String name;
    private double accountBalance;
    private ArrayList<Double> transactions;

    public Customer(String name) {
        this.name = name;
        this.accountBalance = 0;
        this.transactions = new ArrayList<Double>();
    }

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.accountBalance = 0;
        this.transactions = new ArrayList<Double>();
        this.transactions.add(initialTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void addTransaction(double transaction) {
        this.transactions.add(transaction);
        this.accountBalance += transaction;
    }
}