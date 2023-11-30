import java.awt.image.BandCombineOp;
import java.util.ArrayList;


record Customer(String name, ArrayList<Double> transactions) {

    public Customer(String name, ArrayList<Double> transactions) {
        this.name = name;
        this.transactions = new ArrayList<>(transactions);
    }
    public String getName() {
        return name;
    }


    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transactions) {

    }
}
record Branch(String name, ArrayList<Customer> customers) {
    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public boolean newCustomer(String name, double initial) {
        return true;
    }
    public boolean addCustomerTransaction(String name, double transaction ) {
        return true;
    }
    public String findCustomer(String name) {
        return name;
    }
}
public class Main {

    public static void main(String[] args) {

    }
}
class Bank {
    private String name;
    private ArrayList<Branch> branches = new ArrayList<>(5000);
}