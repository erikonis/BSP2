import java.util.*;

interface Payment {
    boolean canPay();
    double pay(); // returns change or 0
}

class CashPayment implements Payment {
    double given, amount;
    CashPayment(double given, double amount) {
        this.given = given; this.amount = amount;
    }
    public boolean canPay() { return given >= amount; }
    public double pay() { return given - amount; }
}

class CardPayment implements Payment {
    String cardId;
    double amount;
    static Map<String, Double> balance = new HashMap<>();
    static Map<String, Double> overdraft = new HashMap<>();
    
    CardPayment(String cardId, double amount) {
        this.cardId = cardId;
        this.amount = amount;
    }

    public boolean canPay() {
        double available = balance.getOrDefault(cardId, 0.0);
        double limit = cardId.startsWith("credit") ? overdraft.getOrDefault(cardId, 0.0) : 0.0;
        return available + limit >= amount;
    }

    public double pay() {
        double b = balance.get(cardId);
        balance.put(cardId, b - amount);
        return 0;
    }
}

public class PaymentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CardPayment.balance.put("debit_001", 300.0);
        CardPayment.balance.put("credit_999", 100.0);
        CardPayment.overdraft.put("credit_999", 200.0);

        System.out.print("Payment method (cash/card): ");
        String type = sc.next();
        Payment payment;

        if (type.equals("cash")) {
            System.out.print("Given / Price: ");
            double given = sc.nextDouble(), price = sc.nextDouble();
            payment = new CashPayment(given, price);
        } else {
            System.out.print("Card ID / Price: ");
            String id = sc.next(); double price = sc.nextDouble();
            payment = new CardPayment(id, price);
        }

        if (payment.canPay()) {
            double change = payment.pay();
            System.out.println("Payment successful. Change: " + change);
        } else {
            System.out.println("Payment failed.");
        }
    }
}
