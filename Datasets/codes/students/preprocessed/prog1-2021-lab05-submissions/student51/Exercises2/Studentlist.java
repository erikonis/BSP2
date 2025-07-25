import java.util.Arrays;
import java.util.Scanner;

public class Studentlist {
    static Scanner scanner = new Scanner(System.in);
    static String[] studentList = new String[15];
    static int counter, index;
    
    Studentlist() {}

    public static void addStudent() {
        System.out.print("Please enter your first name: ");
        String firstName = scanner.next();
        System.out.print("Please enter your last name: ");
        String lastName= scanner.next();
        studentList[index] = firstName+" "+lastName; // add name to the current index
        ++index; // increment index for the next student
        counter++;
        System.out.println("Current number of registered students: " + counter);
        if (index > 14) {
            System.out.println("No more space on the list!!");//print item if there is no more space on the list
        }
    }

    public static void searchStudent(){
        System.out.print("Please enter your first name: ");
        String firstName = scanner.next();
        System.out.print("Please enter your last name: ");
        String lastName= scanner.next();
        int getIndex = Arrays.asList(studentList).indexOf(firstName+" "+lastName);
        System.out.println("Is the student on the list? ");
        if(Arrays.asList(studentList).contains(firstName+" "+lastName)){
            System.out.println("Yes");
            System.out.println("This is his index: "+getIndex);}
        else{
            System.out.println("No");
        }
    }

    public static void printList() {
        System.out.println("These are the current registered students: " +Arrays.toString(studentList));   //arrays have to be printed out with to strong or they won't compile properly
    }

    public static void removeStudent() {
        System.out.print("Please enter your first name: ");
        String firstName = scanner.next();
        System.out.print("Please enter your last name: ");
        String lastName= scanner.next();
        int getIndex = Arrays.asList(studentList).indexOf(firstName+" "+lastName);
        if(Arrays.asList(studentList).contains(firstName+" "+lastName)){
            studentList[getIndex] = "null";          
        }
        printList();
        for (int i = getIndex+1; i <studentList.length; i++) {    //starting at the position above the index           
            studentList[i-1]=studentList[i];                        //then we take the new position which is i and replace it with the former value
            
        }
        String[] list = Arrays.copyOf(studentList, studentList.length-1);
        System.out.println("After removing a student, this is the current list: " +Arrays.toString(list));
        counter--;
        System.out.println("Current number of students; "+counter);
    }

    public static void clearList() {
        studentList=null;
        printList();
    }

    public static void main(String[] args) {

        System.out.print("Please enter the size of the array: ");
        String[] studentlist = new String[scanner.nextInt()];
        
        System.out.println("Do you want to add a student? Enter true or false");
        boolean student = scanner.nextBoolean();
        if (student = true) {
            addStudent();
            addStudent();
            addStudent(); 
            addStudent();          
        }
        System.out.println("Do you want to look for a student? Type in true or false.");
        boolean answer = scanner.nextBoolean();
        if (answer = true) {
            searchStudent();
        }
        System.out.println("Do you want to know the names on the list? Type in true or false.");
        boolean names = scanner.nextBoolean();
        if (names=true){
            printList();
        }
        System.out.println("Do you want to remove a name from the list? Type in true or false.");
        boolean remove = scanner.nextBoolean();
        if (remove=true){
        removeStudent();
        }
        System.out.println("Clear the list? Type in true or false.");
        boolean clear = scanner.nextBoolean();
        if (clear = true){
        clearList();}

    }
}
