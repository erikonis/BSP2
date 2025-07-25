    
import java.util.Scanner;
           
public class QuadraticEquation {
       public static void main(String[] args) {
    // Declare all required variables
   private int a;
   private int b;
   private int c;

   // Default constructor
   public QuadraticEquation() {

   }

   // Parameterized constructor
   public QuadraticEquation(int a, int b, int c) {
       this.a = a;
       this.b = b;
       this.c = c;
   }

   // Three getter methods for a,b,c
   public int getA() {
       return a;
   }

   public int getB() {
       return b;
   }

   public int getC() {
       return c;
   }

   // Method to get discriminant
   public int getDiscriminat() {
       int discriminant;
       discriminant = b * b - 4 * a * c;
       return discriminant;
   }

   // Method to getRoot1
   public double getRoot1() {

       double root1;
       root1 = (double) (-b + Math.sqrt(getDiscriminat())) / (2 * a);
       return root1;
   }

   // Method to getRoot2
   public double getRoot2() {

       double root2;
       root2 = (double) (-b - Math.sqrt(getDiscriminat())) / (2 * a);
       return root2;
   }

}
}



