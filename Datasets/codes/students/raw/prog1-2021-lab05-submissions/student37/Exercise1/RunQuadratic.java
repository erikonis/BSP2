package Exercise1;

import java.util.Scanner;

public class RunQuadratic {

    public static void main(String[] args) {

        double d; 

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the coefficients a b c (separate them with a space) : ");
        String abcString = sc.nextLine();

        if (abcString.length()>5 || abcString.length()<5) {System.out.println("Incompatible number format! "); sc.close(); System.exit(9);}; 

        char[] cArray = new char[abcString.length()];

        for (int i = 0; i < abcString.length(); i++) {

            cArray[i] = abcString.charAt(i);

        };
        
        if ( (cArray[1] !=' ') && (cArray[3] !=' ') && (cArray[5]!=' ') )  {System.out.println("Incompatible number format! "); sc.close(); System.exit(9);   }; 
        
        double n1 = Double.parseDouble(Character.toString(cArray[0])); if (n1==0) {System.out.println("a cannot be 0... exiting... "); sc.close(); System.exit(0);}; 
        double n2 = Double.parseDouble(Character.toString(cArray[2]));
        double n3 = Double.parseDouble(Character.toString(cArray[4]));

        d = Quadratic.getDiscriminant(n1, n2, n3);

        System.out.println("The discriminant is: " + d);

        if (d>=0) { double r1 = Quadratic.getRoot1(n1, n2, n3); System.out.println("Root 1: " + r1);
            
            if (d>0) { double r2 = Quadratic.getRoot2(n1, n2, n3); System.out.println("Root 2: " + r2);}; } 
        
        else {System.out.println("The equation has no roots; ");}; 

        sc.close();
        
    }
    
}