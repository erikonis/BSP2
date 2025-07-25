public class exercise2 {
    public static void main(String[] args) {
        studentList list = new studentList();
        list.addStudent("Alex");
        list.addStudent("Ahmad");
        list.addStudent("Asad");
        list.addStudent("christoph");
        list.addStudent("Mark");
        list.addStudent("Holly");
        list.report();
        list.remove("Mark");
        list.report();
        list.removeAll();
        list.addStudent("Elder");
        list.addStudent("Tedas");
        list.addStudent("Maryam");
        list.report();
        list.removeAll();
        list.report();
    }
}