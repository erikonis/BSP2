import java.util.Date;

public class Ticket {
    private static String ticketID;
    private static Date emissionDate;
    private static Pavilion[] array;

    public Ticket(String ticketID, Date emissionDate, Pavilion[] array) {
        this.ticketID = ticketID;
        this.emissionDate = emissionDate;
        this.array = array;
    }

    public static String getticketID() {
        return ticketID;
    }

    public static Date getemissinDate() {
        return emissionDate;
    }

    public static Pavilion[] getarray() {
        return array;
    }

    public void setticketID(String ticketID) {// setter
        this.ticketID = ticketID;
    }

    public void setDate(Date emissionDate) {// setter
        this.emissionDate = emissionDate;
    }

    public void setarray(Pavilion[] array) {// setter
        this.array = array;
    }

    public double priceTicket() {
        double price = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < 3) {
                price = price + array[i].getPrice();
            } else {
                price = price + array[i].getPrice() * 0.7;
            }
        }
        return price;
    }

}
