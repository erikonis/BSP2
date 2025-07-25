package lu.uni.programming1.lab5.exercise3;

public class Launcher {
    public static void main(String[] args) {
        Person a = new Person(0, "Hugo");
        Person b = new Person(1, "Benjamin");

        BankAccount A = new BankAccount(a);
        BankAccount B = new BankAccount(b);

        A.deposit(20);
        A.printBalance();

        A.transfer(B, 11);

        A.printBalance();
        B.printBalance();
    }
}
