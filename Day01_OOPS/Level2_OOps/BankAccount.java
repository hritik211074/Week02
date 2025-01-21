import java.util.*;

public class BankAccount {

    private String accountHolder;  // Account holder name
    private int accountNumber;     // Account number
    private int balance;           // Balance

    public BankAccount() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the account holder name: ");
        this.accountHolder = sc.next();  // Taking accountHolder as input

        System.out.println("Enter the account number: ");
        this.accountNumber = sc.nextInt();   // Taking accountNumber as input

        System.out.println("Enter the balance: ");
        this.balance = sc.nextInt();  // Taking balance as input
    }

    // Method to deposit money
    void depositMoney(int deposit) {
        this.balance += deposit;  // Adding deposit money into balance
    }

    // Method to withdraw money
    void withdrawMoney() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Withdraw money we want
            System.out.print("Enter the money to withdraw: ");

            int withdraw = sc.nextInt();

            if (withdraw > this.balance) {
                System.out.println("Insufficient balance!!");
            } else {
                this.balance -= withdraw;
                break;
            }
        }
    }

    // Method to display bank details
    void bankDetail() {
        System.out.println("Account holder name is " + this.accountHolder +
                " and account number is " + this.accountNumber +
                " and balance is " + this.balance);
    }

    public static void main(String[] args) {
        // Creating the object of class BankAccount
        BankAccount p1 = new BankAccount();

        // Creating scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Deposit money we want
        System.out.print("Enter the money to deposit: ");
        int deposit = sc.nextInt();

        // Calling method to deposit money
        p1.depositMoney(deposit);

        // Displaying detail after depositing money
        System.out.println("Displaying detail after depositing money:");
        p1.bankDetail();
        System.out.println("------------------------------------------------------");

        // Calling method to withdraw money
        p1.withdrawMoney();

        // Displaying detail after withdrawing money
        p1.bankDetail();

        sc.close();
    }
}
