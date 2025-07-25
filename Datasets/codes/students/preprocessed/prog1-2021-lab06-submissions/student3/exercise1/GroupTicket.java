public class GroupTicket extends Ticket {
    private int n;
    public GroupTicket(int n, Pavilion[] pavilions) {
        super(pavilions);
        this.n = n;
    }
    public double getPrice() {
        double result = super.getPrice();
        if (n >= 6 && n <= 12) {
            result = result - result * 30 /100;
        }
        if (n > 12) {
            result = result - result * 40 /100; 
        }
        return result;
    }
    public String toString() {
        String result = "\t –** Group Ticket **–\n";
        result += super.toString();
        return result;
    }
}
