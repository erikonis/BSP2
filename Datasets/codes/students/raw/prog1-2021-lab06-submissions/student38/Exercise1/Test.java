package Exercise1;
import java.util.Scanner;


public class Test {



    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Pavilion tempPav = new Pavilion(null, 0); 

        int groupnumberofpeople =0;
        double finalpricebeforediscountinthiscase=0;


    // first we define a few Pavilions

    Ticket testticket = new Ticket(null); 

    testticket.resetPavs();    testticket.generateRandomTicketID();

    testticket.definePav("pav1", 20);
    
    testticket.definePav("pav2", 10);

    testticket.definePav("pav3", 15);

    testticket.definePav("pav4", 25);

    testticket.definePav("pav5", 35);

    System.out.println("The current Pavilions you may visit today are: " + testticket.report());

    System.out.println("Would you like to buy a group ticket? y/n ");

        char g = sc.nextLine().charAt(0);

        if (g!='y' && g!='n') {System.out.println("Invalid option. Exiting... "); sc.close(); System.exit(0);};

    

    do {
    System.out.println("Current selected pavilions: " + testticket.report() + " Type the name of the pavilion(s) if you would like to remove one/any or press D to get a quote: ");
        
    tempPav.setName(sc.next().toString()); if (    (( (tempPav.getName() ).toString()).equals("D")  )==false   )
    
    { testticket.removePav(tempPav.getName()); };    }     while (!tempPav.getName().equals("D"));

    if (g=='y') { 
        
        System.out.println("How many people in the group? ");

        groupnumberofpeople =sc.nextInt();

        finalpricebeforediscountinthiscase+=(whatisthefinalprice(testticket)); System.out.println(" The undiscounted price so far is: " + finalpricebeforediscountinthiscase);



        GroupTicket grouptestticket = new GroupTicket(testticket, groupnumberofpeople);

        grouptestticket.setN(groupnumberofpeople);

        grouptestticket.generateRandomTicketID();

        double finalpriceafter = finalpricebeforediscountinthiscase;  System.out.println("... still undiscounted so far... "+ finalpriceafter);
        


        System.out.println( "-**Group Ticket **- \n  Number of people: " + groupnumberofpeople + " \n"
        );
        testticket.reportFinal(); 
        
        
        //if (groupnumberofpeople>=6 && groupnumberofpeople<=12)  System.out.println(finalpriceafter*(2/3d)); 
        //if (groupnumberofpeople>12) System.out.println(finalpriceafter*(2/5d)); 
        
        System.out.println(Double.toString(grouptestticket.discountRate(finalpriceafter)));

    }
    
    else { testticket.reportFinal(); System.out.println(whatisthefinalprice(testticket));};

    
sc.close();


    }
    


            

            public static int  howManyPav2 (Ticket ticket) {

                int noOfPav = 0;
                for (int i=0; i<=8; i++) if (ticket.pavSelected[i]==true) noOfPav+=1;
                return noOfPav;
        
            }


            public static double whatisthefinalprice(Ticket ticket) {

                double adding =0;
                double finalticketprice;


                int counter=0;

                if (howManyPav2(ticket)<4) {


                for (int i=0; i<=(howManyPav2(ticket))-1; i++) {

                    if (ticket.pavSelected[i]==true) {

                    adding+= ticket.pavilions[i].getPrice();



                    };};

                } else {

                    for (int i=0; i<=howManyPav2(ticket)-1; i++) {

                        if (ticket.pavSelected[i]==true) {
    

                            if (counter<4) {
                        adding+= ticket.pavilions[i].getPrice();  }

                        else { adding+= (ticket.pavilions[i].getPrice())*(2/3); };
    
                                counter+=1;
    
                        };






                }; };
                
                
                
                
                


                    finalticketprice=adding;

                    return finalticketprice;


            }











}