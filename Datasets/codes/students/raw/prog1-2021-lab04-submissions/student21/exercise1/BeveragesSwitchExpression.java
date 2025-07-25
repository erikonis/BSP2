package lu.uni.programming1.lab4.exercise1;

import java.util.Scanner;

public class BeveragesSwitchExpression {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (1 (true)/ 0 (false)");
        int adult = scanner.nextInt();

        scanner.close();

        adult = 1;
        

        // TODO: replace all of the code below by a better construct!
        //       Simplify conditions to make them more readable and make sure the suggestions are still the same!

        switch (menu){
            case  (1): {
                switch (adult){
                    case (1):{
                    System.out.println("Red wine");}

                    break;

                   case (0) :{ System.out.println("Cola");  } 
                    
                }
                break;
            }
                case (2):{
                    switch(adult){

                    
                    case (1):{
                        System.out.println("Red wine");}
                        break;
                     case 2:{
                        System.out.println("Cola");}
                    }
                    break;
    
                }
    
        case (3) :{
    
           switch (adult) {
            case (1):{
                System.out.println("White wine");}
                break;
             case(0):{
                System.out.println("Lemonade");}
            }
            break;
        }
           case (4) :{
    
            switch (adult) {
               case(0):{ System.out.println("Still Water");}
               break;
               case (1):{
                System.out.println("Port wine");}
            }
            break;
           }
    
           case(5) :{
    
            System.out.println("The restaurant suggests: Sparkling Water");
    
            break;
           }
           default : System.out.println("The restaurant does not have such a menu!");
    
        }
    }
    }