import java.util.Scanner;

public class mainStudent {
    public static void main(String[] args) {
        System.out.println("Enter the maximum number of students: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Students l1 = new Students(n);

        l1.add("Leila");
        l1.add("Luke");
        l1.add("Han");
        l1.add("Chewbacca");
        l1.add("Obi-Wan");
        l1.printList();

        l1.remove("Luke");

        l1.printList();

        l1.contains("Han");

        l1.cleanList();
        l1.printList();

        input.close();
    }
}