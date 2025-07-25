import java.util.Scanner;

// Forward declaration of BankAccount to resolve circular dependency.  In a real scenario,
// you'd likely have these classes in separate files.
class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
            return true;
        } else {
            System.out.println("Insufficient funds for withdrawal of " + amount);
            return false;
        }
    }

     public boolean withdraw(double amount, double overdraftLimit) {
        if (amount > 0 && (balance - amount) >= -overdraftLimit) {
            this.balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
            return true;
        } else {
            System.out.println("Insufficient funds for withdrawal of " + amount + " (including overdraft).");
            return false;
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// Base class for all payment types
abstract class Payment {
    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    // Abstract methods to be implemented by derived classes
    public abstract boolean canPay();
    public abstract double executePayment();
}

// Represents a cash payment
class CashPayment extends Payment {
    private double givenMoney;

    public CashPayment(double amount, double givenMoney) {
        super(amount);
        this.givenMoney = givenMoney;
    }

    public double getGivenMoney() {
        return givenMoney;
    }

    @Override
    public boolean canPay() {
        return givenMoney >= getAmount();
    }

    @Override
    public double executePayment() {
        if (canPay()) {
            double change = givenMoney - getAmount();
            System.out.println("Cash payment of " + getAmount() + " successful. Change: " + change);
            return change;
        } else {
            System.out.println("Insufficient cash provided.");
            return -1; // Indicate failure
        }
    }
}

// Represents a bank card
class Card {
    private String cardNumber;
    private BankAccount bankAccount;
    private String cardType; // "debit" or "credit"

    public Card(String cardNumber, BankAccount bankAccount, String cardType) {
        this.cardNumber = cardNumber;
        this.bankAccount = bankAccount;
        this.cardType = cardType;
    }

    public String getCardNumber(){
        return cardNumber;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public String getCardType() {
        return cardType;
    }
}

// Represents a card payment
class CardPayment extends Payment {
    private Card card;

    public CardPayment(double amount, Card card) {
        super(amount);
        this.card = card;
    }

    public Card getCard() {
        return card;
    }

    @Override
    public boolean canPay() {
        if (card.getCardType().equalsIgnoreCase("debit")) {
            return card.getBankAccount().getBalance() >= getAmount();
        } else if (card.getCardType().equalsIgnoreCase("credit")) {
            // For credit cards, check against balance + overdraft
            return true; // Assume overdraft is always sufficient in this simplified model.
        }
        return false; //Should not reach here
    }

   @Override
    public double executePayment() {
        if (card.getCardType().equalsIgnoreCase("debit")) {
            if (card.getBankAccount().withdraw(getAmount())) {
                System.out.println("Debit card payment of " + getAmount() + " successful.");
                return 0;
            } else {
                System.out.println("Debit card payment failed.");
                return -1;
            }
        } else if (card.getCardType().equalsIgnoreCase("credit")) {
            double overdraftLimit = 500;
            if(card.getBankAccount().withdraw(getAmount(), overdraftLimit)){
                System.out.println("Credit card payment of " + getAmount() + " successful.");
                return 0;
            }
            else{
                 System.out.println("Credit card payment failed.");
                 return -1;
            }

        } else {
            System.out.println("Invalid card type.");
            return -1;
        }
    }
}

//Added new payment type
class WireTransferPayment extends Payment{
    private String senderAccountNumber;
    private String receiverAccountNumber;
    private BankAccount senderAccount;

    public WireTransferPayment(double amount, String senderAccountNumber, String receiverAccountNumber, BankAccount senderAccount){
        super(amount);
        this.senderAccountNumber = senderAccountNumber;
        this.receiverAccountNumber = receiverAccountNumber;
        this.senderAccount = senderAccount;
    }
    public String getSenderAccountNumber(){
        return senderAccountNumber;
    }
     public String getReceiverAccountNumber(){
        return receiverAccountNumber;
    }

    @Override
    public boolean canPay(){
        return senderAccount.getBalance() >= getAmount();
    }

    @Override
    public double executePayment(){
        if(canPay()){
            senderAccount.withdraw(getAmount());
            System.out.println("Wire transfer of " + getAmount() + " from account " + senderAccountNumber + " to " + receiverAccountNumber + " successful.");
            return 0;
        }
        else{
            System.out.println("Wire transfer failed due to insufficient funds.");
            return -1;
        }
    }
}
// Main program to test the implementation
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

