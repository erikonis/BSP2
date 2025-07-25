package exercise1;
import java.util.*;
public class Quadratic {
    int a,b,c;
    // Constructor
      public Quadratic(int x, int y, int z) {
        a = x; b = y; c = z;
      }
    
      public static void main(String[] args) {
      /*  Quadratic myObj = new Quadratic(1,5,6);
       System.out.println(myObj.a);
       System.out.println(myObj.b);
       System.out.println(myObj.c);  
       System.out.println(myObj.getA());   
       System.out.println(myObj.getRoot1());
       System.out.println(myObj.getRoot2()); */
          System.out.println("Solving Quadratic Equation");
    }
    
    // Getter
      public int getA() {
        return a;
      }
    
      public int getB() {
        return b;
      }
    
      public int getC() {
        return c;
      }
    // b2 − 4ac
      public double getDiscriminant(){
        double discriminant ;  
        discriminant = b * b - 4.0 * a * c ;
        return discriminant;
        } 
    // root1
       public double getRoot1(){
            double d = getDiscriminant();
        double root1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
        return root1;
         }
    // root2
       public double getRoot2(){ 
            double d = getDiscriminant() ;
        double root2 = (-b -  Math.pow(d, 0.5)) / (2.0 * a);
        return root2;
         }
    
    
    }
     

