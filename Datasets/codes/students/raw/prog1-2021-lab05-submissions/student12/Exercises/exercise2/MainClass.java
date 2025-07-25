package Exercises.exercise2;

public class MainClass {
    public static void main(String[] args) {
       
        StudentList ar = new StudentList(4);

        Student s1 = new Student("HELLO", "WORLD");
        Student s2 = new Student("Lorum", "ipsum");
        Student s3 = new Student("Caroline", "Thill");
        Student s4 = new Student("qwertz", "azerty");

        ar.add(s1);
        ar.add(s2);
        ar.add(s3);
        ar.add(s4);

        System.out.println(ar.returnList());

        ar.remove(s3);
        System.out.println(ar.returnList());

        ar.removeAll();
        System.out.println(ar.returnList());
    }
    
}
