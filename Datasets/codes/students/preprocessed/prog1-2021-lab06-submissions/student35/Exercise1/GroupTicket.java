import java.util.Date;

public class GroupTicket extends Ticket {
    int n;

    public GroupTicket(String ticketID, Date emissionDate, Pavilion[] array) {
        super(ticketID, emissionDate, array);
        // TODO Auto-generated constructor stub
    }

    public int getVisitors() {
        return n;
    }

    public void setVisitors(int n) {// setter
        this.n = n;
    }

    public double price() {
        double price = 0;
        if (n >= 6 && n <= 12) {
            price = priceTicket() * 0.7;
        } else if (n > 12) {
            price = priceTicket() * 0.6;
        }
        return price;
    }
}
