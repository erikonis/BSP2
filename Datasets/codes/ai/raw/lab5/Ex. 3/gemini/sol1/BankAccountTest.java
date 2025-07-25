public package bankaccount;

public class BankAccountTest {
    public static void main(Stringargs) {
        Person person1 = new Person(1, "Alice");
        Person person2 = new Person(2, "Bob");

        BankAccount account1 = new BankAccount(person1, 1000);
        BankAccount account2 = new BankAccount(person2, 500);

        System.out.println("Account 1 holder: " + account1.getHolder().getName());
        account1.printBalance();

        System.out.println("Account 2 holder: " + account2.getHolder().getName());
        account2.printBalance();

        account1.deposit(500);
        System.out.println("After deposit to Account 1:");
        account1.printBalance();

        account2.withdraw(200);
        System.out.println("After withdrawal from Account 2:");
        account2.printBalance();

        account1.transfer(account2, 300);
        System.out.println("After transfer from Account 1 to Account 2:");
        account1.printBalance();
        account2.printBalance();

        account2.withdraw(1000); // Attempt to withdraw more than the balance
        account2.printBalance();
    }
} {
    
}
