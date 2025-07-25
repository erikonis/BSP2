import java.util.Scanner;

class BeveragesClssicSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();

        scanner.close();
        

        // TODO: replace all of the code below by a better construct!
        //      Simplify conditions to make them more readable and make sure the suggestions are still the same!

        String var;

        
        switch(menu){

        case 1: { // client ordered meat
            var = (adult)?"Red wine" : "Cola";
            System.out.println(var);
            break;
        }
        case 2: { // client ordered fish
            var = (adult)?"Red wine" : "Cola";
            System.out.println(var);
            break;
        }
        
        case 3: { // client ordered pasta with tomato sauce
            var = (adult)?"White wine" : "Lemonade";
            System.out.println(var);
            break;    
        }
        
        case 4: { // client ordered pasta with cream sauce
            var = (adult)?"Port wine" : "Still Water";
            System.out.println(var);
            break; 
        }

        case 5: { // client ordered a soup
            System.out.println("The restaurant suggests: Sparkling Water");
            break;
        }

        default: {
            System.out.println("The restaurant does not have such a menu!");
            break;
        }
        }
    } 

}