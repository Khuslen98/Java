package dev.lpa;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);
    }
}

class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransactions(initialTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransactions(double transaction) {
        transactions.add(transaction);
    }
}


class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName(String name) {
        return this.name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initial) {
        if (findCustomer(customerName) == null) {
            customers.add(new Customer(customerName, initial));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String name, double amount) {
        Customer customer = findCustomer(name);
        if (customer != null) {
            customer.addTransactions(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String Cname) {
        for (int i = 0; i < customers.size(); i ++) {
            Customer checkedCustomer = customers.get(i);
            if (checkedCustomer.getName().equals(Cname)){
                return checkedCustomer;
            }
        }
        return null;
    }
}
class Bank {
    private String name;
    private ArrayList<Branch> branches;
    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public Bank(String name, ArrayList<Branch> branches) {
        this.name = name;
        this.branches = new ArrayList<Branch>() ;
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer (String branchName, String customerName, double initial) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initial);
        }
        return false;
    }
    public boolean addCustomerTransaction(String BranchName, String customerName, double amount) {
        Branch branch = findBranch(BranchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }
    private Branch findBranch(String Bname) {
        for (int i = 0; i < branches.size(); i++) {
            Branch checkedBranch = branches.get(i);
            if (checkedBranch.getName().equals(Bname)) {
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {

        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
                if (showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}
