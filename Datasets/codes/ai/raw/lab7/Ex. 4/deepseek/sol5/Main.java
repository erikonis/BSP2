public class Main {
    public static void main(String[] args) {
        Person[] people = {
            new Person("Alice", 25, false, true),
            new Person("Bob", 30, true, false),
            new Person("Charlie", 22, true, true),
            new Person("Diana", 60, true, false),
            new Person("Eve", 40, false, true)
        };
        
        // Individual filters
        PeopleFilter.print(PeopleFilter.filter(people, RoleFilter.lecturer()), "Lecturers");
        PeopleFilter.print(PeopleFilter.filter(people, RoleFilter.ta()), "TAs");
        PeopleFilter.print(PeopleFilter.filter(people, AgeFilter.senior()), "Seniors");
        
        // Combined filters
        Filter seniorLecturers = RoleFilter.lecturer().then(AgeFilter.senior());
        PeopleFilter.print(PeopleFilter.filter(people, seniorLecturers), "Senior Lecturers");
        
        Filter juniorStudents = RoleFilter.student().then(AgeFilter.junior());
        PeopleFilter.print(PeopleFilter.filter(people, juniorStudents), "Junior Students");
    }
}