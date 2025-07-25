package lu.uni.programming1.lab10.exercise1;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        // Implement the main program here, i.e. this is where you will read the various
        // inputs from the user.
        // Remember: your program should run forever, i.e. constantly expect input from
        // the user, until they explicitly enter '0' to exit the program.

        Party p1 = new Party();
        Party p2 = new Party();

        Scanner s = new Scanner(System.in);

        System.out.println("Commands:\n0 - Exit\n1 - Create new character\n2 - Show party");
        int input = s.nextInt();

        while (input != 0) {
            try {
                if (input < 0 || input > 2) {
                    throw new IndexOutOfBoundsException("Command: this is not a command id\nWrong value type for this field.");
                }

                if (input == 1) {
                    System.out.println("Command: 1\nCreating new character...\nEnter name: ");
                    String name = s.next();
                    System.out.println("Enter role (DAMAGE, TANK, HEALER): ");
                    String roleString = s.next();
                    CharacterRole role;

                    if(roleString.equals("HEALER"))
                    {
                        role = CharacterRole.HEALER;
                    }
                    else if(roleString.equals("DAMAGE"))
                    {
                        role = CharacterRole.DAMAGE;
                    }
                    else if(roleString.equals("TANK"))
                    {
                        role = CharacterRole.TANK;
                    }
                    else
                    {
                        throw new EnumConstantNotPresentException(CharacterRole.class, roleString);
                    }
                    Character c = new Character(name, role);

                    System.out.println("Add to party (0 or 1): ");
                    int place = s.nextInt();

                    if (place == 0) {
                        p1.add(c);
                    } else if (place == 1) {
                        p2.add(c);
                    }
                    else
                    {
                        throw new IndexOutOfBoundsException("This party does not exist");
                    }
                } else if (input == 2) {
                    System.out.println("Command: 2\nShow party (0 or 1): ");
                    int party = s.nextInt();

                    if (party == 0) 
                    {
                        System.out.println(p1.toString());
                    } 
                    else if (party == 1) 
                    {
                        System.out.println(p2.toString());
                    }
                    else 
                    {
                        throw new IndexOutOfBoundsException("Unexpected index: Index " + party + " out of bounds for length 2");
                    }
                }
            } catch (EnumConstantNotPresentException e)
            {
                System.err.println("Unknown character role.");
            }catch (Exception e) {
                System.err.println(e.getMessage());
            }
            finally
            {
                System.out.println("Commands:\n0 - Exit\n1 - Create new character\n2 - Show party");
                input = s.nextInt();
            }
        }
        s.close();
    }
}
