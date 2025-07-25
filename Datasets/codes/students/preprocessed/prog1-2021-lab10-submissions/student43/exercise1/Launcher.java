import java.rmi.NotBoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Party karasuno = new Party();
        Party nekoma = new Party();
        String invalid = "Invalid character name";
        int answer = 5;
        String name = "";
        String role = "";

        do {
            System.out.println("Commands: ");
            System.out.println("0 - Exit");
            System.out.println("1 - Create new Character");
            System.out.println("2 - Show Party");

            try {
                System.out.print("\nCommand: ");

                answer = scanner.nextInt();
                scanner.nextLine();

                if (answer < 0 || answer > 2) {
                    throw new NotBoundException();
                }

            } catch (NotBoundException e) {
                System.out.println("This is not a command id\nWrong value type for this field.");

            } catch (InputMismatchException e) {// not handled infinite loop/exiting loop
                scanner.nextLine();
                answer = 5;
                System.out.println("This is not a command id\nWrong value type for this field.");

            }

            if (answer == 1) {
                System.out.println("Creating new character...");

                try {
                    System.out.print("Enter name: ");
                    name = scanner.nextLine();

                    if (name.length() == 0) {
                        throw new EmptyNameException();
                    }
                    if (name.length() > 20) {
                        throw new TooLongNameException();
                    }

                    System.out.print("Enter role (DAMAGE, TANK, HEALER): ");
                    role = scanner.next();
                    if (!role.equals("damage".toUpperCase()) && !role.equals("tank".toUpperCase())
                            && !role.equals("healer".toUpperCase())) {
                        throw new RoleNotExistException();
                    } else {
                        CharacterRole enumRole = CharacterRole.valueOf(role);
                        Character player = new Character(name, enumRole);

                        System.out.print("Add to party (0 or 1): ");
                        int response = scanner.nextInt();
                        if (response == 0) {

                            if (!karasuno.getCharacters().contains(player)) {
                                karasuno.add(player);
                                System.out.println(
                                        "Added " + player.getName() + " (" + player.getRole()
                                                + ") to party Karasuno");
                            } else {
                                throw new SamePersonException();
                            }

                        } else if (response == 1) {

                            if (!nekoma.getCharacters().contains(player)) {
                                nekoma.add(player);
                                System.out.println(
                                        "Added " + player.getName() + " (" + player.getRole()
                                                + ") to party Nekoma");
                            } else {
                                throw new SamePersonException();
                            }

                        } else {
                            throw new NotBoundException();
                        }
                    }
                } catch (SamePersonException e) {
                    System.out.println("Can't add " + name + " (" + role + ") to party, they're already in it.");
                } catch (NotBoundException e) {
                    System.out.println("This party does not exist.");
                } catch (TooLongNameException e) {
                    System.out.println(invalid + " (name is too long - max 20 characters): " + name);
                } catch (EmptyNameException e) {
                    System.out.println(invalid + " (name can't be empty)");
                } catch (RoleNotExistException e) {
                    System.out.println("Unknown character role.");
                } catch (PartyFullException e) {
                    System.out.println("The party is full: no other characters can be added.");
                } catch (RoleAlreadyExistsException e) {
                    System.out.println("This character role has been filled.");
                }

            }
            if (answer == 2) {
                System.out.print("Show Party (0 or 1): ");
                int index = 0;
                try {
                    index = scanner.nextInt();
                    if (index == 0) {
                        System.out.println(karasuno);
                    } else if (index == 1) {
                        System.out.println(nekoma);
                    } else {
                        throw new IndexOutOfBoundsException();
                    }
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Index " + index + " out of bounds for length 2.");
                }
            }
            if (answer == 0) {
                System.out.println("Exiting!");
            }
        } while (answer != 0);
        scanner.close();
    }

}
