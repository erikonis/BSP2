import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
public class StudentList {
    private static int count;
    private static String[] array;
   

  public StudentList(){
    count = 0;
    array = new String[15];
  }

  static void ArrayAdding(String name){
    int i = 0;
    while (array[i] != null && i < 15){
      i++;
    }
    if (i < 15){
      array[i] = name;
      count++;
    }
    else {
      System.out.println("List full.");
    }
  }

  static void ArrayRemove(String name){
    int i = 0;
    while (array[i] != name && i < 15){
      i++;
    }
    array[i] = null;
    array[i] = array[i+1];
    array[count-1] = null;
    count--;
  }

  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    String nameAdd = scan.nextLine();
    ArrayAdding(nameAdd);
   
    System.out.println("Search for name to remove: ");
    String nameRemove = scan.nextLine();
    ArrayRemove(nameRemove);
    System.out.println(Arrays.toString(array));
  }

}
