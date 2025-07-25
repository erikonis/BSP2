import java.util.InputMismatchException;
import java.util.Scanner;

public class Launcher {
    static Party p0 = new Party();
    static Party p1 = new Party();
    static boolean cont = true;

    public static void main(String[] args) {

        do {
            Command();
        }

        while (cont);

    }

    public static void ShowMenu() {
        System.out.println("Commands:\n0 - Exit\n1 - Create new character\n2 - Show party\n");
    }

    public static void Command() {
        ShowMenu();
        System.out.print("Command: ");
        try {
            Scanner scanner = new Scanner(System.in);
            int ch = scanner.nextInt();

            try {
                execute(ch);
            } catch (WrongMenuValue e) {
                System.err.println("Wrong menu value(see the options!)");
                ;
            }

        } catch (InputMismatchException ex) {
            System.err.println("Wrong value type for this field.");

        } 
    }

    public static void execute(int ch) throws WrongMenuValue {
        switch (ch) {
            case 0:
                System.out.println("Exiting..");
                cont = false;
                break;
            case 1:
                System.out.println("Creating new character..");
                createChar();
                break;
            case 2:
                System.out.print("Show party (0 or 1): ");
                Scanner scanner = new Scanner(System.in);
                int p = scanner.nextInt();
                try {
                    showParty(p);
                } catch (IndexOutOfBoundsException e) {
                    System.err.println("Unexpected index: Index " + p + " out of bounds for length 2");
                }
                break;
            default:
                throw new WrongMenuValue(ch);
        }
    }

    public static void createChar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        if (name.isEmpty())
            name = scanner.nextLine();

        System.out.print("Enter role (TANK, DAMAGE or HEALER): ");
        String role = scanner.next();

        try {
            Character c = new Character(name, role);
            System.out.print("Add to party (0 or 1): ");
            int p = scanner.nextInt();
            try {
                addparty(p, c);
            } catch (IndexOutOfBoundsException ex) {
                System.err.println("Unexpected index: Index " + p + " out of bounds for length 2");
            }

        } catch (TooLong e) {
            System.err.println("Invalid character name (name is too long - max 20 characters): " + name);

        } catch (EmptyName e) {
            System.err.println("Invalid character name (name can't be empty): ");
        } catch (UnknownChar e) {
            System.err.println("Unknown character role: " + e.getRole());
        }
    }

    public static void tryToAdd(Party p, Character c) {
        try {
            p.add(c);
            System.out.println("Added " + c.getName() + " (" + c.getRole() + ") to party " + p.getNrc() + ".");
        } catch (TooManyChar e) {
            System.err.println("Party has reached maximum number of characters!(4)");
        } catch (TooManySpecificChar e) {
            System.err.println("Party has reached maximum number of " + c.getRole() + "!");
        } catch (AlreadyInParty e) {
            System.err.println("Can't add " + c.getName() + " to the party, they're already in it, lol!");
        }
    }

    public static void addparty(int p, Character c) throws IndexOutOfBoundsException {
        switch (p) {
            case 0:
                tryToAdd(p0, c);
                break;
            case 1:
                tryToAdd(p1, c);
                break;
            default:
                throw new IndexOutOfBoundsException();
        }
    }

    public static void showParty(int p) throws IndexOutOfBoundsException {
        switch (p) {
            case 0:
                System.out.println(p0);
                break;
            case 1:
                System.out.println(p1);
                break;
            default:
                throw new IndexOutOfBoundsException();

        }
    }
}
