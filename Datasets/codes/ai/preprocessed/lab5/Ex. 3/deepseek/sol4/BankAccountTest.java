public class BankAccountTest {
    public static void main(String[] args) {
        // Create persons
        Person alice = new Person(1, "Alice Smith");
        Person bob = new Person(2, "Bob Johnson");

        // Create accounts
        BankAccount account1 = new BankAccount(alice, 1000.0);
        BankAccount account2 = new BankAccount(bob, 500.0);

        // Test operations
        account1.printBalance();
        account2.printBalance();

        account1.deposit(200.0);
        account1.printBalance();

        account1.withdraw(50.0);
        account1.printBalance();

        account1.transfer(account2, 300.0);
        account1.printBalance();
        account2.printBalance();

        // Test edge cases
        account1.withdraw(-100); // Invalid amount
        account1.withdraw(10000); // Insufficient funds
        account1.deposit(-50); // Invalid deposit
    }
}