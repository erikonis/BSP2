import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class BankAccount {
    private static final DateTimeFormatter TIMESTAMP_FORMATTER = 
        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    
    private final Person holder;
    private double balance;
    private final String accountNumber;

    public BankAccount(Person holder, double initialBalance, String accountNumber) {
        this.holder = Objects.requireNonNull(holder, "Account holder cannot be null");
        if (initialBalance < 0) throw new IllegalArgumentException("Initial balance cannot be negative");
        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Account number cannot be empty");
        }
        
        this.balance = initialBalance;
        this.accountNumber = accountNumber.trim();
    }

    public Person getHolder() { return holder; }
    public double getBalance() { return balance; }
    public String getAccountNumber() { return accountNumber; }

    public void deposit(double amount) {
        validateAmount(amount, "deposit");
        balance += amount;
        System.out.printf("Successfully deposited $%.2f to account %s%n", amount, accountNumber);
    }

    public boolean withdraw(double amount) {
        validateAmount(amount, "withdrawal");
        
        if (balance < amount) {
            System.out.printf("Withdrawal failed: Insufficient funds in account %s%n", accountNumber);
            return false;
        }
        
        balance -= amount;
        System.out.printf("Successfully withdrew $%.2f from account %s%n", amount, accountNumber);
        return true;
    }

    public void transfer(BankAccount recipient, double amount) {
        Objects.requireNonNull(recipient, "Recipient account cannot be null");
        validateAmount(amount, "transfer");
        
        if (this.withdraw(amount)) {
            recipient.deposit(amount);
            String timestamp = LocalDateTime.now().format(TIMESTAMP_FORMATTER);
            System.out.printf("Transfer of $%.2f from %s to %s completed at %s%n",
                amount, this.accountNumber, recipient.accountNumber, timestamp);
        }
    }

    public void printStatement() {
        System.out.println("\n--- Account Statement ---");
        System.out.println("Holder: " + holder);
        System.out.println("Account #: " + accountNumber);
        System.out.printf("Balance: $%.2f%n", balance);
        System.out.println("-------------------------");
    }

    private void validateAmount(double amount, String operation) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount to " + operation + " must be positive");
        }
    }
}