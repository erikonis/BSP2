public class Main {
    public static void main(String[] args) {
        Person alice = new Person(101, "Alice");
        Person bob = new Person(102, "Bob");

        BankAccount account1 = new BankAccount(alice, 1000);
        BankAccount account2 = new BankAccount(bob, 500);

        System.out.println("=== Initial Balances ===");
        account1.printBalance();
        account2.printBalance();

        System.out.println("\n=== Deposits ===");
        account1.deposit(300);
        account2.deposit(200);

        System.out.println("\n=== Withdrawals ===");
        account1.withdraw(100);
        account2.withdraw(1000); // This should fail

        System.out.println("\n=== Transfer ===");
        account1.transfer(account2, 400);

        System.out.println("\n=== Final Balances ===");
        account1.printBalance();
        account2.printBalance();
    }
}
