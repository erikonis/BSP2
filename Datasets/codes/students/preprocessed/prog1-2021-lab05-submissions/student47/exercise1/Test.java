import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Gets user input
        System.out.println("a:");
        int a = sc.nextInt();
        System.out.println("b:");
        int b = sc.nextInt();
        System.out.println("c:");
        int c = sc.nextInt();
        // Creates new quadratic equation with given a, b and c
        Quadratic quad = new Quadratic(a,b,c);
        // Prints roots if they exist
        System.out.println(quad.getDiscriminant());
        if(quad.getDiscriminant() > 0){
            System.out.println("There are two roots: \nRoot1: " + quad.getRoot1());
            System.out.println("Root2: " + quad.getRoot2());
        }
        else if(quad.getDiscriminant() == 0){
            System.out.println("There is one root: " + quad.getRoot1());
        }
        else{
            System.out.println("The equation has no roots!");
        }

        sc.close();
    }
}
