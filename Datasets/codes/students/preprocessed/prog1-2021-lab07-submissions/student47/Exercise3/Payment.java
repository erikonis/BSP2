public abstract class Payment {
    protected Person from, to;
    protected double amount;

    public Payment(Person from, Person to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public abstract boolean check();

}
