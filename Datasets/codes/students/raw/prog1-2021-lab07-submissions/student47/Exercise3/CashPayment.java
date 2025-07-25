package Exercise3;

public class CashPayment extends Payment {

    public CashPayment(Person from, Person to, double amount) {
        super(from, to, amount);
    }

    public boolean check() {
        if (from.getMoney() >= amount) {
            System.out.println("Cash payment possible");
            return true;
        } else {
            System.out.println("Cash payment impossible");
            return false;
        }
    }

    public void execute() {
        if (check()) {
            from.currentMoney -= amount;
            to.currentMoney += amount;
            System.out.println("Payment executed! \n" + to.getName() + " received " + amount + " from " + from.getName()
                    + " by cash.");

        }

    }

}
