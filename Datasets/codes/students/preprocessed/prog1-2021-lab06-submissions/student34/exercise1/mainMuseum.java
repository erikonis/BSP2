import java.util.Date;

public class mainMuseum {

    public static void main(String[] args) {
		Pavilon  Pavilon1 = new Pavilon("Pav1", 10.0);
        Pavilon  Pavilon2 = new Pavilon("Pav2", 10.0);
		Pavilon  Pavilon3 = new Pavilon("Pav3", 10.0);
        Pavilon  Pavilon4 = new Pavilon("Pav4", 10.0);
		Pavilon  Pavilon5 = new Pavilon("Pav5", 10.0);
        Pavilon  Pavilon6 = new Pavilon("Pav6", 10.0);
		Pavilon  Pavilon7 = new Pavilon("Pav7", 10.0);
		Date date =new Date();
		int ticketID = 0;

		//CASE1//


        Pavilon[] case1 = new Pavilon[3];
        case1[0]= Pavilon1;
        case1[1]= Pavilon2;
		case1[2]= Pavilon3;

		//CASE2//


		Pavilon[] case2 = new Pavilon[4];
		case2[0]= Pavilon1;
		case2[1]= Pavilon2;
		case2[2]= Pavilon3;
		case2[3]= Pavilon4;

		//CASE3//

		int n=8;

		Pavilon[] case3 = new Pavilon[5];
		case3[0]= Pavilon1;
		case3[1]= Pavilon2;
		case3[2]= Pavilon3;
		case3[3]= Pavilon4;
		case3[4]= Pavilon5;

		//CASE4//

		int n2=20;

		Pavilon[] case4 = new Pavilon[7];
		case4[0]= Pavilon1;
		case4[1]= Pavilon2;
		case4[2]= Pavilon3;
		case4[3]= Pavilon4;
		case4[4]= Pavilon5;
		case4[5]= Pavilon6;
		case4[6]= Pavilon7;


        
        Ticket Ticket1 = new Ticket(ticketID, date, case1);
		Ticket Ticket2 = new Ticket(ticketID, date, case2);
		GroupTicket Ticket3 = new GroupTicket(ticketID, date, case3, n);
		GroupTicket Ticket4 = new GroupTicket(ticketID, date, case4, n2);
		


		System.out.println(Ticket1);
		System.out.println(Ticket2);
		System.out.println(Ticket3);
		System.out.println(Ticket4);



	}
    
}
