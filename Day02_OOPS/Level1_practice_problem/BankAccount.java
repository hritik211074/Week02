package Day02_OOPS.Level1_practice_problem;

class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;


    // Constructor to initialize bank account details
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }


    // Public method to get the balance
    public double getBalance() {
        return balance;
    }


    // Public method to set the balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance. Balance cannot be negative.");
        }
    }


    // Method to display bank account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }


    public static void main(String[] args) {
        // Creating a BankAccount instance
        BankAccount account = new BankAccount("123456789", "Rahul Yadav", 5000.0);


        // Displaying account details
        System.out.println("Bank Account Details:");
        account.displayAccountDetails();


        // Modifying the balance
        System.out.println("\nUpdating Balance:");
        account.setBalance(6000.0);
        account.displayAccountDetails();


        // Creating a SavingsAccount instance
        SavingsAccount savings = new SavingsAccount("987654321", "Rahul Yadav", 8000.0, 0.03);


        // Displaying savings account details
        System.out.println("\nSavings Account Details:");
        savings.displayAccountDetails();
    }
}


class SavingsAccount extends BankAccount {
    private double interestRate;


    // Constructor to initialize savings account details
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }


    // Overriding displayAccountDetails to include interest rate and display it
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
    }
}
