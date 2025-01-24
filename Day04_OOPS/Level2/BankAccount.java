package Day04_OOPS.Level2;

import java.util.ArrayList;

// Account class
class Account {
    private String accountNumber;
    private double balance;

    //Constructor to initialize the data members of Account class
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    // Returning the balance
    public double getBalance() {
        return balance;
    }

    // Returning the account number
    public String getAccountNumber() {
        return accountNumber;
    }
}

// Customer class
class Customer {
    private String name;
    private ArrayList<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }
    //Adding the account of any customer's
    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        for (Account account : accounts) {
            System.out.println("Account " + account.getAccountNumber() + ": $" + account.getBalance());
        }
    }
}

// Bank class
class Bank {
    private ArrayList<Customer> customers;

    public Bank() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void openAccount(Customer customer, String accountNumber, double initialBalance) {
        Account newAccount = new Account(accountNumber, initialBalance);
        customer.addAccount(newAccount);
    }
}

// Main class to demonstrate
public class BankAccount {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Customer customer1 = new Customer("Suresh");
        Customer customer2 = new Customer("Dhamesh");

        // Adding the customers into bank
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        // Opening account in every bank
        bank.openAccount(customer1, "12345", 1000.00);
        bank.openAccount(customer2, "67890", 2000.00);
        bank.openAccount(customer2, "54321", 500.00);

        // calling the function to show the balance of customer1 and customer 2
        customer1.viewBalance();
        customer2.viewBalance();
    }
}

