package Exercises.exercise1;

public class Ticket extends Person
{
    private Transport transport;

    public Ticket(Adress pA, String pIName, String pP, String pLN, Countries pCountry, Transport t) {
        super(pA, pIName, pP, pLN, pCountry);
        transport = t;
    }

    public double calculatePrice()
    {
        double price = super.getC().getPay() + transport.getShippingPrice();
        return price;
    }

    public String printTicket()
    {
        String text = "Shipping for " + super.getPronoun() + ". " + super.getLastName() + ", ("
        + super.getAdress() + ", " + super.getC().getName() + "),\n\tItem: " + super.getItemName()
        + ",\n\tShipping methode: " + transport.getName() + ". Handeling in "
        + transport.getDays() + " day,\n\tTOTAL cost: " + calculatePrice() + " EUR";
        return text;
    }
}
