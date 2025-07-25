public class NumberSorter {
    public static void sort(int[] numbers) {
        int temp;
        if (numbers[0] > numbers[1]) { temp = numbers[0]; numbers[0] = numbers[1]; numbers[1] = temp; }
        if (numbers[1] > numbers[2]) { temp = numbers[1]; numbers[1] = numbers[2]; numbers[2] = temp; }
        if (numbers[0] > numbers[1]) { temp = numbers[0]; numbers[0] = numbers[1]; numbers[1] = temp; }
    }
}