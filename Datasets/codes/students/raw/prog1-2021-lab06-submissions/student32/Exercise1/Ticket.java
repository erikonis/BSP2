package Exercise1;

import java.util.Date;

public class Ticket {
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            int rnd = (int)(Math.random()*(2+1-1)+1);
            if(rnd == 1)
            System.out.println(new Ticket());

            if(rnd == 2)
            System.out.println(new GroupTicket());
        }
    }

    
    //attibues

    private int ticketID;
    private Date emissionDate;
    private Pavilion arr[];
    private int maxPav = 5;

    static int counter = 1;

    //methodes

    public Ticket()
    {
        idGeneration();
        emissionDate = new Date();
        arr = new Pavilion [maxPav];
        for(int i = 0; i<maxPav ;i++)
        {
            if(i==0)
            arr[i] = new Pavilion();

                     
            for(int j=0;j<maxPav;){
                Pavilion p = new Pavilion();
                if(p.getName().equals(arr[j].getName()))
                {} 
                else
                {
                    arr[i] = p;
                    break;
                }
                i--;       
            }
        }
        
    }
    public void idGeneration(){
        ticketID = counter;
        counter++;
    }
    public double calculatePrice(){
        double price = 0;
        for(int i = 0; i<3 ;i++)
        {
            price += arr[i].getPrice();
        }
        for (int i = 3; i<maxPav; i++)
        {
            price += arr[i].getPrice() - (arr[i].getPrice()*0.3);
        }
        return Math.round(price);
    }
    
    public String arrToString(){
        String list = "";
        for(int i = 0; i<maxPav;i++){
            list = list + " " + arr[i].getName();
        }
        return list;
    }
    
    public Pavilion[] getArr() {
        return arr;
    }
    public int getMaxPav() {
        return maxPav;
    }
    @Override
    public String toString(){
        return "\n--Welcome to Luxembourg History Museum--"
                +"\n"
                + "Ticket ID: " + ticketID
                +"\n"
                + "Date: " +emissionDate
                +"\n"
                + "You can visit: " + arrToString() 
                +"\n" 
                + "Total cost is: $" + calculatePrice();
    }
}
