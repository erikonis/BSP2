public interface Account {
    void accept(AccountVisitor visitor);
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}