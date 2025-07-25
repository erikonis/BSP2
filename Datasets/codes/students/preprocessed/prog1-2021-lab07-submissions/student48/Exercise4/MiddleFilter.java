import java.util.Arrays;
import java.util.Scanner;

public class MiddleFilter extends Filter {
    Person[] peoplelist;
    Person[] newlist;
    Scanner scanner = new Scanner(System.in);

    public MiddleFilter(Person[] peoplelist) {
        this.peoplelist = peoplelist;
    }

    public MiddleFilter() {
    }

    @Override
    void applyFilter() {

        for (int i = 0; i < peoplelist.length; i++) {
            if (peoplelist[i].getAge() >= 28 && peoplelist[i].getAge() < 55)
                for (int j = i; j < peoplelist.length - 1; j++)
                    peoplelist[j] = peoplelist[j + 1];
        }
        for (int i = 0; i < peoplelist.length; i++) {
            if (peoplelist[i].getAge() >= 28 && peoplelist[i].getAge() < 55)
                for (int j = i; j < peoplelist.length - 1; j++)
                    peoplelist[j] = peoplelist[j + 1];
        }
        System.out.print("\nIs this the extra filter? ");
        String answer = scanner.next();
        if (answer.equals("no")) {
            newlist = Arrays.copyOf(peoplelist, peoplelist.length - 2);
            System.out.print("\nAfter filtering out the middles, this is the new list:");
            for (int i = 0; i < newlist.length; i++) {
                System.out.print(" " + newlist[i]);
            }

        } else if (answer.equals("yes")) {
            System.out.println("Which subset is it applied to?");
            String response = scanner.next();
            switch (response) {
            case "seniors":
                newlist = Arrays.copyOf(peoplelist, peoplelist.length - 4);
                break;
            case "students":
                newlist = Arrays.copyOf(peoplelist, peoplelist.length - 4);
                break;
            case "tas":
                newlist = Arrays.copyOf(peoplelist, peoplelist.length - 3);
                break;
            case "lecturers":
                newlist = Arrays.copyOf(peoplelist, peoplelist.length - 4);
                break;
            case "juniors":
                newlist = Arrays.copyOf(peoplelist, peoplelist.length - 5);
                break;
            default:
                System.out.println("This is not a subset.");
                break;
            }
            System.out.print("\nAfter filtering out the lecturers, this is the new list:");
            for (int i = 0; i < newlist.length; i++) {
                System.out.print(" " + newlist[i]);
            }
        }
    }
}
