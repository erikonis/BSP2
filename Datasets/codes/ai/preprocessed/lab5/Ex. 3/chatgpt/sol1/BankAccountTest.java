import java.util.Scanner;

public class BankAccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create two Person objects
        Person person1 = new Person(1, "Alice");
        Person person2 = new Person(2, "Bob");

        // Create two BankAccount objects
        BankAccount account1 = new BankAccount(person1, 500);
        BankAccount account2 = new BankAccount(person2, 300);

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Transfer Money");
            System.out.println("4. Check Balances");
            System.out.println("5. Exit");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Select account (1 for Alice, 2 for Bob): ");
                    int acc = scanner.nextInt();
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    if (acc == 1) account1.deposit(depositAmount);
                    else if (acc == 2) account2.deposit(depositAmount);
                    else System.out.println("Invalid account selection.");
                    break;

                case 2:
                    System.out.print("Select account (1 for Alice, 2 for Bob): ");
                    acc = scanner.nextInt();
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (acc == 1) account1.withdraw(withdrawAmount);
                    else if (acc == 2) account2.withdraw(withdrawAmount);
                    else System.out.println("Invalid account selection.");
                    break;

                case 3:
                    System.out.print("Enter amount to transfer: ");
                    double transferAmount = scanner.nextDouble();
                    account1.transfer(account2, transferAmount);
                    break;

                case 4:
                    account1.printBalance();
                    account2.printBalance();
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}