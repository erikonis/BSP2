public class Launcher {
    public static void main(String[] args) {
        StudentList lst = new StudentList(5);

        lst.add("Hugo Costa");
        lst.add("Anthony Bénard");
        lst.add("Caroline Thill");
        lst.add("Sara-Elena Vatavu");
        lst.add("Lucas IDon'tRememberHisName");
        lst.add("Marion");

        System.out.println(lst.toString());

        lst.remove("Anthony Bénard");

        System.out.println(lst.toString());

        lst.removeAll();

        System.out.println(lst.toString());

        
    }
}
