import java.util.Scanner;

public class CashPayment extends Payment {
    private double givenMoney;

    public CashPayment(double amount) {
        super(amount);
    }

    public void setGivenMoney(double givenMoney) {
        this.givenMoney = givenMoney;
    }

    @Override
    public boolean canPay() {
        // For simplicity, we assume the user will provide enough cash when prompted
        return true;
    }

    @Override
    public double executePayment() {
        Scanner scanner = new Scanner(System.in);
        double payment;
        while (true) {
            System.out.print("Enter the cash amount given: ");
            if (scanner.hasNextDouble()) {
                givenMoney = scanner.nextDouble();
                if (givenMoney >= amount) {
                    payment = amount;
                    break;
                } else {
                    System.out.println("Insufficient cash. Please provide at least " + amount);
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // consume the invalid input
            }
        }
        return givenMoney - payment;
    }
}