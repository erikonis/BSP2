import java.util.*;
import java.util.function.*;

public class PaymentEngine {
    static Scanner sc = new Scanner(System.in);
    static Map<String, Double> accounts = new HashMap<>();
    static Map<String, Double> limits = new HashMap<>();

    public static void main(String[] args) {
        accounts.put("debit:001", 600.0);
        accounts.put("credit:777", 150.0);
        limits.put("credit:777", 300.0);

        System.out.print("Enter method (cash, debit, credit): ");
        String method = sc.next();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        switch (method) {
            case "cash":
                System.out.print("Cash provided: ");
                double given = sc.nextDouble();
                if (given >= amount) {
                    System.out.println("Change: " + (given - amount));
                } else {
                    System.out.println("Insufficient cash.");
                }
                break;

            case "debit":
            case "credit":
                System.out.print("Enter card ID: ");
                String id = method + ":" + sc.next();
                if (!accounts.containsKey(id)) {
                    System.out.println("Card not found.");
                    return;
                }
                if (canPay(id, amount)) {
                    pay(id, amount);
                    System.out.println("Paid. New balance: " + accounts.get(id));
                } else {
                    System.out.println("Payment declined.");
                }
                break;

            default:
                System.out.println("Unknown method.");
        }
    }

    static boolean canPay(String id, double amt) {
        double bal = accounts.get(id);
        if (id.startsWith("debit")) return bal >= amt;
        if (id.startsWith("credit")) return bal + limits.getOrDefault(id, 0.0) >= amt;
        return false;
    }

    static void pay(String id, double amt) {
        accounts.put(id, accounts.get(id) - amt);
    }
}
