package lu.uni.programming1.lab6.exercise1;

public class GroupTicket extends Ticket {
    
    private int n;

    public GroupTicket(Pavilion pavilion[], int visitors) {
        super(pavilion);
        this.n = visitors;
    }

    @Override
    public double Cost() {

        //applies possible discounts
        if (this.n >= 6 && this.n <= 12) {
            return super.Cost()*0.7;
        } else if (this.n > 12) {
            return super.Cost()*0.6;
        } else {
            return super.Cost();
        }
    }

    @Override
    public String toString() {
        return "        –** Group Ticket **–\n" + super.toString();
    }

}
