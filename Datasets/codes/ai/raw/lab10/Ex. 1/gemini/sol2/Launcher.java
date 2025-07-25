import java.util.InputMismatchException;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Party[] parties = new Party[2];
        parties[0] = new Party();
        parties[1] = new Party();
        Scanner scanner = new Scanner(System.in);
        EventManager eventManager = EventManager.getInstance();

        // Register Handlers
        eventManager.registerHandler(CreateCharacterEvent.class, new CharacterCreationHandler());
        eventManager.registerHandler(AddCharacterToPartyEvent.class, new PartyManagementHandler(parties));
        eventManager.registerHandler(ViewPartyEvent.class, new ViewPartyHandler(parties));

        while (true) {
            System.out.println("\n--- Final Fantasy Party Manager (Event-Driven) ---");
            System.out.println("0 - Exit");
            System.out.println("1 - Create a new character");
            System.out.println("2 - View a Party");
            System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 0:
                        System.out.println("Exiting program.");
                        scanner.close();
                        return;
                    case 1:
                        createCharacter(scanner, eventManager);
                        break;
                    case 2:
                        viewParty(scanner, eventManager);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input type. Please enter an integer.");
                scanner.nextLine(); // Consume the invalid input
            }
        }
    }

    private static void createCharacter(Scanner scanner, EventManager eventManager) {
        System.out.print("Enter character name: ");
        String characterName = scanner.nextLine();

        System.out.print("Enter character role (DAMAGE, TANK, HEALER): ");
        String roleString = scanner.nextLine();

        eventManager.dispatch(new CreateCharacterEvent(characterName, roleString));

        System.out.print("Enter the Party to add the character to (0 or 1, or -1 to skip): ");
        int partyIndex = scanner.nextInt();
        scanner.nextLine();

        if (partyIndex != -1) {
            // We need a way to get the created character. For simplicity, let's assume the last created character
            // had the given name. In a real system, you'd likely have a character registry.
            Character dummyCharacter = new Character(characterName, CharacterRole.fromString(roleString));
            eventManager.dispatch(new AddCharacterToPartyEvent(dummyCharacter, partyIndex));
        }
    }

    private static void viewParty(Scanner scanner, EventManager eventManager) {
        System.out.print("Enter the Party to view (0 or 1): ");
        int partyIndex = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        eventManager.dispatch(new ViewPartyEvent(partyIndex));
    }
}