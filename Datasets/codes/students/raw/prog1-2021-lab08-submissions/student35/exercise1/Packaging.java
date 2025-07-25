package exercise1;

public class Packaging {
    private Person person;
    private Destination destination;
    private ShippingSpeed speed; 
    private String name;
    private int cost;
    Packaging(Person person, Destination destination, ShippingSpeed speed, String name){
        this.person = person;
        this.destination = destination;
        this.speed = speed;
        this.name = name;
        cost = destination.getCost() + speed.getCost();
    }
    //packaging accepts a person, destination, speed and name (for the item) to be delivered
    //constructor calculates the combined costs of the shipping speed and destination
    public void Display(){
        System.out.println("Shipping for "+person.getName()+", ("+person.getAddress()+", "+destination.getName()+"),");
        System.out.println("\t Item: "+name+", ");
        System.out.println("\t Shipping method: "+speed.getName()+". Handling in "+speed.getHandlingtime()+",");
        System.out.println("\t Total cost: "+cost+" EURO");
    }
}
