public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Alice");
        Person p2 = new Person(2, "Bob");

        BankAccount aliceAccount = new BankAccount(p1, 1000);
        BankAccount bobAccount = new BankAccount(p2, 500);

        System.out.println("--- Initial Balances ---");
        aliceAccount.printBalance();
        bobAccount.printBalance();

        System.out.println("\n--- Deposit ---");
        aliceAccount.deposit(200);
        bobAccount.deposit(100);

        System.out.println("\n--- Withdraw ---");
        aliceAccount.withdraw(150);
        bobAccount.withdraw(700);  // Should fail due to insufficient funds

        System.out.println("\n--- Transfer ---");
        aliceAccount.transfer(bobAccount, 300);

        System.out.println("\n--- Final Balances ---");
        aliceAccount.printBalance();
        bobAccount.printBalance();
    }
}