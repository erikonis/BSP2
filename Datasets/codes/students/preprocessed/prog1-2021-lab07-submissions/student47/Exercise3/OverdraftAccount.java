public class OverdraftAccount extends BankAccount {

    private double allowedOverdraft;

    public double getAllowedOverdraft() {
        return allowedOverdraft;
    }

    public OverdraftAccount(double balance, double allowedOverdraft) {
        super(balance);
        this.allowedOverdraft = allowedOverdraft;
    }

    public boolean withdraw(double w) {
        if (w > 0)
            if (balance >= w) {
                balance -= w;

                return true;
            } else if (balance + allowedOverdraft >= w) {
                w -= balance;
                balance = 0;
                allowedOverdraft -= w;
                System.out.println("Overdraft exceeded by:" + w);
                return true;
            }

            else {
                System.out.println("Insufficient funds!");
                return false;
            }
        else {
            System.out.println("You cannot withdraw a negative amount ;/");
            return false;
        }

    }

    public void printBalance() {
        System.out.println("The current balance of is:" + balance + "\nOverdraft left:" + allowedOverdraft);
    }

}
