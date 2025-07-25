public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alice");
        BankAccount acc1 = new BankAccount(p1, 500);

        acc1.deposit(100);
        acc1.withdraw(200);
        acc1.printBalance();
    }
}