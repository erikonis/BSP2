
public class LauncherEx1 {
    
        public static void main(String[] args) {
            

            Pavilion p0 = new Pavilion("Pavilion 1", 20);
            Pavilion p1 = new Pavilion("Pavilion 2", 204);
            Pavilion p2 = new Pavilion("Pavilion 3", 209);
            Pavilion p3 = new Pavilion("Pavilion 4", 90);
            Pavilion p4 = new Pavilion("Pavilion 5", 609);
            Pavilion[] pArr = {p0,p1,p2,p3,p4};
            Ticket t1 = new Ticket(pArr);
            GroupTicket t2 = new GroupTicket(pArr, 13);



            t1.ticketPrint();

            t2.ticketPrint();

        }
    }


