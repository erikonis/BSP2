public class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
            return true;
        } else {
            System.out.println("Insufficient funds for withdrawal of " + amount);
            return false;
        }
    }

    public boolean withdraw(double amount, double overdraftLimit) {
        if (amount > 0 && (balance - amount) >= -overdraftLimit) {
            this.balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
            return true;
        } else {
            System.out.println("Insufficient funds for withdrawal of " + amount + " (including overdraft).");
            return false;
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
