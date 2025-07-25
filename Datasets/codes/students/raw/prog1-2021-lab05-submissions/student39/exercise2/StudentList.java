package exercise2;

import java.util.ArrayList;
import java.util.Scanner;
public class StudentList {

 public static ArrayList<String> Studarray= new ArrayList<String>();
 public static int StudCount = 0;
 public static int MaxAllowed = 15;

    public static void main(String[] args) {
    StudentList MyObj = new StudentList();
    
        }
public static int getStudCount(){
return  StudCount ;
 }
   //Remove All method
    public static void RemoveAll(){
        Studarray.clear();
	StudCount = 0;
	}
	
    //Print All registered
    public static void ReportAll(){
	for(int i=0;i<Studarray.size();i++){
            System.out.println(Studarray.get(i));
      }    
    }
    //Add student method
    public static void addStudent(){
    if (StudCount >=MaxAllowed)
    	{System.out.println("Maximum limit reached, more students can not be added.");
 	}
    else{
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter Student name : ");
        String name = console.nextLine();
        Studarray.add(name);
        StudCount +=1;
        System.out.println("Added successfully.");
    }
 }
    //Delete student method
    public static  void  deleteStudent(){
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter Student name to delete : ");
        String dname = console.nextLine();        
        int index=-1;
        //Check the student number exists else display error
        for(int j=0;j<Studarray.size();j++){
            String sname= Studarray.get(j);
            if(sname.equals(dname)){
               index=j;
                break;
            }

        }
        if (index==-1){
            System.out.println("The student does not exist, please re-enter.");
        }else {
            Studarray.remove(index);
	    StudCount -=1;
            System.out.println("Deletion succeeded.");
        }

    }

    }

