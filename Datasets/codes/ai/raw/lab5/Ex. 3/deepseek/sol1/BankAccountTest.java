package exercise3;

public class BankAccountTest {
    public static void main(String[] args) {
        // Create two persons
        Person person1 = new Person(1, "Alice");
        Person person2 = new Person(2, "Bob");

        // Create two bank accounts
        BankAccount account1 = new BankAccount(person1, 1000.0);
        BankAccount account2 = new BankAccount(person2, 500.0);

        // Test deposit
        account1.deposit(200.0);
        account1.printBalance();

        // Test withdrawal
        account2.withdraw(100.0);
        account2.printBalance();

        // Test transfer
        account1.transfer(account2, 300.0);
        account1.printBalance();
        account2.printBalance();

        // Test insufficient funds
        account2.withdraw(1000.0);
        account2.printBalance();
    }
}