public class Main {
    public static void main(String[] args) {
        // Create Persons
        Person p1 = new Person(1, "Lukas");
        Person p2 = new Person(2, "Elena");

        // Create Bank Accounts
        BankAccount acc1 = new BankAccount(p1, 1000.00);
        BankAccount acc2 = new BankAccount(p2, 500.00);

        System.out.println("=== Initial Balances ===");
        acc1.printBalance();
        acc2.printBalance();

        System.out.println("\n=== Deposits ===");
        acc1.deposit(250.00);
        acc2.deposit(150.00);

        System.out.println("\n=== Withdrawals ===");
        acc1.withdraw(300.00);
        acc2.withdraw(700.00); // This should fail

        System.out.println("\n=== Transfer ===");
        acc1.transfer(acc2, 400.00);

        System.out.println("\n=== Final Balances ===");
        acc1.printBalance();
        acc2.printBalance();
    }
}