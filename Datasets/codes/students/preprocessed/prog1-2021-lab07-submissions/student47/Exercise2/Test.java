import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person Sara = new Person("1234", "Sara Vatavu");
        Person p2 = new Person("5678", "Unknown Person");
        NormalAccount acc1 = new NormalAccount(Sara, 1000);
        OverdraftAccount acc2 = new OverdraftAccount(p2, 300, 3000);
        acc1.deposit(200);
        acc1.printBalance();
        acc2.withdraw(150);
        acc2.printBalance();
        acc2.withdraw(10000);
        acc2.printBalance();

        scanner.close();

    }
}
