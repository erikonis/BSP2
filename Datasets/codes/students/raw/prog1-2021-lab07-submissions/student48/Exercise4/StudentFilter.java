package lu.uni.programming1.lab7.Exercise4;

import java.util.Scanner;
import java.util.Arrays;

public class StudentFilter extends Filter {
    Scanner scanner = new Scanner(System.in);
    Person[] peoplelist;
    Person[] newlist;

    public StudentFilter(Person[] peoplelist) {
        this.peoplelist = peoplelist;
    }

    public StudentFilter() {
    }

    @Override
    void applyFilter() {

        for (int i = 0; i < peoplelist.length; i++) {
            if (peoplelist[i].isStudying() == true && peoplelist[i].isTeaching() == false)
                for (int j = i; j < peoplelist.length - 1; j++)
                    peoplelist[j] = peoplelist[j + 1];
        }
        for (int i = 0; i < peoplelist.length; i++) {
            if (peoplelist[i].isStudying() == true && peoplelist[i].isTeaching() == false)
                for (int j = i; j < peoplelist.length - 1; j++)
                    peoplelist[j] = peoplelist[j + 1];
        }

        System.out.print("\nIs this the extra filter? ");
        String answer = scanner.next();
        if (answer.equals("no")) {
            newlist = Arrays.copyOf(peoplelist, peoplelist.length - 2);
            System.out.print("\nAfter filtering out the students, this is the new list:");
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
            case "lecturers":
                newlist = Arrays.copyOf(peoplelist, peoplelist.length - 6);
                break;
            case "tas":
                newlist = Arrays.copyOf(peoplelist, peoplelist.length - 3);
                break;
            case "middles":
                newlist = Arrays.copyOf(peoplelist, peoplelist.length - 4);
                break;
            case "juniors":
                newlist = Arrays.copyOf(peoplelist, peoplelist.length - 3);
                break;
            default:
                System.out.println("This is not a subset.");
                break;
            }
            System.out.print("\nAfter filtering out the students, this is the new list:");
            for (int i = 0; i < newlist.length; i++) {
                System.out.print(" " + newlist[i]);
            }
        }
    }
}
