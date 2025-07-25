package exercise1;

public class museum {
    public static void main(String[] args) {
        Pavilion pav1 = new Pavilion(15.0, "one");
        Pavilion pav2 = new Pavilion(25.0, "two");
        Pavilion pav3 = new Pavilion(35.0, "three");
        Pavilion pav4 = new Pavilion(45.0, "four");
        Pavilion pav5 = new Pavilion(55.0, "five");
        Pavilion pav6 = new Pavilion(65.0, "six");
        Pavilion pav7 = new Pavilion(75.0, "seven");
        Pavilion pav8 = new Pavilion(85.0, "eight");
        Pavilion pav9 = new Pavilion(95.0, "nine");
        Ticket snob = new Ticket(pav7,pav8,pav9);
        Ticket thrifty = new Ticket(pav1, pav2);
        Ticket historian = new Ticket(pav3, pav4, pav5, pav6);
        GroupTicket students = new GroupTicket(30, pav1, pav2, pav3, pav4, pav5, pav6);
        //setting up a bunch of variables to show it off, and then prints them nicely
        snob.toString();
        thrifty.toString();
        historian.toString();
        students.toString();

    }
}
