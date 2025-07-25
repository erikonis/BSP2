package lu.uni.programming1.lab10.exercise1;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        Party party0 = new Party();
        Party party1 = new Party();

        // Implement the main program here, i.e. this is where you will read the various
        // inputs from the user.
        // Remember: your program should run forever, i.e. constantly expect input from
        // the user, until they explicitly enter '0' to exit the program.
        boolean exit = false;

        while(true)
        {
            try {
                    System.out.print("\nCommands:\n0 - Exit\n1 - Create new character\n2 - Show party\n\nCommand : ");
                    int input = scanner1.nextInt();
                switch(input)
                {
                    case 0:
                    {
                        exit = true;
                        break;
                    }
                    case 1:
                    {
                        Character character = null;
                        try {
                            character = Party.createCharacter(scanner2);
                        } catch (Exception e) {
                            System.out.println(e.toString());
                            break;
                        }

                        System.out.print("\nAdd to party (0 or 1): ");
                        String index = scanner2.nextLine();

                        try {

                            if(index.equals("0")) 
                            {
                                System.out.println("Added "+character.getName()+" ("+character.getRole()+") to party 0");
                                try {
                                    party0.add(character);
                                } catch (Exception e) {
                                    System.out.println(e.toString());;
                                }
                            }
                            else if(index.equals("1")) 
                            {
                                System.out.println("Added "+character.getName()+" ("+character.getRole()+") to party 1");
                                try {
                                    party1.add(character);
                                } catch (Exception e) {
                                    System.out.println(e.toString());
                                }
                            }
                            else throw new InvalidInput(index);

                        } catch (InvalidInput e) {
                            System.out.println("Unexpected index: Index "+e.getInput()+" out of bounds for length 2");
                        }
                        break;
                    }
                    case 2:
                    {
                        System.out.print("\nShow party (0 or 1): ");
                        int index = scanner2.nextInt();

                        try{
                            if(index==0||index==1)
                            {
                                switch(index)
                                {
                                    case 0: 
                                        System.out.println(party0.toString());
                                        break;
                                    case 1: 
                                        System.out.println(party1.toString());
                                        break;
                                }
                                break;
                            }
                            else throw new InvalidInput(String.valueOf(index));
                        }
                        catch (InvalidInput e) {System.out.println("Unexpected index: Index "+index+" out of bounds for length 2");}
                        
                    }
                    default : throw new InvalidInput(String.valueOf(input));
                }

                if(exit)
                {
                    scanner1.close();
                    scanner2.close();
                    break;
                }
            } catch (InvalidInput e) {
                System.out.println("\nthis is not a command id\nWrong value type for this field.");
            }
        }
    }
}