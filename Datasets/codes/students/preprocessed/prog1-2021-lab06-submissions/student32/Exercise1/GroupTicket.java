public class GroupTicket extends Ticket{
    //attribues
    private int n;
    private int max = 20;
    //I set min to 2 because if it was only 1 it was a simple ticket
    private int min = 2;


    public GroupTicket(){
        super();
        n = (int)(Math.random()*(max-min+1))+min;
    }

    public double calculatePrice(){
        double price = 0;
        Pavilion arr[] = super.getArr();
        if(n<6)
        {
            super.calculatePrice();
        }
        if(n>=6 && n<=12)
        {
            for(int i = 0; i<super.getMaxPav();i++)
            {
                price += arr[i].getPrice();
            }
            price = price - (price*0.3);
        }
        if(n>12)
        {
            for(int i = 0; i<super.getMaxPav();i++)
            {
                price += arr[i].getPrice();
            }
            price = price - (price*0.4);
        }
        return Math.round(price);
    }

    @Override
    public String toString(){
        return "\n\t-**Group Ticket**-"+super.toString();
    }

}
