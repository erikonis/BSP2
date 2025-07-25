public class GroupTicket extends Ticket
{
    private int n;

    public GroupTicket(int size, int pN)
    {
        super(size);
        n = pN;
    }

    public double calculateTotalPrice()
    {
        double pricePerPerson = super.priceWithoutDiscout();
        double totalPrice = n * pricePerPerson;

        if(n == 1)
        {
            totalPrice = super.calculatePrice();
        }

        if(n <= 12 && n >= 6)
        {
            totalPrice = totalPrice *0.7;
        }
        else if(n > 12)
        {
            totalPrice = totalPrice *0.6;
        }
        return totalPrice;
    }

    public String toString()
    {
        
        double price;
        price = calculateTotalPrice();

        return super.toString() + price + "$";
    }
}
