public class MainList {

    public static void main(String[] args) {
        
       StudentList test = new StudentList(5);

       System.out.println(" ");
       System.out.println("Add method test:");

       test.addS("JC Denton");
       test.addS("Adam Jensen");
       test.addS("Bob Page");
       test.addS("David Sarif");
       test.addS("Hugh Darrow");
       test.addS("Joseph Manderley");
       test.reportS();

       System.out.println(" ");
       System.out.println("Remove method test: ");
       test.removeS("Paul Denton");
       test.removeS("Bob Page");
       test.reportS();

       System.out.println(" ");
       System.out.println("Search method test: ");
       System.out.println(test.search("Hugh Darrow"));

       System.out.println(" ");
       System.out.println("Report method test: ");
       test.reportS();

       System.out.println(" ");
       System.out.println("Remove All method test: ");
       test.removeAll();
       test.reportS();

    
    }
    
}
