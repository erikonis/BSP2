import java.util.*;
import java.util.function.*;

public class FunctionalPayments {
    static Map<String, Double> accounts = new HashMap<>();
    static Map<String, Double> overdrafts = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        accounts.put("debit:123", 400.0);
        accounts.put("credit:abc", 150.0);
        overdrafts.put("credit:abc", 250.0);

        Map<String, BiFunction<Double, Double, Boolean>> canPayMap = new HashMap<>();
        Map<String, BiFunction<Double, Double, Double>> payMap = new HashMap<>();

        canPayMap.put("cash", (given, amount) -> given >= amount);
        payMap.put("cash", (given, amount) -> given - amount);

        canPayMap.put("debit", (balance, amount) -> balance >= amount);
        payMap.put("debit", (balance, amount) -> balance - amount);

        canPayMap.put("credit", (balance, amount) -> balance + overdrafts.getOrDefault("credit:abc", 0.0) >= amount);
        payMap.put("credit", (balance, amount) -> balance - amount);

        System.out.print("Method (cash/debit/credit): ");
        String method = sc.next();

        if (method.equals("cash")) {
            System.out.print("Given / Amount: ");
            double given = sc.nextDouble(), amt = sc.nextDouble();
            if (canPayMap.get("cash").apply(given, amt))
                System.out.println("Change: " + payMap.get("cash").apply(given, amt));
            else System.out.println("Not enough cash.");
        } else {
            System.out.print("Card ID / Amount: ");
            String id = sc.next(); double amt = sc.nextDouble();
            double bal = accounts.getOrDefault(method + ":" + id, 0.0);

            if (canPayMap.get(method).apply(bal, amt)) {
                double newBal = payMap.get(method).apply(bal, amt);
                accounts.put(method + ":" + id, newBal);
                System.out.println("Paid. New balance: " + newBal);
            } else System.out.println("Insufficient funds.");
        }
    }
}