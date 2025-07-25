public package exercise3;

public class BankAccountTest {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Alice");
        Person person2 = new Person(2, "Bob");

        BankAccount account1 = new BankAccount(person1, 1000.0);
        BankAccount account2 = new BankAccount(person2, 500.0);

        account1.deposit(200.0);
        account1.printBalance();

        account2.withdraw(100.0);
        account2.printBalance();

        account1.transfer(account2, 300.0);
        account1.printBalance();
        account2.printBalance();

        account2.withdraw(1000.0);
        account2.printBalance();
    }
} {
    
}
