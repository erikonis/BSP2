package lu.uni.programming1.lab4.exercise1;


import java.util.Scanner;


public class BeveragesSwitchExpression {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();
        int value = 0;
        if (adult==true)
        {
            value = 1;
        }else
        {
            value = 0;
        } 
        scanner.close();
        switch(menu)
        {
            
            case 1:
                switch(value)
                {
                    case 1:
                        System.out.print("The restaurant suggests: ");
                        System.out.println("Red wine");
                        break;
                    default:
                        System.out.print("The restaurant suggests: ");
                        System.out.println("Cola");
                        break;   
                }
               
            break;       
            case 2:
                switch(value)
                {
                    case 1:
                        System.out.print("The restaurant suggests: ");
                        System.out.println("Red wine");
                        break;
                    default:
                       System.out.print("The restaurant suggests: ");
                       System.out.println("Cola"); 
                       break;
                }
            break;
            case 3:
                switch(value)
                {
                    case 1:
                       System.out.print("The restaurant suggests: ");
                       System.out.println("White wine"); 
                       break;
                    default: 
                        System.out.print("The restaurant suggests: ");
                        System.out.println("Lemonade");
                        break;   
                }
            break;         
            case 4:
                switch(value)
                {
                    case 0:
                        System.out.print("The restaurant suggests: ");
                        System.out.println("Still Water");
                        break;
                    default:
                       System.out.println("Port wine");
                       break;
                }
            break;    
            case 5:
                System.out.println("The restaurant suggests: Sparkling Water");
                break;
            default:
                System.out.println("The restaurant does not have such a menu!");
                break;
                
        }
        
      
    } 
    
}
