public class Main {
    public static void main(String[] args) {
        // Create two Person objects
        Person person1 = new Person(1, "Alice");
        Person person2 = new Person(2, "Bob");

        // Create two BankAccount objects
        BankAccount account1 = new BankAccount(person1, 1000);
        BankAccount account2 = new BankAccount(person2, 500);

        // Test depositing money
        account1.deposit(200);
        account1.printBalance(); // Expected balance: 1200

        // Test withdrawing money
        account1.withdraw(300);
        account1.printBalance(); // Expected balance: 900

        // Test transferring money
        account1.transfer(account2, 400);
        account1.printBalance(); // Expected balance: 500
        account2.printBalance(); // Expected balance: 900
    }
}
