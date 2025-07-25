package Exercise3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person Sara = new Person("1234", "Sara Vatavu");
        Person p2 = new Person("5678", "Unknown Person");
        BankAccount acc1 = new BankAccount(Sara, 1000);
        BankAccount acc2 = new BankAccount(p2, 300);
        acc1.deposit(200);
        acc1.printBalance();
        acc2.withdraw(150);
        acc2.printBalance();
        acc2.transfer(acc1, 100);
        acc1.printBalance();
        acc2.printBalance();
        acc2.withdraw(100);
        acc1.transfer(acc2, 7000);

        scanner.close();

    }
}
