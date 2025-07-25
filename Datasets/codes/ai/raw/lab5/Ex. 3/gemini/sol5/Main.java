public class Main {
    public static void main(String[] args) {
        // Create Person objects
        Person johnDoe = new Person(101, "John Doe");
        Person janeSmith = new Person(102, "Jane Smith");

        // Create BankAccount objects
        BankAccount johnsAccount = new BankAccount(johnDoe, 1500.0);
        BankAccount janesAccount = new BankAccount(janeSmith, 750.0);
        BankAccount nullAccount = null;

        // Test deposit
        johnsAccount.deposit(300.0);
        janesAccount.deposit(200.0);
        try {
            johnsAccount.deposit(-10); // invalid
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }


        // Test withdrawal
        johnsAccount.withdraw(200.0);
        try {
            janesAccount.withdraw(800.0); // Overdraft attempt
        } catch (InsufficientFundsException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        try{
            johnsAccount.withdraw(-20); // invalid
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        johnsAccount.withdraw(0);  //invalid - now throws exception

        // Test balance display
        johnsAccount.displayBalance();
        janesAccount.displayBalance();

        // Test transfer
        johnsAccount.transfer(janesAccount, 400.0);
        johnsAccount.transfer(janesAccount, 2000.0); // Overdraft attempt during transfer
        johnsAccount.transfer(nullAccount, 100); // null recipient
        johnsAccount.transfer(johnsAccount, 0);

        // Display balances after transfers
        johnsAccount.displayBalance();
        janesAccount.displayBalance();

        // test toString
        System.out.println("John's Account: " + johnsAccount);
        System.out.println("Jane Smith: " + janeSmith);

        // test equals and hashcode
        BankAccount johnsOtherAccount = new BankAccount(johnDoe, 1500.0);
        System.out.println("John's Account equals John's Other Account: " + johnsAccount.equals(johnsOtherAccount));
        System.out.println("John's Account hash code: " + johnsAccount.hashCode());
        System.out.println("John's Other Account hash code: " + johnsOtherAccount.hashCode());
    }
}