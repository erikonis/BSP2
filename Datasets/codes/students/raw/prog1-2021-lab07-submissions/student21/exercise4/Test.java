package exercise4;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> positionForFilter1 = new ArrayList<>();
        ArrayList<Integer> positionForFilter2 = new ArrayList<>();

        ListOfPeople listOfPeople = new ListOfPeople();
        listOfPeople.clear();

        for (int i = 0; i < 10; i++) {
            System.out.println("Name of the person you want to add: ");
            String name = scanner.next();

            System.out.println("Is that person a student? (yes or no)");
            String studies = scanner.next();
            boolean student = false;

            if (studies.equals("yes")) {
                student = true;
            }

            System.out.println("Is that person a teacher? (yes or no)");
            String teaching = scanner.next();
            boolean teacher = false;

            if (teaching.equals("yes")) {
                teacher = true;
            }

            System.out.println("What is this person's birthyear?");
            int birthyear = scanner.nextInt();

            System.out.println("What is this person's birthmonth?");
            int birthmonth = scanner.nextInt();

            System.out.println("What is this person's birthday?");
            int birthday = scanner.nextInt();

            listOfPeople.add(name, student, teacher, birthyear, birthmonth, birthday);

        }

        int loop = 1;

        while (loop > 0) {
            System.out.println("Do you want to use an age filter?");
            String ageFilter = scanner.next();
            boolean ageFilterBoolean = false;

            if (ageFilter.equals("yes")) {
                ageFilterBoolean = true;
            }

            if (ageFilterBoolean == true) {
                System.out.println("Which age filter exactly? (junior, middle or senior)");
                String ageFilterExact = scanner.next();

                if (ageFilterExact.equals("junior")) {
                    for (int i = 0; i < 10; i++) {
                        int birthyear = listOfPeople.getPerson(i).getBirthyear();
                        int birthmonth = listOfPeople.getPerson(i).getBirthmonth();
                        int birthday = listOfPeople.getPerson(i).getBirthday();

                        AgeFilter ageFilterUse = new AgeFilter();
                        if (ageFilterUse.juniorFilter(birthyear, birthmonth, birthday)) {
                            positionForFilter1.add(i);
                        }
                    }

                } else if (ageFilterExact.equals("middle")) {
                    for (int i = 0; i < 10; i++) {
                        int birthyear = listOfPeople.getPerson(i).getBirthyear();
                        int birthmonth = listOfPeople.getPerson(i).getBirthmonth();
                        int birthday = listOfPeople.getPerson(i).getBirthday();

                        AgeFilter ageFilterUse = new AgeFilter();
                        if (ageFilterUse.middleFilter(birthyear, birthmonth, birthday)) {
                            positionForFilter1.add(i);
                        }
                    }

                } else if (ageFilterExact.equals("senior")) {
                    for (int i = 0; i < 10; i++) {
                        int birthyear = listOfPeople.getPerson(i).getBirthyear();
                        int birthmonth = listOfPeople.getPerson(i).getBirthmonth();
                        int birthday = listOfPeople.getPerson(i).getBirthday();

                        AgeFilter ageFilterUse = new AgeFilter();
                        if (ageFilterUse.seniorFilter(birthyear, birthmonth, birthday)) {
                            positionForFilter1.add(i);
                        }
                    }

                }
            }

            System.out.println("Do you want to use a status filter?");
            String statusFilter = scanner.next();
            boolean statusFilterBoolean = false;

            if (statusFilter.equals("yes")) {
                statusFilterBoolean = true;
            }

            if (statusFilterBoolean == true) {
                System.out.println("Which status filter exactly? (student, teacher or TA)");
                String StatusFilterExact = scanner.next();

                if (StatusFilterExact.equals("student")) {
                    for (int i = 0; i < 10; i++) {
                        boolean student = listOfPeople.getPerson(i).isStudies();

                        StatusFilter statusFilterUse = new StatusFilter();
                        if (statusFilterUse.studentFilter(student)) {
                            positionForFilter2.add(i);
                        }
                    }
                } else if (StatusFilterExact.equals("teacher")) {
                    for (int i = 0; i < 10; i++) {
                        boolean teacher = listOfPeople.getPerson(i).isTeaches();

                        StatusFilter statusFilterUse = new StatusFilter();
                        if (statusFilterUse.studentFilter(teacher)) {
                            positionForFilter2.add(i);
                        }
                    }
                } else if (StatusFilterExact.equals("TA")) {
                    for (int i = 0; i < 10; i++) {
                        boolean student = listOfPeople.getPerson(i).isStudies();
                        boolean teacher = listOfPeople.getPerson(i).isTeaches();

                        StatusFilter statusFilterUse = new StatusFilter();
                        if (statusFilterUse.studentFilter(student) && statusFilterUse.studentFilter(teacher)) {
                            positionForFilter2.add(i);
                        }
                    }
                }
            }
            if (ageFilter.equals("yes") && statusFilter.equals("yes")) {
                for (int i = 0; i < positionForFilter1.size(); i++) {
                    for (int j = 0; j < positionForFilter2.size(); j++) {
                        if (positionForFilter1.get(i) == positionForFilter2.get(j)) {
                            System.out.println(listOfPeople.getPerson(i).toString());
                        }
                    }
                }
            } else {
                if (ageFilter.equals("yes")) {
                    for (int i = 0; i < positionForFilter1.size(); i++) {

                        System.out.println(listOfPeople.getPerson(i).toString());

                    }
                }
                if (statusFilter.equals("yes")) {
                    for (int i = 0; i < positionForFilter2.size(); i++) {

                        System.out.println(listOfPeople.getPerson(i).toString());

                    }
                }
            }
            loop = loop - 2;
        }

        scanner.close();
    }
}
