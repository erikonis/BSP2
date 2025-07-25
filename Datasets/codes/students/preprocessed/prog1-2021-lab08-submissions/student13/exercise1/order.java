public class order {

    private person n;
    private item i;
    private Handling h;

    public order(person n, item i, Handling h) {
        this.n = n;
        this.i = i;
        this.h = h;
    }

    public void launchShipping()
    {
        int cost = (n.getCountry().getCost() + h.getCost());
            String dayString = "days";

            if (h == Handling.EXPRESS)
            {
                dayString = "day";
            }
            System.out.println("Shipping for " + n.getName() + ",");
            System.out.println("\t(" + n.getAddress() + ", " + n.getCountry() + "),");
            System.out.println("\tItem: " + i.getItemName() + ",");
            System.out.println("\tShipping Method: " + h + "[" + h.getCost() + " €]. Handling in " + h.getDuration() + " " + dayString + ",");
            System.out.println("\tTotal cost = " + cost + " €");
    }
    
}
