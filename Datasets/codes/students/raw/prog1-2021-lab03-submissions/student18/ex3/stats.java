package lu.uni.programming1.lab3.ex3;
import java.util.Scanner;
//import arraylist
import java.util.ArrayList;

public class stats { 
  public static void main(String[] args) { 
	  //define an arraylist
    ArrayList<Integer> array = new ArrayList<Integer>();
	//scanner
	Scanner number = new Scanner(System.in);
	//enter your numbers
	System.out.println("********************************");
	System.out.println("Please enter some numbers");
	//define a integer
	int Number = number.nextInt();
	//while Number is not 0
	//when you enter 0 the code should stop automatically
	while (Number != 0)
	{
		//add to the arraylist
		array.add(Number);
		//give Number the value of entered numbers
		Number=number.nextInt();
	}
	//define the 3 main variables (biggest,smallest,average number)
	//array.get(0)
	//to return the element at a given index from the specified array
	//global varibales
	int big=array.get(0);
	int small=array.get(0);
	int sum=array.get(0);
	//avg is a double, because if we calculate the average there is abig chance, that the number will be a decimal number
	double avg;
	//define the index for loop
	int s;
	//for-loop 
	//as long as the s (index) is smaller than the length of the array
	//s=s+1 == s++
    for (s = 1; s < array.size(); s=s+1) 
	{
      //output
		System.out.println(array.get(s));
		//biggest number
	  if(big < array.get(s))
	  {
		  big=array.get(s);
	  }
	  //smallest number
	  else if(small > array.get(s))
	  {
		  small=array.get(s);
	  }
	  //give sum all the value
	  sum +=array.get(s);
    }
	// to calculate the average we divide the sum through the size of the array
	avg= sum / array.size();
	//output
	System.out.println("biggest: " + big);
	System.out.println("smallest " + small);
	System.out.println("average " + avg);
	System.out.println("********************************");
	//close
	number.close();
} 
}


