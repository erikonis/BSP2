public class MainClass
{
    public static void main(String[] args) {
        Adress a1 = new Adress("Heustr", 18, 70174, "Stuttgard");
        Ticket t = new Ticket(a1, "Aquarium 30x50x80","Mr", "Rothkugel", Countries.GER, Transport.EXPRESS);
        System.out.println(t.printTicket());
        
        //Adress a2 = new Adress("Rue Du Parch", 64, 4321, "Differdange");
        //Ticket tt = new Ticket(a2,"VR-360", "Mr", "Topal", Countries.LUX, Transport.NORUSH);
        //System.out.println(tt.printTicket());
    }
}
