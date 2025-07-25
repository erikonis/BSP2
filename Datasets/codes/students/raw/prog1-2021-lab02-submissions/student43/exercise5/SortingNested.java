package lu.uni.programming1.lab2.exercise5;

import java.util.Scanner;

/**
 *  Class for Exercise 5.1
 */
public class SortingNested {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Insert a first number: ");
		int one = scanner.nextInt();
		System.out.print("Insert a second number: ");
		int two = scanner.nextInt();
		System.out.print("Insert a third number: ");
		int three = scanner.nextInt();
		//number inputs
		// TODO: put your code here
		// 		Hint: "Nested Ifs" means "if" conditions inside the body of other "if" conditions  
		if ((one < two) && (one < three)){
			if (two < three){
				System.out.println("Sorted order; "+one+" , "+two+" , "+three);}
			if (three < two){
				System.out.println("Sorted order; "+one+" , "+three+" , "+two);}}
		if ((one > two) && (two < three)){
			if (one < three){
				System.out.println("Sorted order; "+two+" , "+one+" , "+three);}
			if (three < one){
				System.out.println("Sorted order; "+two+" , "+three+" , "+one);}}
		if ((three < two) && (three < one)){
			if (one < two){
				System.out.println("Sorted order; "+three+" , "+one+" , "+two);}
			if (two < one){
				System.out.println("Sorted order; "+three+" , "+two+" , "+one);}}
		//checks which number is smallest, then which of the two remaining ones is smallest
		scanner.close();}}