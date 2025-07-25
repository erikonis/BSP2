public class mainTest {
    public static void main(String[] args) {
        Person p1 = new Person(123, "Alex");
        Person p2 = new Person(345, "Mary");
        BankAccount bk1 = new BankAccount(p1, 10000);
        BankAccount bk2 = new BankAccount(p2, 10000);

        bk1.deposit(200);
        bk2.deposit(300);
        bk1.withdraw(300);

        bk1.transfer(bk2, 1000);

        bk1.printBalance();
        bk2.printBalance();
    }
}