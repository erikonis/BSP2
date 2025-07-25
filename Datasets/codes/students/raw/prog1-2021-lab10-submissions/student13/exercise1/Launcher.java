package lu.uni.programming1.lab10.exercise1;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        // Implement the main program here, i.e. this is where you will read the various
        // inputs from the user.
        // Remember: your program should run forever, i.e. constantly expect input from
        // the user, until they explicitly enter '0' to exit the program.

        Scanner scanner = new Scanner(System.in);

        Party party0= new Party();
        Party party1= new Party();

        System.out.println("Commands: ");
        System.out.println("0 - Exit");
        System.out.println("1 - Create new character");
        System.out.println("2 - Show party");

        System.out.println();
        
        System.out.print("Command: ");
        
        int command=0;
        try
        {
            command= scanner.nextInt();
            while(command != 0)
            {
                if(command == 1)
                {
                    System.out.println("Creating new character...");
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter role (DAMAGE, TANK, HEALER): ");
                    String role = scanner.next();
                    try
                    {
                        if(role.equals("HEALER") || role.equals("DAMAGE") || role.equals("TANK"))
                        {
                            Character character = new Character(name, CharacterRole.valueOf(role));
                            System.out.print("Add to party (0 or 1): ");
                            int party = scanner.nextInt();
                            if(party == 0)
                            {
                                party0.add(character);
                                System.out.println("Added "+ character.getName() + " (" + character.getRole() + ")" + " to party 0.");
                            }
                            else if(party == 1)
                            {
                                party1.add(character);
                                System.out.println("Added "+ character.getName() + " (" + character.getRole() + ")" + " to party 1.");
                            }
                            else
                            {
                                System.out.println("No such party.");
                            }
                        }
                        else
                        {
                            System.out.println("Unknown character role.");
                        }
                        
                    }
                    catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                }
                else if(command == 2)
                {
                    System.out.print("Show party (0 or 1): ");
                    try
                    {
                        int party = scanner.nextInt();
                        if(party == 0)
                        {
                            System.out.println(party0.toString());
                        }
                        else if(party == 1)
                        {
                            System.out.println(party1.toString());
                        }
                        else
                        {
                            System.out.println("Unexpected index: Index " + party + " out of bounds for length 2");
                        }
                    }
                    catch(Exception e)
                    {
                        System.out.println("Index has to be a number!");
                    }  
                }

                System.out.println("Commands: ");
                System.out.println("0 - Exit");
                System.out.println("1 - Create new character");
                System.out.println("2 - Show party");

                System.out.println();
                
                System.out.print("Command: ");

                command= scanner.nextInt();
            }
            
        }
        catch(Exception e)
        {
            System.out.println("this is not a command id\nWrong value type for this field.");
        }

        System.out.println("Exiting!");    
        scanner.close();
    }
}

    