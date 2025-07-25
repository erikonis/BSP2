package lu.uni.programming1.lab8.exercise1;

public class Shipping {

    private HandlingTimes handlingTime;
    private String item;
    private Recipient recipient;

    public Shipping(Recipient recipient, HandlingTimes handlingTime, String item) {
        this.recipient = recipient;
        this.handlingTime = handlingTime;
        this.item = item;
    }

    @Override
    public String toString(){
        double total = recipient.getCountry().fee + handlingTime.fee;

        return  "Shipping for " + recipient.toString() + ", \n" +
                "\tItem: " + item + ", \n"+
                "\tShipping method: " + handlingTime +". Handling in " + handlingTime.time + ", \n" +
                "\tTOTAL cost: " + total + " EUR";
    }
}
