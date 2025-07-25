public class Main {

    interface Filter {
        boolean matches(Person p);

        default Person[] apply(Person[] people) {
            int count = 0;
            for (Person p : people) {
                if (matches(p)) count++;
            }

            Person[] result = new Person[count];
            int i = 0;
            for (Person p : people) {
                if (matches(p)) {
                    result[i++] = p;
                }
            }
            return result;
        }
    }

    static class LecturerFilter implements Filter {
        public boolean matches(Person p) {
            return p.teaches() && !p.studies();
        }
    }

    static class StudentFilter implements Filter {
        public boolean matches(Person p) {
            return p.studies() && !p.teaches();
        }
    }

    static class TAFilter implements Filter {
        public boolean matches(Person p) {
            return p.teaches() && p.studies();
        }
    }

    static class JuniorFilter implements Filter {
        public boolean matches(Person p) {
            return p.getAge() >= 18 && p.getAge() <= 28;
        }
    }

    static class MiddleFilter implements Filter {
        public boolean matches(Person p) {
            return p.getAge() > 28 && p.getAge() <= 55;
        }
    }

    static class SeniorFilter implements Filter {
        public boolean matches(Person p) {
            return p.getAge() > 55;
        }
    }

    public static void printPeople(String label, Person[] people) {
        System.out.println(label);
        for (Person p : people) {
            System.out.println(p);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Person[] people = {
            new Person("Anna", true, false, 20),
            new Person("Ben", false, true, 40),
            new Person("Clara", true, true, 25),
            new Person("Dan", false, true, 60),
            new Person("Eli", true, false, 65)
        };

        Filter lecturerFilter = new LecturerFilter();
        Filter studentFilter = new StudentFilter();
        Filter taFilter = new TAFilter();
        Filter juniorFilter = new JuniorFilter();
        Filter seniorFilter = new SeniorFilter();

        printPeople("All People:", people);
        printPeople("Lecturers:", lecturerFilter.apply(people));
        printPeople("Students:", studentFilter.apply(people));
        printPeople("TAs:", taFilter.apply(people));
        printPeople("Juniors:", juniorFilter.apply(people));
        printPeople("Senior Lecturers:", seniorFilter.apply(lecturerFilter.apply(people)));
    }
}
