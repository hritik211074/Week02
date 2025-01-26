package Day06_OOPS;

import java.util.*;

import java.util.*;

// Abstract class for common bank account operations
abstract class BankAccount {
    private String accNo, holderName;
    protected double balance;

    // Constructor to initialize account details
    public BankAccount(String accNo, String holderName, double balance) {
        this.accNo = accNo; this.holderName = holderName; this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) { balance += amount; }

    // Withdraw method
    public void withdraw(double amount) { if (balance >= amount) balance -= amount; }

    // Abstract method for calculating interest (specific to account type)
    public abstract double calculateInterest();

    public String getDetails() { return "Acc No: " + accNo + ", Name: " + holderName + ", Balance: $" + balance; } // Account details
}

// Interface for loanable accounts
interface Loanable {
    // Check if loan can be approved
    boolean applyForLoan(double amount);
    // Calculate loan eligibility based on balance
    double calculateLoanEligibility();
}

// SavingsAccount with 4% interest and loan eligibility 3x balance
class SavingsAccount extends BankAccount implements Loanable {

    public SavingsAccount(String accNo, String holderName, double balance) {
        super(accNo, holderName, balance);
    }
    // 4% annual interest
    public double calculateInterest() { return 0.04 * balance; }

    // Loan eligibility (3x balance)
    public boolean applyForLoan(double amount) { return amount <= 3 * balance; }

    // Loan eligibility calculation
    public double calculateLoanEligibility() { return 3 * balance; }
}

// CurrentAccount with 2% interest
class CurrentAccount extends BankAccount {
    public CurrentAccount(String accNo, String holderName, double balance) { super(accNo, holderName, balance); }

    // 2% annual interest
    public double calculateInterest() { return 0.02 * balance; }
}

// Main class to demonstrate polymorphism and account operations
public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = Arrays.asList(
                new SavingsAccount("S123", "Alice", 1000),
                new CurrentAccount("C456", "Bob", 2000)
        );

        // Iterate over accounts and perform operations
        accounts.forEach(acc -> {

            // Print account details
            System.out.println(acc.getDetails());

            // Print interest
            System.out.println("Interest: $" + acc.calculateInterest());

            if (acc instanceof Loanable) {
                Loanable loanable = (Loanable) acc;
                // Loan eligibility
                System.out.println("Loan Eligibility: $" + loanable.calculateLoanEligibility());

                // Check loan approval
                System.out.println("Loan Approval: " + loanable.applyForLoan(5000));
            }
            System.out.println();
        });
    }
}


