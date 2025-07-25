package lu.uni.programming1.lab10.exercise1;

import java.util.Scanner;

public class LauncherEx1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Party p1 = new Party();
        Party p2 = new Party();
        
        while (true)
        {
            System.out.println("Commands:\n0 - Exit\n1 - Create new Character\n2 - Show Party");
            int input = 10;
            while (true)
            {
            try
            {
                input = sc.nextInt();
                break;
            }
            catch (Exception e)
            {
                System.out.println("Please enter a number. (0/1/2)");
            }
        }
            if (input == 0)
            {
                System.out.println("Exiting Program.");
                break;
            }

            switch (input)
            {
                case 1 : 
                {
                    String charName = "";
                    while (true)
                    {
                        charName = sc.nextLine();
                        if(charName.length() <= 20 && charName.length() > 0)
                        {
                            break;
                        }
                        else
                        {
                            System.out.println("Please enter a character name between 1 and 20 letters.");
                        }
                    }
                    
                    CharacterRole role;
                    while (true)
                    {
                        System.out.println("Please enter character role.");
                        try
                        {
                            role = CharacterRole.valueOf(sc.nextLine());
                            break;
                        }
                        catch (Exception e)
                        {
                            System.out.println("Non-valid role.\nDAMAGE, HEALER, or TANK");
                        }
                    }
                    Character newChar = new Character(charName, role);
                    System.out.println("To which party should " + charName + " be added to? (0/1)");
                    
                    while (true)
                    {
                        try
                        {
                            int partySelect = sc.nextInt();
                            if(partySelect == 0)
                            {
                                p1.add(newChar);
                                break;
                            }
                            else if (partySelect == 1)
                            {
                                p2.add(newChar);
                                break;
                            }
                            else
                            {
                                System.out.println("Please enter a valid number. (0/1)");
                            }
                            
                        }
                        catch (Exception e)
                        {
                            System.out.println("Please enter a valid number. (0/1)");
                        }
                    }
                }
                break;

                case 2 :
                {
                    System.out.println("Please enter the party you would like to view. (0/1)");
                    try
                        {
                            int partySelect = sc.nextInt();
                            if(partySelect == 0)
                            {
                                System.out.println(p1);
                                break;
                            }
                            else if (partySelect == 1)
                            {
                                System.out.println(p2);
                                break;
                            }
                            else
                            {
                                System.out.println("Please enter a valid number. (0/1)");
                            }
                            
                        }
                        catch (Exception e)
                        {
                            System.out.println("Please enter a valid number. (0/1)");
                        }
                }
                break;

                default :
                {
                    System.out.println("Not a valid number");
                }
                break;
            }

        }
        sc.close();
    }
    
}
