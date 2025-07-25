package lab5.exercise2;

import java.util.Scanner;

public class StudentList {

    String[] StudentArray;

    int counter;

    public StudentList(int maxNb){          //variables get initialized in the constructor

        StudentArray = new String[maxNb];
        counter = 0;
    }

    public void add(String Student) {
        if(counter < StudentArray.length){          //you can only add someone if the last place is clear
            StudentArray[counter]=Student;
            counter++;
            System.out.println(Student+" : \tadded");
            
        }
        else
            System.out.println("Error :  There is no room left for the Student : "+Student+"\n\t The max capacity is "+StudentArray.length);
    }

    public int search(String Student) {
        
        for(int i=0; i<counter; i++){

            if(Student.compareTo(StudentArray[i])==0){ 
                return i;
            }
        }
        return -1;
    }

    public void remove(String Student) {
        
        int i = search(Student);           //searching the whole array

        if(i==-1)
            System.out.println("ERROR ! Student : "+Student+" not found ");
        else{

        StudentArray[i]=null;                                   //initilasied the student to null
        
        if(i<StudentArray.length){                        //if the removed element is not the last one

                for(int j=0 ; j<(StudentArray.length-i-1); j++)

                    StudentArray[i+j]=StudentArray[i+j+1];          //shift of the array
            
            }         
            counter--;
            System.out.println(Student+" : \tremoved");
        }
    }

    public void report() {
        System.out.println("");

        if(StudentArray[0]==null)           //checks if the first element is null, if yes there is no one in the array
            System.out.println("No participant has registered yet ");
        else
            System.out.println("Every participant of the course : ");
        
        for(int i=0; i<counter; i++)
            System.out.println("\t"+(i+1)+". "+StudentArray[i]);

        System.out.println("");
    }

    public void removeAll() {
        for(int i=counter-1; i >= 0; i--)
            remove(StudentArray[i]);    
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert the number of seats available in the classroom");

        int maxNb = scanner.nextInt();

        StudentList st = new StudentList(maxNb);

        st.add("Jimmy Tutu");
        st.add("Jonny Tutu");
        st.add("Juan Jonny");
        st.add("Criss Brown");
        st.add("Crisstian Brown");
        st.add("Criss Blue");

        st.remove("Juan Jonny");

        st.report();

        st.removeAll();

        st.report();

        st.add("Criss Brown");
        st.add("Crisstian Brown");
        st.add("Criss Blue");
        
        st.report();

        st.remove("Crisstian Brown");

        scanner.close();

        st.report();
        st.toString();
    }
    
}
