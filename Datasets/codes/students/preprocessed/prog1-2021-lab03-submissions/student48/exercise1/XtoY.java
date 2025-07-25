import java.util.Scanner;

public class XtoY {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        double x = input.nextDouble();

        System.out.print("Enter 2nd number: ");
        double y = input.nextDouble();

        System.out.print("Enter decimal: ");
        double d = input.nextDouble();

        double min = Math.min(x,y);
        double max = Math.max(x,y);

        for (; min <= max;) {
            System.out.println(min);
            min += d;
        }

        input.close();

    }
}
