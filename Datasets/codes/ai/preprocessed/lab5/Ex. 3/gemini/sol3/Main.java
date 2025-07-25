public class Main {
    public static void main(String[] args) {
        // Create Person objects
        Person johnDoe = new Person(101, "John Doe");
        Person janeSmith = new Person(102, "Jane Smith");

        // Create BankAccount objects
        BankAccount johnsAccount = new BankAccount(johnDoe, 1500.0);
        BankAccount janesAccount = new BankAccount(janeSmith, 750.0);

        // Test deposit
        johnsAccount.deposit(300.0);
        janesAccount.deposit(200.0);

        // Test withdrawal
        johnsAccount.withdraw(200.0);
        janesAccount.withdraw(800.0); // Overdraft attempt
        johnsAccount.withdraw(-50); //invalid amount

        // Test balance display
        johnsAccount.displayBalance();
        janesAccount.displayBalance();

        // Test transfer
        johnsAccount.transfer(janesAccount, 400.0);
        johnsAccount.transfer(janesAccount, 2000.0); // Overdraft attempt during transfer

        // Display balances after transfers
        johnsAccount.displayBalance();
        janesAccount.displayBalance();

        System.out.println(johnsAccount);
        System.out.println(janeSmith);
    }
}