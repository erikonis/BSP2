package lu.uni.programming1.lab6.ex1;

public class GroupTicket extends Ticket {

    private int numberOfVisitors;

    public GroupTicket(Pavilion[] list, int numberOfVisitors) {
        super(list);
        this.numberOfVisitors = numberOfVisitors;
    }

    // GETTER:
    public int getNumberOfVisitors() {
        return numberOfVisitors;
    }

    @Override
    public double calculateCost() {
        double cost = 0;
        for (Pavilion pavilion : getPavilions()) {
            cost += pavilion.getPrice();
        }
        if (numberOfVisitors >= 6 && numberOfVisitors <= 12)
            cost = cost * 0.7;
        else if (numberOfVisitors > 12)
            cost = cost * 0.6;

        return cost;
    }

    @Override
    public String toString() {
        String ss = super.toString();
        return "\t\t--** Group Ticket **--\n" + ss + "\n";
    }
}