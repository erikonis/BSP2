import java.util.*;

import javax.sound.sampled.Line;

public class studentlist {
    static int n;
    static int counter;
    
    static Scanner s = new Scanner(System.in);
    static int i;

    public static void addstudent(String[] myArray){
            if (counter<myArray.length){
                System.out.println("enter your first and last name :");
                s.nextLine();
                myArray[counter] = s.nextLine();
                counter++;
            }
    }
    public static void searchstudent(String[] myArray, String string) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what's the name of the student you search ?");
        System.out.println(contains(myArray, scanner.nextLine()));
        }        
    private static char[] contains(String[] myArray, String nextLine) {
        return null;
    }

    
    public static void main(String args[]) {
        System.out.println("how many");
        int n = s.nextInt();
        List<String> myArray = new ArrayList<>(n);
        counter=0;
        System.out.println("do you want to add a student");
        Boolean ans = s.nextBoolean();
        if(ans==true){
            addstudent(myArray);
        }
        else{}
        s.close();
        System.out.println("do you want to search a student");
        Boolean answ = s.nextBoolean();
        if(answ==true){
            searchstudent(myArray);        }
        else{}

        
        

        
    }
    private static void searchstudent(List<String> myArray) {
    }
    private static void addstudent(List<String> myArray) {
    }
}


 // for ( i = 0; i < myArray.length; i++) {
            //System.out.println("enter your first name then your last name ");
           // myArray[i] = s.nextLine();
        
        //System.out.println(myArray);
       // return myArray;  