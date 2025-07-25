import java.util.Arrays;
import java.util.Scanner;

public class Statistics {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = {};
		int input = scanner.nextInt();

		//sequence of numbers added to string untill input is 0
		while (input != 0){
			array = Arrays.copyOf(array, array.length + 1);
			array[array.length - 1] = input;
			System.out.println(Arrays.toString(array));
			input = scanner.nextInt();
		}
		scanner.close();
		System.out.println(Arrays.toString(array));

		//find smallest number in array
		int smallest = array[1];
		for (int i=0; i<array.length; i++){
			//System.out.println(i);
			if (array[i] < smallest){
				smallest=array[i];
			}
		}
		System.out.println("Smallest: " + smallest);

		//find largest number in array
		int largest=0;
		for (int i=0; i<array.length; i++){
			//System.out.println(i);
			if (array[i] > largest){
				largest=array[i];
			}
		}
		System.out.println("Largest: " + largest);

		//calculate average of numbers
		float total=0;
		for (int i=0; i<array.length; i++){
			//System.out.println(i);
			total=total+array[i];
		}
		System.out.println("average: " + (total/array.length));
	}
	
}