package lu.uni.programming1.lab2.exercise9;

/**
 *  Class for Exercise 9
 */
public class ILoveProgramming {

	public static void main(String[] args) {
		// the number of times we want to print "I love programming"
		int numberOfPrints = 20;
		int PrintCount;
		// we run a "for" loop to print multiple times "I love programming"
		for (PrintCount = 1; PrintCount <= numberOfPrints; PrintCount++){
			// actually doing the printing
			System.out.println("I love programming!");
		}
	}
}
//the error was a ; after the for(), making the lines in the {} not count as what happens during the loop