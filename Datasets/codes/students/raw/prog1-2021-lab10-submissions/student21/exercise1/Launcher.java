package lu.uni.programming1.lab10.exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean end = false;
        Party party0 = new Party();
        Party party1 = new Party();

        while (!end) {
            CommandList();
            end = createParty(scanner, party0, party1);
            System.out.println("\n");
        }
        scanner.close();
    }

    public static void CommandList() {
        System.out.println("Commands:\n0 - Exit\n1 - Create new character\n2 - Show party");
    }

    public static boolean createParty(Scanner scanner, Party party0, Party party1) {
        boolean end = false;
        int choice = 0;
        while (!end) {
            try {
                System.out.print("\nCommand: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // consumes the \n
                switch (choice) {
                    case 0:
                        System.out.println("Exiting!");
                        end = true;
                        return true;
                    case 1:
                        System.out.println("Creating new Character...");
                        String name = askName(scanner);
                        CharacterRole role = askRole(scanner);
                        askParty1(scanner, party0, name, role, party1);
                        end = true;
                        break;
                    case 2:
                        askParty2(scanner, party0, party1);
                        end = true;
                        break;
    
                    default:
                        System.out.println("Index is out of bounds!");
                        break;
    
                }
            } catch (InputMismatchException e) {
                System.out.print("Wrong value type for this field.");
                scanner.nextLine(); // consumes the \n
            }
        }
        return false;

    }

    public static String askName(Scanner scanner) {
        boolean end = false;
        String name = "";
        while (!end) {
            System.out.print("Enter name: ");
            name = scanner.nextLine();
            if (name.length() > 20) {
                System.out.printf("Invalid character name (name is too long - max 20 characters): %s\n",
                        name);
            } else if (name.isEmpty()) {
                System.out.println("Invalid character name (name can't be empty).");
            } else
                end = true;
        }
        return name;
    }

    public static CharacterRole askRole(Scanner scanner) {
        boolean end = false;
        CharacterRole role = null;
        while (!end) {
            try {
                System.out.print("Enter role (DAMAGE, TANK, HEALER): ");
                role = CharacterRole.valueOf(scanner.nextLine());
                end = true;
            } catch (IllegalArgumentException e) {
                System.out.print("Unknown character role.");
                System.out.println("\n");
            }
        }
        return role;
    }

    public static void askParty1(Scanner scanner, Party party0, String name, CharacterRole role, Party party1) {
        boolean end = false;
        int party = 0;
        while (!end) {
            try {
                System.out.print("Add to party (0 or 1): ");
                party = scanner.nextInt();
                scanner.nextLine(); // consumes the \n
                switch (party) {
                    case 0:
                        party0.add(new Character(name, role), party);
                        end = true;
                        break;
                    case 1:
                        party1.add(new Character(name, role), party);
                        end = true;
                        break;

                    default:
                        throw new PartyMismatchException();
                }
            } catch (PartyMismatchException e) {
                System.out.println("Party Index is out of bounds.");
            } catch (InputMismatchException e) {
                System.out.println("Wrong value type for this field.");
                scanner.nextLine(); // consumes the \n
            }
        }
    }

    public static void askParty2(Scanner scanner, Party party0, Party party1) {
        boolean end = false;
        int party = 0;
        while (!end) {
            try {
                System.out.print("Show party (0 or 1): ");
                party = scanner.nextInt();
                scanner.nextLine(); // consumes the \n
                switch (party) {
                    case 0:
                        System.out.println(party0);
                        end = true;
                        break;
                    case 1:
                        System.out.println(party1);
                        end = true;
                        break;
                    default:
                        throw new PartyMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong value type for this field.");
                scanner.nextLine(); // consumes the \n
            } catch (PartyMismatchException e) {
                System.out.println("Party Index is out of bounds.");
            }
        }
    }

}
