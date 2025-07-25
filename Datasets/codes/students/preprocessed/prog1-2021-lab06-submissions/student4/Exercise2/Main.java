public class Main {

    public static void main(String[] args) {
        Airport airport1 = new Airport("Sydney", "Australia", "SYD");
        Airport airport2 = new Airport("Luxembourg", "Luxembourg", "LXB");
        Flight flight1 = new Flight("A380", airport2, airport1);
        Person p1 = new Pilot("Pete MAVERICK", "PM49279", "TOP GUN");
        Person p2 = new Person("Mike ROSS", "MR349251");

        System.out.println("Welcom "+ p2+ "\nMember Card: 2496-7954-3648");
        System.out.println("Your pilot is: "+p1);
        System.out.println(flight1);
        System.out.println("Gate 24\nBording time: 15h35\nSeat 12c ");
        
    }
    
}
