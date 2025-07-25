import java.util.Scanner;
public class BeveragesClassicSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();

        scanner.close();

        switch(menu){ 
        case 1:
        case 2:
        String result=adult?"Red wine":"Cola";
            System.out.println(result);
            break;

        case 3:
        String result1=adult?"White wine":"Lemonade";
            System.out.println(result1);
            break;
        case 4:
        String result2=adult?"Port wine":"Still Water";
            System.out.println(result2);
            break;
        case 5:
        System.out.println("The restaurant suggests: Sparkling Water");
        break;
        }
    } 


     

}
