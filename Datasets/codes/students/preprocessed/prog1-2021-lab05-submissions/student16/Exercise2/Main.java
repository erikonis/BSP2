public class Main {
    
    public static void main(String[] args) {
        
        StudentList list=new StudentList(4);

        Student s1=new Student("Tony", "Carreira");
        Student s2=new Student("Filomeno", "Antunes");
        Student s3=new Student("Kevin", "Thill");
        Student s4=new Student("Mark", "Schmitt");
        
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        list.report();

        list.remove(s2);

        list.report();

    }
}
