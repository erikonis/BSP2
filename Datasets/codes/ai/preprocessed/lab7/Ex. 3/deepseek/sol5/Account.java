public class Account {
    private final String id;
    private double balance;
    private final boolean allowsOverdraft;

    public Account(String id, double initialBalance) {
        this(id, initialBalance, false);
    }

    public Account(String id, double initialBalance, boolean allowsOverdraft) {
        this.id = id;
        this.balance = initialBalance;
        this.allowsOverdraft = allowsOverdraft;
    }

    public synchronized void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }

        if (!allowsOverdraft && balance < amount) {
            throw new InsufficientFundsException("Insufficient funds in account " + id);
        }

        balance -= amount;
    }

    // Getters
    public String getId() { return id; }
    public double getBalance() { return balance; }
    public boolean allowsOverdraft() { return allowsOverdraft; }
}