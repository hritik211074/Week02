package Day05_OOPS_Inheritance.Hierarchical_Inheritance;

// Base class representing a generic bank account
class BankAccount {
    // Data members of Bank account class
    protected String accountNumber;
    protected double balance;

    // Constructor to initialize the data members of Bank account
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Showing the account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: INR " + balance);
    }
}

// Subclass representing a savings account
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass representing a checking account
class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }


    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: INR " + withdrawalLimit);
    }
}

// Subclass representing a fixed deposit account
class FixedDepositAccount extends BankAccount {
    private int maturityPeriod;

    // constructor of FixedDepositAccount
    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }


    // Display method FixedDepositAccount
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Maturity Period: " + maturityPeriod + " years");
    }
}

// Demo class to test the hierarchical inheritance
public class BankAccountDemo {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SAV001", 50000, 4.5);
        CheckingAccount checkingAccount = new CheckingAccount("CHK001", 75000, 25000);
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("FD001", 100000, 5);

        // Calling method to display the account details of savingAccount
        savingsAccount.displayAccountDetails();

        // display account type of savingAccount
        savingsAccount.displayAccountType();

        System.out.println();
        // Calling method to display the account details of checkingAccount
        checkingAccount.displayAccountDetails();

        // display account type of checkingAccount
        checkingAccount.displayAccountType();
        System.out.println();

        // Calling method to display the account details of fixedDepositccount
        fixedDepositAccount.displayAccountDetails();

        // display account type of fixedDepositAccount
        fixedDepositAccount.displayAccountType();
    }
}

