import lu.uni.programming1.lab8.exercise1.Delivery.Method;
import lu.uni.programming1.lab8.exercise1.Recipient.Location;

public class Main {
    public static void main(String[] args) {

        

        Recipient recipient = new Recipient("Mr.", "Steve", "Kleren", "rue Hanzenthal", "Dudelange", 8, 3553, Location.LUXEMBOURG, new Delivery(Method.CLASSIC) , new Item("Aquarium"));

        System.out.println(recipient.toString());

        Recipient recipient2 = new Recipient("Ms.", "Kaya", "Anoushka", "Augustinustr.", "Trier", 15, 54296, Location.GERMANY, new Delivery(Method.EXPRESS), new Item("Airsoft Gun"));

        System.out.println(recipient2.toString());

        Recipient recipient3 = new Recipient("Mr.", "Tony", "Van Stark", "Rue de l'Eglise", "Arlon", 206, 34521, Location.BELGIUM, new Delivery(Method.PRIORITY), new Item("iPad Air 2017"));

        System.out.println(recipient3.toString());

        Recipient recipient4 = new Recipient("Mr.", "Jean", "Flemming", "Route de Lyon", "Marseille", 4, 75422, Location.FRANCE, new Delivery(Method.NORUSH), new Item("Extravirgin Olive Oil"));
        
        System.out.println(recipient4.toString());

    }
}
