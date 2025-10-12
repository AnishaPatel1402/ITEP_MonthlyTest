//  2. Exception Handling Problem
// Bank Withdrawal Simulation
// Create a custom exception InsufficientFundsException.
// Create a class BankAccount with fields: accountNumber, balance.
// Add a withdraw(double amount) method that:
// Throws InsufficientFundsException if the amount > balance.
// Deducts the amount otherwise.
// In main, create an account, attempt withdrawals, and handle the exception gracefully.

class InsufficientFundsException extends Exception{
    public InsufficientFundsException(){
        super("Insufficient amount! kindly deposite a minimum amount");
    }
}

class BankAccount{
    private String accountName;
    private String accountNumber;
    private double balance;

    public BankAccount(){
        this.accountName = null;
        this.accountNumber = null;
        this.balance  = 0.0;
    }

    public BankAccount(String accountName, String accountNumber, double balance){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance  = balance;
    }

    public void deposite(double amount){
        this.balance += amount;
        System.out.println(amount +" deposited successfull");
        displayBalance();
    }

    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount > this.balance){
            throw new InsufficientFundsException();
        }
        else {
            this.balance -= amount;
            System.out.println(amount +" withdraw successfull");
            displayBalance();
        }
    }

    public void displayBalance(){
        System.out.println("Your current balance is: "+ this.balance);
    }
    public void displayUserDetails(){
        System.out.println("Account name : "+ this.accountName);
        System.out.println("Account number : "+ this.accountNumber);
        System.out.println("Current balance : "+ this.balance);
        System.out.println();
    }
}

class Test{
    public static void main(String args[]){
        BankAccount user1 = new BankAccount("Anisha patel", "9990991425646", 1000);
        user1.displayUserDetails();
        
        try{
            user1.withdraw(5000);
        } catch(InsufficientFundsException e){
            System.out.println(e.getMessage());
        }

        user1.deposite(10000);

        try{
            user1.withdraw(10000);
        } catch(InsufficientFundsException e){
            System.out.println(e.getMessage());
        }


    }
}