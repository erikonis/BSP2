import java.util.Scanner;
import java.util.Arrays;

public class SortNumbersWithoutNesting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int[] nums = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        scanner.close();

        Arrays.sort(nums);
        System.out.println("Sorted: " + nums[0] + " " + nums[1] + " " + nums[2]);
    }
}