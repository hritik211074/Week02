package Day03_OOPS.Sample_Program;

public class BankAccount   {

    static String bankName ="SBI";  // It's name of bank
    String accountHolderName;  // It's account holder name
    final int accountNumber;   // It is account number
    static int totalAccount=0;  // it's total number of account

    // Here we make parameterized constructor to initialize account holder name and account number
    BankAccount (String accountHolderName,int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccount++;
    }
    // Getting total account
    static int getTotalAccounts(){
        return totalAccount;
    }

    void displayDetail(){
        if(this instanceof BankAccount ){
            System.out.println("This is instance of this class");
            System.out.println("Account holder name is "+this.accountHolderName);
            System.out.println("Account number is "+accountNumber);

        }
    }

    public static void main(String[] args) {
        // Here we are creating the object of BankAccountSystem
        BankAccount  account1=new BankAccount ("Ramesh",323212343);

        BankAccount  account2=new BankAccount ("Suresh",323212333);

        // Displaying the details of account
        account1.displayDetail();  // Check details of account 1

        account2.displayDetail();  //  Check details of account 2

        // Calling to check total account
        int totalAccount=BankAccount.getTotalAccounts();

        System.out.println("Total number of account is "+totalAccount);
    }
}
