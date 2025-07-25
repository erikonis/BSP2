public class launcher2 {
    public static void main(String[] args) {

        Pavilion pav1 = new Pavilion("pav1", 100);
        Pavilion pav2 = new Pavilion("pav2", 80);
        Pavilion pav3 = new Pavilion("pav3", 50);
        Pavilion pav4 = new Pavilion("pav4", 100);
        Pavilion pav5 = new Pavilion("pav5", 80);
        Pavilion pav6 = new Pavilion("pav6", 50);
        Pavilion pav7 = new Pavilion("pav7", 100);
        Pavilion pav8 = new Pavilion("pav8", 80);
        Pavilion pav9 = new Pavilion("pav9", 50);

        Pavilion[] pavs = { pav2, pav3, pav4, pav1, pav5 };
        Ticket tc1 = new Ticket(pavs);

        Pavilion[] pavs2 = { pav4, pav8, pav7, pav6, pav9 };
        Ticket tg1 = new GroupTicket(pavs2, 8);

        System.out.println(tc1);
        System.out.println(tg1);
    }
}