import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create bank accounts
        BankAccount account1 = new BankAccount("12345", 1000);
        BankAccount account2 = new BankAccount("67890", 500);

        // Create cards
        Card debitCard = new Card("DEB111", "debit", 0);
        Card creditCard = new Card("CRED222", "credit", 500);

        // Perform payments
        System.out.println("--- Cash Payment Test ---");
        Payment cashPayment1 = new CashPayment(50, account1, 60);
        System.out.println("Can pay with cash: " + cashPayment1.canPay());
        cashPayment1.executePayment();

        Payment cashPayment2 = new CashPayment(120, account1, 100);
        System.out.println("Can pay with cash: " + cashPayment2.canPay());
        cashPayment2.executePayment();

        System.out.println("\n--- Debit Card Payment Test ---");
        Payment debitPayment1 = new CardPayment(200, account1, debitCard);
        System.out.println("Can pay with debit card: " + debitPayment1.canPay());
        debitPayment1.executePayment();
        account1.displayAccountInfo();

        Payment debitPayment2 = new CardPayment(900, account1, debitCard);
        System.out.println("Can pay with debit card: " + debitPayment2.canPay());
        debitPayment2.executePayment();
        account1.displayAccountInfo();

        System.out.println("\n--- Credit Card Payment Test ---");
        Payment creditPayment1 = new CardPayment(100, account2, creditCard);
        System.out.println("Can pay with credit card: " + creditPayment1.canPay());
        creditPayment1.executePayment();
        account2.displayAccountInfo();

        Payment creditPayment2 = new CardPayment(1000, account2, creditCard);
        System.out.println("Can pay with credit card: " + creditPayment2.canPay());
        creditPayment2.executePayment();
        account2.displayAccountInfo();

        System.out.println("\n--- Wire Transfer Payment Test ---");
        Payment wireTransferPayment1 = new WireTransferPayment(300, account1, "67890");
        System.out.println("Can pay with wire transfer: " + wireTransferPayment1.canPay());
        wireTransferPayment1.executePayment();
        account1.displayAccountInfo();

        Payment wireTransferPayment2 = new WireTransferPayment(1100, account1, "67890");
        System.out.println("Can pay with wire transfer: " + wireTransferPayment2.canPay());
        wireTransferPayment2.executePayment();
        account1.displayAccountInfo();

        scanner.close();
    }
}