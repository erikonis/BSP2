package exercise2;

import java.util.Scanner;

public class uselist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        studentlist l = new studentlist();
        boolean r = true;
        int i;
        System.out.println("List of Students attending in-person class:");
        l.setupList();
        while(r){
            System.out.println("What would you like to do?:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display list of Students");
            System.out.println("4. Search for Student");
            System.out.println("5. Clear List");
            System.out.println("6. Print final list and Exit");
            System.out.print("Input: ");
            i = scanner.nextInt();
            switch (i) {
                case 1:
                System.out.println(l.addStudent());
                    break;
                case 2:
                System.out.println(l.removeStudent());
                    break;
                case 3:
                    l.reportlist();
                    break;
                case 4:
                System.out.println(l.searchStudent());
                    break;
                case 5:
                System.out.println(l.removeAll());
                    break;
                case 6:
                    r = false;
                    l.reportlist();
                    System.out.println("Goodbye");
                default:
                    System.out.println("Invalid input. Try again");
                    break;
            }
        }
    scanner.close();}
}
