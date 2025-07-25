import java.util.Scanner;

public class SortingNotNested {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Insert a first number: ");
		int one = scanner.nextInt();
		System.out.print("Insert a second number: ");
		int two = scanner.nextInt();
		System.out.print("Insert a third number: ");
		int three = scanner.nextInt();
		
		if ((one < two) && (one < three) && (two < three)){
			System.out.println("Sorted order; "+one+" , "+two+" , "+three);}
		if ((one < two) && (one < three) && (two > three)){
			System.out.println("Sorted order; "+one+" , "+three+" , "+two);}
		if ((one > two) && (two < three) && (one < three)){
			System.out.println("Sorted order; "+two+" , "+one+" , "+three);}
		if ((one > two) && (two > three) && (one > three)){
			System.out.println("Sorted order; "+two+" , "+three+" , "+one);}
		if ((three < two) && (three < one) && (one < two)){
			System.out.println("Sorted order; "+three+" , "+one+" , "+two);}
		if ((three < two) && (three < one) && (two < one)){
			System.out.println("Sorted order; "+three+" , "+two+" , "+one);}
		scanner.close();
	}
}