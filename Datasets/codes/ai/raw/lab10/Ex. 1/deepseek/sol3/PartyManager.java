import java.util.Scanner;

public class PartyManager implements Subscriber<PartyEvent> {
    private final Party[] parties;
    private final Scanner scanner;
    
    public PartyManager(int partyCount) {
        this.parties = new Party[partyCount];
        for (int i = 0; i < parties.length; i++) {
            parties[i] = new Party();
            parties[i].subscribe(this);
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
    
    // Implement Subscriber methods
    @Override
    public void onSubscribe(Subscription subscription) {}
    
    @Override
    public void onNext(PartyEvent event) {
        System.out.println("\n[Event] " + event.getType() + ": " + event.getCharacter());
    }
    
    @Override
    public void onError(Throwable throwable) {
        System.err.println("Party error: " + throwable.getMessage());
    }
    
    @Override
    public void onComplete() {}
    
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
        try {
            parties[partyIndex].addCharacter(character);
        } catch (Party.PartyException e) {
            throw new Exception("Failed to add character: " + e.getMessage());
        }
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
        String roleInput = scanner.nextLine().trim().toUpperCase();
        try {
            return CharacterRole.valueOf(roleInput);
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
        parties[index].getMembers().forEach(System.out::println);
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