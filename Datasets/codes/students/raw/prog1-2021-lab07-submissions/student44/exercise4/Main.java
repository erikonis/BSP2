package lu.uni.programming1.lab7.exercise4;

public class Main {

    public static void main(String[] args) {

        //List of Person

        Person p0 = new Person("Cierra",1987,3,4, false, true);
        Person p1 = new Person("Alden",1998,5,12, true, true);
        Person p2 = new Person("Thomas",1965,12,25, false, true);
        Person p3 = new Person("Miranda",1974,11,29, false, true);
        Person p4 = new Person("Brandy",1999,6,20, true, false);
        Person p5 = new Person("Alvaro",1963,2,18, false, true);
        Person p6 = new Person("Maggie",2001,8,23, true, false);

        PersonList personList = new PersonList(7);
        personList.addPerson(p0);
        personList.addPerson(p1);
        personList.addPerson(p2);
        personList.addPerson(p3);
        personList.addPerson(p4);
        personList.addPerson(p5);
        personList.addPerson(p6);

        System.out.println("\n List of person : "+personList);

        // List of Junior
       
        Filters filter1 = new Junior(null);
        Filters filter2 = new Lecturer(null);
        //Filters filter3 = new Junior(new Lecturer(null));
        Filters filter4 = new Student(new Lecturer(null));
        Filters filter5 = new Senior(new Lecturer(null));
        Filters filter6 = new Middle(null);
        Filters filter7 = new Senior(null);
        

        PersonList personJunior = filter1.doFilter(personList);
        PersonList personMiddle = filter6.doFilter(personList);
        PersonList personSenior= filter7.doFilter(personList);
        PersonList personLecturer = filter2.doFilter(personList);
        //PersonList personLecturerAndJunior = filter3.doFilter(personList);
        PersonList personLecturerAndStudent = filter4.doFilter(personList);
        PersonList personLecturerAndSenior = filter5.doFilter(personList);
        

        System.out.println("\n List of Junior : "+personJunior);
        System.out.println("\n List of Middle : "+personMiddle);
        System.out.println("\n List of Senior : "+personSenior);
        System.out.println("\n List of Lecturers : "+personLecturer);
        //System.out.println("\n List of Junior Lecturers : "+personLecturerAndJunior);
        System.out.println("\n List of Senior Lecturers : "+personLecturerAndSenior);
        System.out.println("\n List of TAs : "+personLecturerAndStudent);

        

    }
    
}
