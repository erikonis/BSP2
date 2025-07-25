package lu.uni.programming1.lab4.exercise2;

import java.util.Scanner;

public class Navigation {
    public static void main(String[] args) {

        int arr1[] = { 1, 2, 3, 4 };

        for (int i = 0; i < arr1.length; i++) {
            String text = switch (arr1[i]) {
            case 1 -> "motorway   1   130";
            case 2 -> "ordinary   2   90";
            case 3 -> "town       3   50";
            default -> "calmed     4   30  ";

            };
            System.out.println(text);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Road Type ID: ");
        int number = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < arr1.length; i++) {
            if (number == arr1[i]) {
                String text = switch (arr1[i]) {
                case 1 -> "Driving 1km on the motorway 130km/h takes: " + (double) 1 / 130 + " hours == "
                        + (double) 1 / 130 * 60 + " minutes";
                case 2 -> "Driving 1km on the ordinary road 90km/h takes: " + (double) 1 / 90 + " hours == "
                        + (double) 1 / 90 * 60 + " minutes";
                case 3 -> "Driving 1km on the town road 50km/h takes: " + (double) 1 / 50 + " hours == "
                        + (double) 1 / 50 * 60 + " minutes";
                default -> "Driving 1km on the calmed road 3km/h takes: " + (double) 1 / 30 + " hours == "
                        + (double) 1 / 30 * 60 + " minutes";

                };

                System.out.println(text);
            }
        }

    }
}
