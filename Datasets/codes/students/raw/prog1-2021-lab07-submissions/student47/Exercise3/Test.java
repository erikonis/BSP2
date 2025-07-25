package Exercise3;

public class Test {
    public static void main(String[] args) {

        OverdraftAccount acc1 = new OverdraftAccount(100, 600);
        NormalAccount acc2 = new NormalAccount(100);
        Card c1 = new CreditCard(acc1);
        Card c2 = new DebitCard(acc2);
        Person Sara = new Person("1234", "Sara Vatavu", 30, c1);
        Person p2 = new Person("5678", "Lucas de Rooy", 500, c2);
        CashPayment CashP1 = new CashPayment(p2, Sara, 200);
        CashPayment CashP2 = new CashPayment(Sara, p2, 2000);
        CardPayment CardP1 = new CardPayment(p2, Sara, 100);
        CardPayment CardP2 = new CardPayment(Sara, p2, 500);
        CashP1.execute();
        CashP2.execute();
        CardP1.execute();
        CardP2.execute();

    }
}
