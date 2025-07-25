package lu.uni.programming1.lab10.exercise1;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        // Implement the main program here, i.e. this is where you will read the various
        // inputs from the user.
        // Remember: your program should run forever, i.e. constantly expect input from
        // the user, until they explicitly enter '0' to exit the program.
        Party p0 = new Party();
        Party p1 = new Party();
        int input;
        boolean continueProcess = true;
        Scanner scanner = new Scanner(System.in);

        while (continueProcess) {
            try {
                System.out.println("Commands:");
                System.out.println("0 - Exit");
                System.out.println("1 - Add Character");
                System.out.println("2 - Display Party\n");
                input = scanner.nextInt();
                if (input > 2 || input < 0) {
                    throw new IndexOutOfBoundsException("This action is not defined!");
                } else if (input == 0) {
                    continueProcess = false;
                    break;
                } else if (input == 1) {
                    System.out.println("Command:1");
                    System.out.println("Creating a new Character...");
                    System.out.print("Enter a name:");
                    String name = scanner.next();
                    System.out.print("Enter a role (DAMAGE, HEALER or TANK):");
                    String tmp = scanner.next();
                    CharacterRole role;
                    if (tmp.equals("DAMAGE")) {
                        role = CharacterRole.DAMAGE;
                    } else if (tmp.equals("HEALER")) {
                        role = CharacterRole.HEALER;
                    } else if (tmp.equals("TANK")) {
                        role = CharacterRole.TANK;
                    } else {
                        throw new EnumConstantNotPresentException(CharacterRole.class, tmp);
                    }
                    Character test = new Character(name, role);
                    System.out.print("Add to party (0 or 1)");
                    input = scanner.nextInt();
                    if (input > 1 || input < 0) {
                        throw new IndexOutOfBoundsException("This party doesn't exist p" + input);
                    } else if (input == 0) {
                        p0.add(test);
                        System.out.println("Added " + test.toString());
                    } else {
                        p1.add(test);
                        System.out.println("Added " + test.toString());
                    }
                } else {
                    System.out.print("Display party (0 or 1)");
                    input = scanner.nextInt();
                    if (input > 1 || input < 0) {
                        throw new IndexOutOfBoundsException("This team doesn't exist!");
                    } else if (input == 0) {
                        System.out.println(p0.toString());
                    } else {
                        System.out.println(p1.toString());
                    }
                }
            } catch (EnumConstantNotPresentException e) {
                System.out.println("There is no such Role.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
