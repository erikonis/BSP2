public class GroupTicket extends Ticket {
    private int n;

    public GroupTicket(Pavilion[] pavs, int n) {
        super(pavs);

        this.n = n;
    }

    public double calculateGroupCost(){
        double totalCost = 0;

        totalCost += super.calculateCost(false) * n;

        if (n >5 && n<13) {totalCost /= 1.3;}
        else if (n>12) {totalCost /= 1.4;}

        return totalCost;
    
    
    }

    @Override
    public String toString() {

        return super.toString() + " per person (" + this.n + ")\n\tTotal cost : " + this.calculateGroupCost() + "€ (after discounts)";
}

}
