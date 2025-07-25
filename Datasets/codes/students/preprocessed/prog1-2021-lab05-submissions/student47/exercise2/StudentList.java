import java.util.*;

public class StudentList {
    private static int counter;

    // Ads student to list
    public static void addStudent(Student[] students, String firstName,String lastName){
        // Adds student to the array
        students[counter] = new Student(firstName, lastName);
        counter++;
        // Prints the student
        System.out.println("\nStudent was added successfully!" + getString(counter-1,students));
    }

    // Prints student
    public static String getString(int id,Student[] students){
        return "\nStudent: " + (id+1) + students[id].toString();
    }

    // Prints all of the students
    public static void report(Student[] students){
        if(counter == 0){
            System.out.println("\nThe list is empty");
        }
        else{
            for(int i = 0; i < counter; i++){
            System.out.println(getString(i ,students));
            }
        }
    }

    // Searches for student with given name
    public static void search(Student[] students, String name){
        if(counter == 0){
            System.out.println("\nThe list is empty");
        }  
        else{
            for(int i = 0; i < counter; i++){
                if(students[i].getFirstName().equalsIgnoreCase(name)|| students[i].getLastName().equalsIgnoreCase(name)){
                    System.out.println(getString(i, students));
                }
            }
        }
    }

    // Removes student with given name
    public static void remove(Student[] students, String name){
        if(counter == 0){
            System.out.println("\nThe list is empty");
        }  
        else{
            for(int i = 0; i < counter; i++){
                if(students[i].getFirstName().equalsIgnoreCase(name)|| students[i].getLastName().equalsIgnoreCase(name)){
                    students[i] = null;
                    counter--;
                    for(int j = i; j < students.length; j++){
                        students[j] = students[j+1];
                    }
                    Student[] copyStudent = new Student[students.length];
                    for(int j = 0; j < copyStudent.length-1; j++){
                        copyStudent[j] = students[j];
                    }
                    students = copyStudent;
                }
            }
        }
    }

    // Removes all students
    public static void removeAll(Student[] students){
        if(counter == 0){
            System.out.println("\nThe list is empty");
        }  
        else{
            for(int i = 0; i < counter; i++){
                students[i] = null;
            }
            counter = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String task = "";
        String firstName = "";
        String lastName = "";
        String name = "";

        // Creates list
        System.out.println("How many students should be in your list?");
        int size = sc.nextInt();
        Student[] students = new Student[size];
        counter = 0;
        
        // Executes tasks
        while(!task.equals("nothing")){
            System.out.println("\nWhat do you want to do?"+
                               "\n-Add student (add)"+
                               "\n-Search student (search)"+
                               "\n-Remove student (remove)"+
                               "\n-Remove all students (removeall)"+
                               "\n-Report all students (report)"+
                               "\n-Nothing (nothing)");
            task = sc.next().toLowerCase();
            switch(task){
                case "add":
                    if(counter < size){
                        System.out.println("\nFirstname:");
                        firstName = sc.next();
                        System.out.println("Lastname:");
                        lastName = sc.next();
                        addStudent(students, firstName, lastName);
                    }
                    else{
                        System.out.println("\nThe list is already full!");
                    }
                    break;
                case "remove":
                    System.out.println("\nPlease enter either first or lastname:");
                    name = sc.next();
                    remove(students, name);
                    break;
                case "search":
                    System.out.println("\nPlease enter either first or lastname:");
                    name = sc.next();
                    search(students, name);
                    break;
                case "removeall":
                	removeAll(students);
                    break;
                case "report":
                    report(students);
                    break;
                case "nothing":
                    break;
                default:
                    System.out.println("\nPlease enter valid input");
            }
        }
        sc.close();
    }
}
    