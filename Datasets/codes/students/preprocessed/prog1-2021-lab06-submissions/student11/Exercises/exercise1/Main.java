import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To buy a normal ticket write *normal* or to buy a group ticket write *group*");
        String answer = scanner.next();
        if (answer.equals("normal")) {
            System.out.println(System.lineSeparator() + " Enter the number of pavilions which you want to visit: ");
            int number = scanner.nextInt();
            Ticket normal = new Ticket(number);

            for (int i = 0; i < number; i++) {
                System.out.println(System.lineSeparator() + " Enter then name of the (" + (i + 1) + ") pavilion : ");
                String name = scanner.next();
                System.out.println(System.lineSeparator() + " Enter the price of the (" + (i + 1) + ") pavilion : ");
                double price = scanner.nextDouble();
                normal.setPavilion(i, name, price);

            }
            System.out.println(System.lineSeparator()+normal.toString());

        }
        if (answer.equals("group")) {
            System.out.println(System.lineSeparator() + " Enter the number of pavilions which you want to visit: ");
            int number = scanner.nextInt();
            System.out.println(System.lineSeparator() + " Enter the number of people in your group: ");
            int groupnumber = scanner.nextInt();

            GroupTicket group = new GroupTicket(groupnumber, number);
            for (int i = 0; i < number; i++) {
                System.out.println(System.lineSeparator() + " Enter then name of the (" + (i + 1) + ") pavilion : ");
                String name = scanner.next();
                System.out.println(System.lineSeparator() + " Enter the price of the (" + (i + 1) + ") pavilion : ");
                double price = scanner.nextDouble();
                group.setPavilion(i, name, price);

            }
            System.out.println(System.lineSeparator()+group.toString());
        }
        scanner.close();
    }
}
