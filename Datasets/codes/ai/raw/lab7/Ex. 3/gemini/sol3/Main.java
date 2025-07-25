import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create bank accounts
        BankAccount account1 = new BankAccount("12345", 1000);
        BankAccount account2 = new BankAccount("67890", 500);

        // Create cards
        Card debitCard = new Card("DEB111", account1, "debit");
        Card creditCard = new Card("CRED222", account2, "credit");

        // Perform payments
        System.out.println("--- Cash Payment Test ---");
        Payment cashPayment1 = new CashPayment(50, 60);
        System.out.println("Can pay with cash: " + cashPayment1.canPay());
        cashPayment1.executePayment();

        Payment cashPayment2 = new CashPayment(120, 100);
        System.out.println("Can pay with cash: " + cashPayment2.canPay());
        cashPayment2.executePayment();

        System.out.println("\n--- Debit Card Payment Test ---");
        CardPayment debitPayment1 = new CardPayment(200, debitCard);
        System.out.println("Can pay with debit card: " + debitPayment1.canPay());
        debitPayment1.executePayment();
        account1.displayAccountInfo();

        CardPayment debitPayment2 = new CardPayment(900, debitCard);
        System.out.println("Can pay with debit card: " + debitPayment2.canPay());
        debitPayment2.executePayment();
        account1.displayAccountInfo();

        System.out.println("\n--- Credit Card Payment Test ---");
        CardPayment creditPayment1 = new CardPayment(100, creditCard);
        System.out.println("Can pay with credit card: " + creditPayment1.canPay());
        creditPayment1.executePayment();
        account2.displayAccountInfo();

        CardPayment creditPayment2 = new CardPayment(1000, creditCard);
        System.out.println("Can pay with credit card: " + creditPayment2.canPay());
        creditPayment2.executePayment();
        account2.displayAccountInfo();

        System.out.println("\n--- Wire Transfer Payment Test ---");
        WireTransferPayment wireTransferPayment1 = new WireTransferPayment(300, "12345", "67890", account1);
        System.out.println("Can pay with wire transfer: " + wireTransferPayment1.canPay());
        wireTransferPayment1.executePayment();
        account1.displayAccountInfo();

        WireTransferPayment wireTransferPayment2 = new WireTransferPayment(1100, "12345", "67890", account1);
        System.out.println("Can pay with wire transfer: " + wireTransferPayment2.canPay());
        wireTransferPayment2.executePayment();
        account1.displayAccountInfo();

        scanner.close();
    }
}