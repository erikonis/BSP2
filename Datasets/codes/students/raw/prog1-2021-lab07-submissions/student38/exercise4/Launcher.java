package lu.uni.programming1.lab7.exercise4;

public class Launcher {
    public static void main(String[] args) {
        Person per1 = new Person("Cierra", 1987, 3, 4, false, true);
        Person per2 = new Person("Alden", 1998, 5, 12, true, true);
        Person per3 = new Person("Thomas", 1965, 12, 25, false, true);
        Person per4 = new Person("Miranda", 1974, 11, 29, false, true);
        Person per5 = new Person("Brandy", 1999, 6, 20, true, false);
        Person per6 = new Person("Alvaro", 1963, 2, 18, false, true);
        Person per7 = new Person("Maggie", 2001, 8, 23, true, false);

        Person persons[] = { per1, per2, per3, per4, per5, per6, per7 };

        Filter senior = new SeniorFilter(persons);
        senior.filter();
        // senior.showResult();

        System.out.println();

        Filter junior = new JuniorFilter(persons);
        junior.filter();
        // junior.showResult();

        System.out.println();

        Filter middle = new MiddleFilter(persons);
        middle.filter();
        // middle.showResult();

        Filter lecturer = new LecturerFilter(persons);
        lecturer.filter();
        // lecturer.showResult();

        Filter student = new StudentFilter(persons);
        student.filter();
        // student.showResult();

        Filter ta = new TAFilter(persons);
        ta.filter();
        // ta.showResult();

        Filter seniorLecturer = new LecturerFilter(senior.getFilteredPersons());
        seniorLecturer.filter();
        seniorLecturer.showResult();
    }

}
