package Exercise2;

import java.util.ArrayList;
import java.util.Scanner;


public class Student {

    public static void main(String[] args) {
        Student n = new Student();
        
        boolean condition = true;
        Scanner scanner = new Scanner(System.in);
        while(condition!=false){
        System.out.println("Want do you and to do?:");
        System.out.println("Enter 1 to add a Student");
        System.out.println("Enter 2 to remove a Student");
        System.out.println("Enter 3 to search for a Student");
        System.out.println("Enter 4 to report all Students");
        System.out.println("Enter 0 to close the program");
        int number = -1;
        number = scanner.nextInt();
        switch(number){
            case 1 ->{
                System.out.println("Please enter the Name of the student you want to add (lastName firstName) :");
                    String lastName = scanner.next();
                    String firstName = scanner.next();
                    String Name = lastName + " " + firstName;
                    n.add(Name);
                
                
            }
            case 2 ->{
                System.out.println("Please enter the Name of the Student you want to remove (lastName firstName) :");
                String lastName = scanner.next();
                String firstName = scanner.next();
                String Name = lastName + " " + firstName;
                n.remove(Name);
            }
            case 3 ->{
                System.out.println("Please enter the Name of the Student you are looking for (lastName firstName) :");
                String lastName = scanner.next();
                String firstName = scanner.next();
                String Name = lastName + " " + firstName;
                n.search2(Name);
            }
            case 4 ->{
                n.report();
            }
            case 0 -> condition = false;
            default -> System.out.println("Invalid input please only enter numbers form 1 to 4");

        };
        }
        //close
        scanner.close();
    }
    //attribute
    //I think an ArrayList is much easier in this case to use than an array
    private ArrayList<String> n;
    private int counter;
    public Student(){
        counter = 0;
        n = new ArrayList<>();
    }

    public void add(String Name){
        counter++;
        if(counter<=15){
            n.add(Name);
            
        }
        else
        {
            System.out.println("There is not enough space left.");
        }
    }
    public void remove(String Name){
       int index = search1(Name);
       counter--;
       if(index >=0)
       {   
           //Because I used  an ArrayList I do not have to shift the name via code the ArrayList
           //makes it automatically 
           //I still put "null" at the place because we are told so
           n.set(index, "null");
           n.remove(index);
       }
    
    }
    public int search1(String Name){
        int index = -1;
        for(int i = 0; i<n.size();i++){
            if(n.get(i).equals(Name))
            {
                index = i;
            }
        }
        return index;

    }

    public void search2(String Name){
        for(int i = 0; i<n.size();i++){
            if(n.get(i).equals(Name))
            {
                //it is nessesary to make i+1 to get the right place
                //because an arraylist is from 0 to (in this case) max 14 
                // so in the List there are 15 places
                System.out.println("The Student: " + Name + " is at the " + (i+1) + " place in the list");
            }
        }
        
    }
    public void report(){
        for(int i = 0; i<n.size();i++)
        {
            toPrint(i);
        }
        if(n.size()== 0)
        {
            System.out.println("The list is empty");
        }
    }
    
    public void toPrint(int i)
    {
        System.out.println("Stutdent : " + n.get(i)); 
    }
    
}
