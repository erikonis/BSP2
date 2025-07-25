import java.util.Scanner;
public class StudentList {

public int length;

public static int count = 0;



public static void addStudent(String add,String[] stuList){
   
       stuList[count]=add;
       count++;
   } 

public static void removeStudent(String[] stuList){
    Scanner sc = new Scanner (System.in);
    System.out.println("Who do you want to remove?");
    
    String nametorem = sc.nextLine();
    for (int i=0; i<stuList.length;i++){
        if (stuList[i] != null){
        if (stuList[i].equals(nametorem))
        {
           System.out.println("you removed "+ stuList[i]);
            stuList[i] = null;
            count --;
            for (int j=i; j<stuList.length-1;j++){
                stuList[j] = stuList[j+1]; 
                if (stuList[j+1]!=null){
                    stuList[j+1] = null;
                }

            } 
        }
    }
    }
    sc.close();
}
  
public static void searchStudent(String[] stuList){
    Scanner sc = new Scanner (System.in);
    System.out.println("Who are you searching for");
    String nametoser = sc.nextLine();
    for (int i=0; i<stuList.length;i++){
        if (stuList[i] != null){
           if (stuList[i].equals(nametoser)){
            System.out.println(nametoser + " is on this list. The student is at number " + (i+1) + " on the list");
        } else {System.out.println(nametoser + " is not on this list.");}
        }
        
    }
    sc.close();
}



public static void removeAll(String[] stuList){
for (int i=0; i<stuList.length;i++){
    stuList[i] = null;
    count = 0;
   
        
    
}
System.out.println("The list has been emptied");
}


public static void report(String[] stuList){
    
    for (int i = 0; i<stuList.length;i++){
        System.out.println(i+1 + ") " +stuList[i]);
    }
        
    
    
}  
    
public static void main(String[] args) {
    
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Hello, we will now initialize your Student List.");
    System.out.println("How long should the list be?");
    int size = sc.nextInt();
    String[]  stuList = new String[size];

    String toDo ="";
    while (!toDo.equals("finish")){
        System.out.println("What do you need to do? ");
        System.out.println("To add a student, type: add ");
        System.out.println("To remove a student, type: rem ");
        System.out.println("To search for a student, type: search ");
        System.out.println("To report the list of students, type: rep ");
        System.out.println("To emtpy the list, type: del ");
        System.out.println("To end the programm, type: finish ");
        Scanner sc5 = new Scanner(System.in);
        toDo = sc5.nextLine();

        switch(toDo){
            case "add": System.out.println("How many students do you want to add to the list?");
            Scanner sc6 = new Scanner(System.in);
            int num = sc6.nextInt();
            Scanner sc7 = new Scanner(System.in);
            
            for (int i=0;i<num;i++){
                String add = sc7.nextLine();
                addStudent(add, stuList);
             
            }
            break;
            case "rem": removeStudent(stuList);
            break;
            case "search": searchStudent(stuList);
            break;
            case "rep": report(stuList);
            break;
            case "del": removeAll(stuList);
            break;
            case "finish": System.out.println("Shutting down! ");
            break;
            default: System.out.println("Please type again: ");

        }
        
    }
    sc.close();

    }


    
    
}
