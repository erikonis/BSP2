import java.util.Scanner;

public class Visitors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Did you come with a group? (\"yes\" or \"no\")");
        String input1 = scanner.next();

        if (input1.equals("yes")) {
            int loop = 2;

            System.out.println("How many people are in your group?");
            int numberOfPeople = scanner.nextInt();

            GroupTicket groupTicket = new GroupTicket();

            groupTicket.setN(numberOfPeople);
            groupTicket.makePavilions();

            while (loop > 1) {
                String input2 = "";

                System.out.println("What pavilion do you want to visit? (\"pav1\" to \"pav9\")");
                String pavName = scanner.next();

                System.out.println("What does it cost?");
                double pavCost = scanner.nextDouble();

                System.out.println("Do you want to visit another pavilion? (\"yes\" or \"no\")");
                input2 = scanner.next();

                if (input2.equals("no")) {
                    loop = -1;
                }

                groupTicket.wantToVisitPavilion(pavName, pavCost);
            }

            System.out.println(groupTicket.toString());

        } else if (input1.equals("no")) {
            int loop = 2;

            Ticket ticket = new Ticket();

            ticket.makePavilions();

            while (loop > 1) {
                String input3 = "";

                System.out.println("What pavilion do you want to visit? (\"pav1\" to \"pav9\")");
                String pavName = scanner.next();

                System.out.println("What does it cost?");
                double pavCost = scanner.nextDouble();

                System.out.println("Do you want to visit another pavilion? (\"yes\" or \"no\")");
                input3 = scanner.next();

                if (input3.equals("no")) {
                    loop = -1;
                }

                ticket.wantToVisitPavilion(pavName, pavCost);
            }

            System.out.println(ticket.toString());
        }
    }

}
