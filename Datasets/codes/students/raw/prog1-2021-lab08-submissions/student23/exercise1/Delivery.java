package lu.uni.programming1.lab8.exercise1;

public class Delivery { 
    private String item;
    private Person person;
    private DeliveryType deliveryType;
    
    public Delivery(DeliveryType deliveryType, String item, Person person) {
        this.deliveryType = deliveryType;
        this.item = item;
        this.person = person;
    }
    
    public void ship() {
        int totalCost = deliveryType.getCost() + person.getAddress().getCountry().getCost();
        System.out.printf("Shipping for %s, (%s),\n\tItem : %s,\n\tShipping method: %s[%d EUR]. %s,\n\tTOTAL cost: %d EUR", person.toString(), person.getAddress(), item, deliveryType, deliveryType.getCost(), deliveryType.getDuration(), totalCost);
    }

}
