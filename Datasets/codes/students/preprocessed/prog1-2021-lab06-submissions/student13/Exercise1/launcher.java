public class launcher {
    public static void main(String[] args) {
        Pavilion[] museum = { new Pavilion("History\n", 10), new Pavilion("Geography\n", 20),
                new Pavilion("Astronomy\n", 30), new Pavilion("Solar system\n", 40) };
        Ticket t3 = new Ticket(museum);
        groupTicket gt = new groupTicket(museum, 12);
        System.out.println(t3);
        System.out.println(gt);
    }
}