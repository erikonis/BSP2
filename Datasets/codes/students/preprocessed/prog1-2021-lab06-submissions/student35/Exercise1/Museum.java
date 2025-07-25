import java.util.Date;
import java.util.UUID;

public class Museum {
    static Pavilion pavilion = new Pavilion(Pavilion.getName(), Pavilion.getPrice());
    static Ticket ticket = new Ticket(Ticket.getticketID(), Ticket.getemissinDate(), Ticket.getarray());
    static Pavilion pav[] = { pavilion };
    static Pavilion pav2 = new Pavilion(Pavilion.getName(), Pavilion.getPrice());
    static Pavilion pav3 = new Pavilion(Pavilion.getName(), Pavilion.getPrice());
    static Pavilion pav4 = new Pavilion(Pavilion.getName(), Pavilion.getPrice());

    static String str = " ";
    static double money = 20;

    public static void main(String[] args) {
        pav2.setPrice(5);
        pav2.setName("pav2");
        pav3.setPrice(3);
        pav3.setName("pav3");
        pav4.setPrice(10);
        pav4.setName("pav4");
        init();
        pavilion.setName(" Pavilion ");
        checkCondition();
        System.out.println("—— Welcome to Luxemobourg History Museum ——\n" + "Ticket ID: " + ticket.getticketID() + "\n"
                + "Date: " + ticket.getemissinDate() + "\n" + "You can visit: " + str + "\n" + "Total cost is: "
                + pavilion.getPrice());
    }

    public static void init() {
        ticket.setticketID(UUID.randomUUID().toString());
        ticket.setDate(new Date());
        ticket.setarray(pav);
        pavilion.setPrice(15);
    }

    public static void checkCondition() {
        if (pavilion.getPrice() <= money)
            str += "pav1";
        if (pav2.getPrice() <= money)
            str += "pav2";
        if (pav3.getPrice() <= money)
            str += "pav3";
        if (pav4.getPrice() <= money)
            str += "pav4";

    }
}
