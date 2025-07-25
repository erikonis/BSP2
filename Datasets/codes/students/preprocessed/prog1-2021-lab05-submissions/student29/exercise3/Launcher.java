import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the name of the owner of the first bank account? ");
        String name = scanner.next();
        System.out.print("What is the ID of the owner of the first bank account? ");
        int id = scanner.nextInt();
        System.out.print("What is the balance of the owner of the first bank account? ");
        double balance1 = scanner.nextDouble();

        Person person1 = new Person(id, name);

        System.out.print("What is the name of the owner of the second bank account? ");
        name = scanner.next();
        System.out.print("What is the ID of the owner of the second bank account? ");
        id = scanner.nextInt();
        System.out.print("What is the balance of the owner of the second bank account? ");
        double balance2 = scanner.nextDouble();

        Person person2 = new Person(id, name);

        BankAccount account1 = new BankAccount(person1, balance1);
        BankAccount account2 = new BankAccount(person2, balance2);

        System.out.print("How much do you want to deposit in " + person1.getName() + "'s account? ");
        account1.deposit(scanner.nextDouble());
        account1.printBalance();

        System.out.print("How much do you want to withdraw from " + person1.getName() + "'s account? ");
        account1.withdraw(scanner.nextDouble());
        account1.printBalance();

        System.out.print("How much do you want to transfer from " + person1.getName() + "'s account to " + person2.getName() + "'s account? ");
        account1.transfer(account2, scanner.nextDouble());
        account1.printBalance();
        account2.printBalance();

        scanner.close();

    }
}
