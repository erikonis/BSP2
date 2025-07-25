public class Account {
    private double balance;
    private AccountState state;

    public Account(double initialBalance, AccountState initialState) {
        this.balance = initialBalance;
        this.state = initialState;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        state.withdraw(amount, this);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setState(AccountState state) {
        this.state = state;
    }
}