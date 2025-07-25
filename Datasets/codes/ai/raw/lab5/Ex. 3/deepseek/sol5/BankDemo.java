public class BankDemo {
    public static void main(String[] args) {
        try {
            // Create account holders
            Person alice = new Person(1, "Alice Johnson");
            Person bob = new Person(2, "Robert Smith");
            
            // Create bank accounts
            BankAccount aliceAccount = new BankAccount(alice, 1000.00, "ACC123456");
            BankAccount bobAccount = new BankAccount(bob, 500.00, "ACC789012");
            
            // Demonstrate operations
            aliceAccount.printStatement();
            bobAccount.printStatement();
            
            aliceAccount.deposit(250.50);
            aliceAccount.withdraw(100.00);
            
            aliceAccount.transfer(bobAccount, 300.00);
            
            // Print final balances
            aliceAccount.printStatement();
            bobAccount.printStatement();
            
            // Test error cases
            aliceAccount.deposit(-50); // Will throw exception
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}