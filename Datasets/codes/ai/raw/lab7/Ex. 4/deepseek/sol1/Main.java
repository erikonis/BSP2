import model.*;
import model.filters.*;

public class Main {
    public static void main(String[] args) {
        // Create sample people
        PersonSet people = new PersonSet(10);
        people.add(new Person("Alice", 25, false, true));  // Student
        people.add(new Person("Bob", 35, true, false));    // Lecturer
        people.add(new Person("Charlie", 40, true, true)); // TA
        people.add(new Person("David", 60, true, false));  // Senior Lecturer
        people.add(new Person("Eve", 22, false, true));    // Junior Student
        
        System.out.println("All people:");
        System.out.println(people);
        
        // Test filters
        System.out.println("Lecturers only:");
        PersonSet lecturers = people.filter(new LecturerFilter());
        System.out.println(lecturers);
        
        System.out.println("Seniors only:");
        PersonSet seniors = people.filter(new SeniorFilter());
        System.out.println(seniors);
        
        System.out.println("TAs only:");
        PersonSet tas = people.filter(new TAFilter());
        System.out.println(tas);
        
        // Test filter composition
        System.out.println("Senior Lecturers:");
        PersonSet seniorLecturers = people.filter(new LecturerFilter())
                                        .filter(new SeniorFilter());
        System.out.println(seniorLecturers);
        
        System.out.println("Junior Students:");
        PersonSet juniorStudents = people.filter(new StudentFilter())
                                      .filter(new JuniorFilter());
        System.out.println(juniorStudents);
    }
}