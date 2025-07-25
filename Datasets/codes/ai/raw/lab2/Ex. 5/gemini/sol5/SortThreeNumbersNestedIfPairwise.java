import java.util.Scanner;

public class SortThreeNumbersNestedIfPairwise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int smallest, middle, largest;

        if (a <= b) {
            if (b <= c) { // a <= b <= c
                smallest = a; middle = b; largest = c;
            } else { // b > c
                if (a <= c) { // a <= c < b
                    smallest = a; middle = c; largest = b;
                } else { // c < a <= b
                    smallest = c; middle = a; largest = b;
                }
            }
        } else { // a > b
            if (a <= c) { // b < a <= c
                smallest = b; middle = a; largest = c;
            } else { // a > c
                if (b <= c) { // b <= c < a
                    smallest = b; middle = c; largest = a;
                } else { // c < b < a
                    smallest = c; middle = b; largest = a;
                }
            }
        }

        System.out.println("Ascending order: " + smallest + ", " + middle + ", " + largest);
        scanner.close();
    }
}