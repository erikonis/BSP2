package Exercise3;

public class NormalAccount extends BankAccount {

    public NormalAccount(double balance) {
        super(balance);
    }

    public double getAllowedOverdraft() {
        return 0;
    }

    public boolean withdraw(double w) {
        if (w > 0)
            if (balance >= w) {
                balance -= w;
                return true;
            } else {
                System.out.println("Insufficient funds!");
                return false;
            }
        else {
            System.out.println("You cannot withdraw a negative amount ;/");
            return false;
        }

    }

    public void printBalance() {
        System.out.println("The current balance of  is:" + balance);
    }
}
