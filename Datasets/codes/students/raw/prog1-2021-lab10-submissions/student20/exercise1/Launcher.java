package lu.uni.programming1.lab10.exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Launcher {

    public static void showCommands() {
        System.out.println("Commands:\n0 - Exit\n1 - Create new character\n2 - Show party\n");
    }

    public static Character createCharacter(String name, String role)
            throws NameInvalidException, UnknownCharacterRoleException {
        switch (role) {
            case "TANK":
                return new Character(name, CharacterRole.TANK);
            case "DAMAGE":
                return new Character(name, CharacterRole.DAMAGE);
            case "HEALER":
                return new Character(name, CharacterRole.HEALER);
            default:
                throw new UnknownCharacterRoleException();
        }
    }

    public static void main(String[] args) {

        Party party1 = new Party();
        Party party2 = new Party();

        Party parties[] = { party1, party2 };

        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            showCommands();
            try {
                int command = scanner.nextInt();
                switch (command) {
                    case 1:
                        System.out.println("Command: " + command);
                        System.out.println("Creating new character...");
                        System.out.print("Enter name: ");
                        String name = scanner.next();
                        System.out.print("Enter role (DAMAGE, TANK, HEALER): ");
                        String role = scanner.next();

                        try {
                            Character c = createCharacter(name, role);
                            System.out.print("Add to party (0 or 1): ");
                            int party = scanner.nextInt();
                            switch (party) {
                                case 0, 1:
                                    parties[party].add(c);
                                    System.out.println("Added " + c + " to party " + party);
                                    break;

                                default:
                                    throw new IllegalArgumentException();
                            }

                        } catch (NameInvalidException e) {
                            System.err.println("Invalid character name (" + e.getReason() + "): " + e.getName());
                            break;

                        } catch (UnknownCharacterRoleException e) {
                            System.err.println("Unknown character role.");
                            break;
                        } catch (PartyCharacterAddException e) {
                            System.out.println("Can't add " + e.getCharacter() + " to party: " + e.getReason());
                        }

                        break;
                    case 2:
                        System.out.println("Command: " + command);
                        System.out.print("Show party (0 or 1): ");
                        int party = scanner.nextInt();
                        switch (party) {
                            case 0, 1:
                                System.out.println(parties[party]);
                                break;

                            default:
                                throw new IllegalArgumentException();
                        }

                        break;

                    case 0:
                        System.out.println("Command: " + command + " exiting");
                        running = false;
                        return;
                    default:
                        throw new IllegalArgumentException();
                }

            } catch (InputMismatchException e) {
                scanner.next();
                System.err.println("Command: this is not a command id\nWrong value type for this field.\n");
                continue;
            } catch (IllegalArgumentException e) {
                System.err.println("This is not a valid id\nWrong value type for this field.\n");
                continue;
            }
        }
        scanner.close();
    }
}
