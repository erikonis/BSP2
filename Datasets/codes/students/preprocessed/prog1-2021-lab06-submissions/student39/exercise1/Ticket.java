import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class Ticket {
    private Date emissionDate;
    private UUID ticketID;
    private Pavilion[]pav;
    private double price;
    private int l, c1,c2;
    Random rand = new Random();
    //sets up the variables for the tickets
    Ticket(Pavilion... pav){
    this.pav=pav;
    c1 = 0;
    c2 = 0;
    l = pav.length;
    //counts the number of pavilions visited
    emissionDate = new Date();
    //sets the date and time when the ticket is made
    ticketID = new UUID(rand.nextInt(), rand.nextInt());
    //sets the random ID for the ticket
    while (c1<l){
            if (c1<=2){
                price = price + pav[c1].getPrice();}
            if (c1>2){
                price = price + ((pav[c1].getPrice())*0.7);}
            c1++;}
            //loop setting up the price for one person. the first three are full price, the next are 30% off
    // if (c1>2){
    //     price = price*0.7;}
    }
    public double setPrice(int n){
        c1 = 0;
        while (c1<l){
            //loop for the prices, n is the number of people
            if (n==1){
            if (c1<=2){
                price = price + pav[c1].getPrice();}
            if (c1>2){
                price = price + ((pav[c1].getPrice())*0.7);}}
                //price for one person, same as the one in the constructor
            if (n>1){
                price = price + pav[c1].getPrice();}
            c1++;}
            //for 2 or more people, base ticket price for all pavilions at full price,
            if ((n>=6)&&(n<=12)){
            price = price*0.7;}
            //6-12 people get a 30% discount on the whole base price
            if (n>12){
                price=price*0.6;}
                //12 or more get a 40% discount on the whole price
            return price;}


    public Date getDate(){
        return emissionDate;}
    public UUID getID(){
        return ticketID;}
    public double getPrice(){
        return price;}
        //getters for the variables
        @Override
    public String toString(){
        System.out.println("— Welcome to Luxemobourg History Museum —");
        System.out.println("\t Ticket ID: "+ticketID);
        System.out.println("\t Date: "+emissionDate);
        System.out.print("\t You can visit: ");
        while (c2<l-1){
        System.out.print(pav[c2].getName());
        System.out.print(" ");
        c2++;}
        System.out.println("");
        System.out.println("\t Total cost is: "+price+"€");
        System.out.println(" ");
        System.out.println(" ");
        return "";}
        //prints all the data, formatted as requested
}
