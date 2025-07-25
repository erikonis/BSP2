package Exercise1;



public class TestProgram {

    public static void main(String[] args) {
        
Pavilion pav1 = new Pavilion("Pavilion 1 ", 50);
Pavilion pav2 = new Pavilion("Pavilion 2 ", 60);
Pavilion pav3 = new Pavilion("Pavilion 3 ", 70);
Pavilion pav4 = new Pavilion("Pavilion 4 ", 80);
Pavilion pav5 = new Pavilion("Pavilion 5 ", 90);


Pavilion[] pav = {pav1,pav2,pav3,pav4,pav5};

Ticket ticket1 = new Ticket(pav);
Groupticket ticket2 = new Groupticket(pav, 13);
int n = 13;
double sum = ticket2.getsum();

double discount1 = (sum - (30*sum)/100);
double discount2 = (sum - (40*sum)/100);






 

System.out.println();
ticket1.TicketPrint();

System.out.println();
System.out.println();

 


ticket2.TicketPrint();{



if ((n >= 6) && (n<=12));{
   
System.out.println("If you are a group with between 5 and 13 people");
System.out.println("Your new total cost is:  "+ discount1);

}

 if (n>12);{
    System.out.println("If you are a group with over 12 people");
    System.out.println("Your new total cost is:  "+ discount2);
    }


}
    }
}
 
