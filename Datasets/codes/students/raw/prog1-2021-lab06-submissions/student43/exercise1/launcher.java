package lu.uni.programming1.lab6.exercise1;

public class launcher {
    public static void main(String[] args) {
        Pavilion[] museum = { new Pavilion("History\n", 10), new Pavilion("Geography\n", 10),
                new Pavilion("Astronomy\n", 10), new Pavilion("Solar system\n", 10) };
        Ticket t3 = new Ticket(museum);
        groupTicket gt = new groupTicket(museum, 13);
        System.out.println(t3);
        System.out.println(gt);
    }
}