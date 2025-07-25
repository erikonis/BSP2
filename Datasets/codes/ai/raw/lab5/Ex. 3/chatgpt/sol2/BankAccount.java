public class BankAccount {
    private Person holder;
    private double balance;

    public BankAccount(Person holder, double balance) {
        this.holder = holder;
        this.balance = Math.max(balance, 0);
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void printBalance() {
        System.out.println(holder.getName() + "'s balance: " + balance + "€");
    }
}
