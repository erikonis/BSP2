package payment_system.model;

public class BankAccount {
    private final String accountNumber;
    private double balance;
    private final boolean allowsOverdraft;
    
    public BankAccount(String accountNumber, double initialBalance, boolean allowsOverdraft) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.allowsOverdraft = allowsOverdraft;
    }
    
    public boolean withdraw(double amount) {
        if (canWithdraw(amount)) {
            balance -= amount;
            return true;
        }
        return false;
    }
    
    public boolean canWithdraw(double amount) {
        return amount > 0 && (balance >= amount || allowsOverdraft);
    }
    
    // Getters
    public double getBalance() { return balance; }
    public String getAccountNumber() { return accountNumber; }
    public boolean allowsOverdraft() { return allowsOverdraft; }
}