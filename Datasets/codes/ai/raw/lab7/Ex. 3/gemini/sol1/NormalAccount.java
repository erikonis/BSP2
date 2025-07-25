// NormalAccount.java (From Exercise 2)
public class NormalAccount extends BankAccount {

    public NormalAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful. New balance: " + balance);
            return true;
        } else {
            System.out.println("Withdrawal failed. Insufficient funds.");
            return false;
        }
    }
}