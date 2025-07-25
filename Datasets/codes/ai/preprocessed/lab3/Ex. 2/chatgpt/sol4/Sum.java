import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        // Prompt until a positive number is given
        do {
            System.out.print("Please enter a positive number: ");
            number = input.nextInt();
        } while (number <= 0);

        // Using a for loop
        int totalFor = 0;
        for (int k = 1; k <= number; k++) {
            totalFor += k;
        }

        // Using a while loop
        int totalWhile = 0;
        int counter = 1;
        while (counter <= number) {
            totalWhile += counter;
            counter++;
        }

        // Using a do-while loop
        int totalDo = 0;
        int index = 1;
        do {
            totalDo += index;
            index++;
        } while (index <= number);

        // Using formula
        int formulaResult = number * (number + 1) / 2;

        // Display results
        System.out.println("Sum using for-loop:      " + totalFor);
        System.out.println("Sum using while-loop:    " + totalWhile);
        System.out.println("Sum using do-while-loop: " + totalDo);
        System.out.println("Sum using formula:       " + formulaResult);
    }
}