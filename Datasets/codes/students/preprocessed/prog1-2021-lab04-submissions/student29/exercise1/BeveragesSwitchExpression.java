import java.util.Scanner;

public class BeveragesSwitchExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();
        int adultInt = 0;

        String suggestion = "";

        scanner.close();

        if(adult == true){
            adultInt = 1;
        }

        switch(adultInt){
            case 1:
            suggestion = switch (menu) {
                default -> {
                    yield ("The restaurant does not have such a menu!");
                }
                case 1, 2 -> {
                    yield ("The restaurant suggests: Red wine");
                }
                case 3 -> {
                    yield ("The restaurant suggests: White wine");
                }
                case 4 -> {
                    yield ("The restaurant suggests: Port wine");
                }
                case 5 -> {
                    yield ("The restaurant suggests: Sparkling Water");
                }
            };

            default:
            suggestion = switch (menu) {
                default -> {
                    yield ("The restaurant does not have such a menu!");
                }
                case 1, 2 -> {
                    yield ("The restaurant suggests: Cola");
                }
                case 3 -> {
                    yield ("The restaurant suggests: Lemonade");
                }
                case 4 -> {
                    yield ("The restaurant suggests: Still water");
                }
                case 5 -> {
                    yield ("The restaurant suggests: Sparkling Water");
                }
            };
        }

        System.out.println(suggestion);
    }
}
