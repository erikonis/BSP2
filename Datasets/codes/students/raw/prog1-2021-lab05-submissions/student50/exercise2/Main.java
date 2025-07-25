package exercise2;

public class Main {
    public static void main(String[] args) {
        StudentList s=new StudentList(15);
        System.out.println(s.add("Paul Müller"));
        System.out.println(s.add("Pit Völker"));
        System.out.println(s.add("Jhemp Jean-Paul Michel"));
        System.out.println(s.report());
        s.remove(1);
        System.out.println(s.report());
        System.out.println(s.search("Paul Müller"));
        System.out.println(s.removeAll());
        System.out.println(s.report());
    }
    
}
