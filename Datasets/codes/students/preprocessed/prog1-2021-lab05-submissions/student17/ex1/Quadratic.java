import java.util.Scanner;

public class Quadratic {
  //define
  public static int numberA;
      public static int numberB;
      public static int numberC;
      public static double root1;
      public static double root2;
  //main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ask the user to enter first number
        System.out.println("Please enter a number");
        numberA = scanner.nextInt();
        //ask user to enter second number
        System.out.println("Please enter a number");
        numberB = scanner.nextInt();
        //ask the user to enter third number
        System.out.println("Please enter a number");
        numberC = scanner.nextInt();
        //check if discriminant is bigger than zero
         if (getDiscriminant()>0)
         {
           //output=2roots
           System.out.println("Now we have 2 roots");
           System.out.println("Root1" + root1());
           System.out.println("Root2" + root2());
         }
         //check if discriminant is equal to zero
         else if (getDiscriminant()==0)
         {
          System.out.println("Only 1 root");
           System.out.println("Root1" + root1());
         }
         //there isn't a discriminant
         else
         {
          System.out.println("So there isn't a root");
         }
         //close the scanner
        scanner.close();
      }
      public static double getDiscriminant()
        {
          //returns discriminant
          double disc=Math.pow(numberB, 2) - (4*numberA*numberC);
          return disc;
        }
        public static double root1()
        {
          //returns the first root
          double root1 = (-numberB + Math.sqrt(getDiscriminant())) / (2.0 * numberA);
          return root1;
        }
        public static double root2()
        {
          //returns second root
          double root2 = (-numberB - Math.sqrt(getDiscriminant())) / (2.0 * numberA);
          return root2;
        }
        public int numberA()
        {
          return numberA;
        }
        public int numberB()
        {
          return numberB;
        }
        public int numberC()
        {
          return numberC;
        }

}
