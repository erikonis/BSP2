public class GroupTicket extends Ticket {
    private int n;

    public GroupTicket(Pavilion[] pavilions, int n) {
        super(pavilions);
        this.n = n;
    }

    public int getN() {
        return this.n;
    }

    public double costDoubleTicket(){
        double cost = 0;
        if(n < 6){
            // Same rule as for a single Person
            cost = super.costTicket();
        }else if(n > 12){
            for(int i = 0; i < pavilions.length; i++){
                cost += pavilions[i].getPrice();
            }
            // 40% Discount on the whole ticket
            cost = cost*0.6;
        }else{
            for(int i = 0; i < pavilions.length; i++){
                cost += pavilions[i].getPrice();
            }
            // 30% discount on the whole ticket
            cost = cost*0.7;
        }
        return n*cost;
    }

    @Override
    public String toString() {
        return "\n\t-** Group Ticket **-" + super.toString();
    }
}
