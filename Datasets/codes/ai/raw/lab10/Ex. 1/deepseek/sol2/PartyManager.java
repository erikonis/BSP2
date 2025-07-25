import java.util.Scanner;

public class PartyManager {
    private final Party[] parties;
    private final Scanner scanner;
    
    public PartyManager(int partyCount) {
        this.parties = new Party[partyCount];
        for (int i = 0; i < parties.length; i++) {
            parties[i] = new Party();
        }
        this.scanner = new Scanner(System.in);
    }
    
    public void run() {
        while (true) {
            printMenu();
            try {
                int choice = readIntInput("Choose an option: ");
                switch (choice) {
                    case 0 -> { return; }
                    case 1 -> createCharacter();
                    case 2 -> viewParty();
                    default -> System.out.println("Invalid option");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    
    private void printMenu() {
        System.out.println("\n=== Party Manager ===");
        System.out.println("0. Exit");
        System.out.println("1. Create character");
        System.out.println("2. View party");
    }
    
    private void createCharacter() throws Exception {
        String name = readNameInput();
        CharacterRole role = readRoleInput();
        int partyIndex = readPartyIndex();
        
        Character character = new Character(name, role);
        parties[partyIndex].addMember(character);
        System.out.println("Character added successfully!");
    }
    
    private String readNameInput() throws Exception {
        System.out.print("Enter character name: ");
        String name = scanner.nextLine().trim();
        if (name.isEmpty()) {
            throw new Exception("Name cannot be empty");
        }
        if (name.length() > 20) {
            throw new Exception("Name cannot exceed 20 characters");
        }
        return name;
    }
    
    private CharacterRole readRoleInput() throws Exception {
        System.out.print("Enter role (DAMAGE/TANK/HEALER): ");
        String roleInput = scanner.nextLine().trim();
        try {
            return CharacterRole.fromInput(roleInput);
        } catch (IllegalArgumentException e) {
            throw new Exception("Invalid role. Must be DAMAGE, TANK, or HEALER");
        }
    }
    
    private int readPartyIndex() throws Exception {
        int index = readIntInput("Add to party (0-" + (parties.length-1) + "): ");
        if (index < 0 || index >= parties.length) {
            throw new Exception("Invalid party index");
        }
        return index;
    }
    
    private void viewParty() throws Exception {
        int index = readPartyIndex();
        System.out.println("\n=== Party " + index + " ===");
        System.out.println(parties[index]);
    }
    
    private int readIntInput(String prompt) throws Exception {
        System.out.print(prompt);
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            throw new Exception("Please enter a valid number");
        }
    }
}