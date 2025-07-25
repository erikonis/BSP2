import java.util.Scanner;

public class StudentList {
    private static String[][] arrFirstLastName = new String[15][2];

    private static String firstName = "";
    private static String lastName = "";

    private static int a = -1;
    private static int b = -1;

    public static void add() {
        if (!arrFirstLastName[14][0].equals("") && !arrFirstLastName[14][1].equals("")) {
            System.out.println("List of students has reached the maximum of 15 students");
        } else {
            for (int i = 0; i < 15; i++) {
                if (arrFirstLastName[i][0].equals("") && arrFirstLastName[i][1].equals("")) {
                    arrFirstLastName[i][0] = firstName;
                    arrFirstLastName[i][1] = lastName;
                }
                if (arrFirstLastName[i][0].equals(firstName) && arrFirstLastName[i][1].equals(lastName)) {
                    i = i + 15;
                }
            }
        }
    }

    public static void search(String searchedFirstName, String searchedLastName) {
        for (int i = 0; i < 15; i++) {
            if (arrFirstLastName[i][0].equals(searchedFirstName) && arrFirstLastName[i][1].equals(searchedLastName)) {
                a = i;
            }
        }
    }

    public static void remove(String searchedFirstName, String searchedLastName) {
        int lastStudentPosition = -1;

        a = -1;
        b = -1;

        search(searchedFirstName, searchedLastName);

        if (a == -1 && b == -1) {
            System.out.println("There is no student with that name in the list.");
        } else {
            for (int i = 0; i < 15; i++) {
                if (!arrFirstLastName[i][1].equals("")) {
                    lastStudentPosition = i;
                } else {
                    i = i + 15;
                }
            }
            arrFirstLastName[a][0] = arrFirstLastName[lastStudentPosition][0];
            arrFirstLastName[a][1] = arrFirstLastName[lastStudentPosition][1];
            arrFirstLastName[lastStudentPosition][0] = "";
            arrFirstLastName[lastStudentPosition][1] = "";
        }
    }

    public static void removeAll() {
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 2; j++) {
                arrFirstLastName[i][j] = "";
            }
        }
    }

    public static void report() {
        for (int i = 0; i < 15; i++) {
            System.out.print((i + 1) + ". ");
            for (int j = 0; j < 2; j++) {
                System.out.print(arrFirstLastName[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        arrFirstLastName[14][0] = "";
        arrFirstLastName[14][1] = "";

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 2; j++) {
                arrFirstLastName[i][j] = "";
            }
        }

        int infiniteLoop = 2;
        String input = "";

        Scanner scanner = new Scanner(System.in);

        while (infiniteLoop > 1) {
            System.out.println(
                    "What do you want to do? (\"add\" a student, \"remove\" a student, \"remove all\" students or \"report\")(type \"stop\" to end the program");
            input = scanner.nextLine();

            if (input.equals("add")) {
                System.out.println("Give the students first name: ");
                firstName = scanner.nextLine();

                System.out.println("Give the students last name: ");
                lastName = scanner.nextLine();
                add();
            } else if (input.equals("remove")) {
                System.out.println("Give the students first name: ");
                firstName = scanner.nextLine();

                System.out.println("Give the students last name: ");
                lastName = scanner.nextLine();
                remove(firstName, lastName);
            } else if (input.equals("remove all")) {
                removeAll();
            } else if (input.equals("report")) {
                report();
            } else if (input.equals("stop")) {
                report();
                infiniteLoop = -1;
            }
        }

        scanner.close();
    }
}
