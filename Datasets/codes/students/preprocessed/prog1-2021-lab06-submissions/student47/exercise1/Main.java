import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        String name; //the name (eg. pav1, pav2, ...) we pass on to Ticket or GroupTicket
        Pavilion[] arpav = new Pavilion[9]; // we create a Pavilion array with 9 as size, since we only have 9 Pavilions

        System.out.println("Welcome!");
        System.out.println("Would you like a normal or a groupticket? Enter 'n' for normal or 'g' ");
        Scanner sc = new Scanner(System.in);
        String whatTicket = sc.nextLine(); // input n or g for "normal" or "group"


        if (whatTicket.equals("n")){ //check for group/single
            System.out.println("Please select which Pavilion you would like to visit:");
            System.out.println("You can select the Pavilion (1 to 9) by typing its number in the terminal. If you'd like to visit multiple Pavilions, please press Enter after each number\n To finish, enter 0");
            boolean toDo = true;

            while (toDo){ //for each Pavilion called, create a new Pavilion Object in the Array
                Scanner sc2 = new Scanner(System.in);
                int n = sc2.nextInt();  //Input for the Pavilion number
                switch(n){
                    case 1: 
                    name = "pav1";    
                    Pavilion pav1 = arpav[0] = new Pavilion(name); break;
                    case 2: 
                    name = "pav2";    
                    Pavilion pav2 = arpav[1] = new Pavilion(name); break;
                    case 3: 
                    name = "pav3";    
                    Pavilion pav3 = arpav[2] = new Pavilion(name); break;
                    case 4: 
                    name = "pav4";    
                    Pavilion pav4 = arpav[3] = new Pavilion(name); break;
                    case 5: 
                    name = "pav5";    
                    Pavilion pav5 = arpav[4] = new Pavilion(name); break;
                    case 6: 
                    name = "pav6";    
                    Pavilion pav6 = arpav[5] = new Pavilion(name); break;
                    case 7: 
                    name = "pav7";    
                    Pavilion pav7 = arpav[6] = new Pavilion(name); break;
                    case 8: 
                    name = "pav8";    
                    Pavilion pav8 = arpav[7] = new Pavilion(name); break;
                    case 9: 
                    name = "pav9";    
                    Pavilion pav9 = arpav[8] = new Pavilion(name); break;
                    case 0: System.out.println("Finished"); toDo = false; break; //case 0 breaks the loop with the boolean set to false
                    default: System.out.println("Please try again:"); //default doesn't break loop but prompts for re-entry
                }

            }
           //If input is correct, we create a Ticket Object with the array as its parameter
            System.out.println("Your ticket will be generated.");
                    Ticket ticket = new Ticket(arpav);
                    System.out.println(ticket.toString());
            }
            else if (whatTicket.equals("g")){ //Check for group/single
            System.out.println("Please enter the number of people in your group: ");
            Scanner sc3 = new Scanner(System.in);
            int num = sc3.nextInt();
            System.out.println("Please select which Pavilion you would like to visit:");
            System.out.println("You can select the Pavilion (1 to 9) by typing its number in the terminal. If you'd like to visit multiple Pavilions, please press Enter after each number\n To finish, enter 0");
            boolean toDo = true;

            while (toDo){ //for each Pavilion called, create a new Pavilion Object in the Array
                Scanner sc2 = new Scanner(System.in);
                int n = sc2.nextInt(); //Input for the Pavilion number
                switch(n){
                    case 1: 
                    name = "pav1";    
                    Pavilion pav1 = arpav[0] = new Pavilion(name); break;
                    case 2: 
                    name = "pav2";    
                    Pavilion pav2 = arpav[1] = new Pavilion(name); break;
                    case 3: 
                    name = "pav3";    
                    Pavilion pav3 = arpav[2] = new Pavilion(name); break;
                    case 4: 
                    name = "pav4";    
                    Pavilion pav4 = arpav[3] = new Pavilion(name); break;
                    case 5: 
                    name = "pav5";    
                    Pavilion pav5 = arpav[4] = new Pavilion(name); break;
                    case 6: 
                    name = "pav6";    
                    Pavilion pav6 = arpav[5] = new Pavilion(name); break;
                    case 7: 
                    name = "pav7";    
                    Pavilion pav7 = arpav[6] = new Pavilion(name); break;
                    case 8: 
                    name = "pav8";    
                    Pavilion pav8 = arpav[7] = new Pavilion(name); break;
                    case 9: 
                    name = "pav9";    
                    Pavilion pav9 = arpav[8] = new Pavilion(name); break;
                    case 0: System.out.println("Finished"); toDo = false; break; //case 0 breaks the loop with the boolean set to false
                    default: System.out.println("Please try again:");  //default doesn't break loop but prompts for re-entry
                }

            }
           //if Input is correct, we create a Groupticket Object with the array and the number of people as parameters 
            System.out.println("Your ticket will be generated.");

                    Ticket ticket = new GroupTicket(arpav,num);
                    
                    System.out.println(ticket.toString());
            }
            //If Input is incorrect, we do nothing
            else { 
                System.out.println("No ticket will be generated.");
            }
            
        sc.close();
        }
        
       

        

        
    
        
        
}

