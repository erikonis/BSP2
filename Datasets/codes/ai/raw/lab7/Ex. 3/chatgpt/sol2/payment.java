import java.util.*;

public class PaymentProcessor {
    static Scanner sc = new Scanner(System.in);
    static Map<String, Double> bankAccounts = new HashMap<>();
    static Map<String, Double> creditLimits = new HashMap<>();

    public static void main(String[] args) {
        // Setup accounts
        bankAccounts.put("debit_123", 500.0);
        bankAccounts.put("credit_999", 100.0);
        creditLimits.put("credit_999", 400.0); // can overdraft by 400

        System.out.println("Choose payment method (cash/card):");
        String method = sc.next();

        System.out.print("Enter payment amount: ");
        double amount = sc.nextDouble();

        if (method.equals("cash")) {
            System.out.print("Enter cash given: ");
            double given = sc.nextDouble();
            if (canPayCash(given, amount)) {
                double change = executeCashPayment(given, amount);
                System.out.println("Cash payment successful. Change: " + change);
            } else {
                System.out.println("Not enough cash.");
            }

        } else if (method.equals("card")) {
            System.out.print("Enter card type (debit/credit): ");
            String type = sc.next();
            System.out.print("Enter card ID: ");
            String cardId = type + "_" + sc.next();

            if (!bankAccounts.containsKey(cardId)) {
                System.out.println("Card not recognized.");
                return;
            }

            if (canPayCard(cardId, amount)) {
                executeCardPayment(cardId, amount);
                System.out.println("Card payment successful. Remaining: " + bankAccounts.get(cardId));
            } else {
                System.out.println("Card declined.");
            }

        } else {
            System.out.println("Unknown payment method.");
        }
    }

    static boolean canPayCash(double given, double amount) {
        return given >= amount;
    }

    static double executeCashPayment(double given, double amount) {
        return given - amount;
    }

    static boolean canPayCard(String cardId, double amount) {
        double balance = bankAccounts.get(cardId);
        if (cardId.startsWith("debit")) return balance >= amount;
        if (cardId.startsWith("credit")) {
            double limit = creditLimits.getOrDefault(cardId, 0.0);
            return balance + limit >= amount;
        }
        return false;
    }

    static void executeCardPayment(String cardId, double amount) {
        double balance = bankAccounts.get(cardId);
        bankAccounts.put(cardId, balance - amount);
    }
}
