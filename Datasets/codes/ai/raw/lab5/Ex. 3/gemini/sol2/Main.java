public class Main {
    public static void main(String[] args) {
        // Create two Person objects
        Person person1 = new Person(1, "John Doe");
        Person person2 = new Person(2, "Jane Smith");

        // Create two BankAccount objects
        BankAccount account1 = new BankAccount(person1, 1000);
        BankAccount account2 = new BankAccount(person2, 500);

        // Test depositing
        account1.deposit(200);
        account2.deposit(100);

        // Test withdrawing
        account1.withdraw(150);
        account2.withdraw(600); // Insufficient funds
        account2.withdraw(-100); //invalid amount

        // Test printing balance
        account1.printBalance();
        account2.printBalance();

        // Test transferring money
        account1.transfer(account2, 300);
        account1.transfer(account2, 1000); // Insufficient funds for transfer

        // Print balances after transfers
        account1.printBalance();
        account2.printBalance();
    }
}