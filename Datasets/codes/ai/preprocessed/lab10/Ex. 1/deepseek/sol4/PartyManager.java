import java.util.Scanner;
import java.util.function.Consumer;

public class PartyManager {
    private final Party[] parties;
    private final Scanner scanner;
    private final Consumer<String> output;

    public PartyManager(int partyCount, Consumer<String> output) {
        this.parties = new Party[partyCount];
        for (int i = 0; i < parties.length; i++) {
            parties[i] = Party.createStandardParty();
        }
        this.scanner = new Scanner(System.in);
        this.output = output;
    }

    public void run() {
        while (true) {
            printMenu();
            try {
                int choice = readInt("Choose an option: ");
                switch (choice) {
                    case 0 -> { return; }
                    case 1 -> createCharacter();
                    case 2 -> viewParty();
                    default -> output.accept("Invalid option");
                }
            } catch (Exception e) {
                output.accept("Error: " + e.getMessage());
            }
        }
    }

    private void createCharacter() {
        output.accept("Creating new character:");
        Character character = Character.builder()
            .name(readString("Name: ", this::validateName))
            .role(readRole())
            .build();

        int partyIndex = readInt("Party index (0-" + (parties.length-1) + "): ",
            index -> index >= 0 && index < parties.length);

        Result<Party, String> result = parties[partyIndex].addCharacter(character);
        if (result.isSuccess()) {
            parties[partyIndex] = ((Result.Success<Party, String>) result).value();
            output.accept("Character added successfully!");
        } else {
            output.accept(((Result.Failure<Party, String>) result).error());
        }
    }

    private String readString(String prompt, Validator<String> validator) {
        while (true) {
            output.accept(prompt);
            try {
                String input = scanner.nextLine();
                validator.validate(input);
                return input;
            } catch (Exception e) {
                output.accept("Invalid input: " + e.getMessage());
            }
        }
    }

    private Role readRole() {
        return readString("Role (DAMAGE/TANK/HEALER): ", input -> {
            try {
                Role.fromString(input);
            } catch (IllegalArgumentException e) {
                throw new ValidationException(e.getMessage());
            }
        }).transform(Role::fromString);
    }

    private int readInt(String prompt, Validator<Integer> validator) {
        return readString(prompt, input -> {
            try {
                int value = Integer.parseInt(input);
                validator.validate(value);
            } catch (NumberFormatException e) {
                throw new ValidationException("Please enter a number");
            }
        }).transform(Integer::parseInt);
    }

    private int readInt(String prompt) {
        return readInt(prompt, value -> {});
    }

    private void viewParty() {
        int index = readInt("View party (0-" + (parties.length-1) + "): ",
            i -> i >= 0 && i < parties.length);
        output.accept("\n=== Party " + index + " ===\n" + parties[index]);
    }

    private void printMenu() {
        output.accept("\n=== Party Manager ===");
        output.accept("0. Exit");
        output.accept("1. Create character");
        output.accept("2. View party");
    }

    private void validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new ValidationException("Name cannot be empty");
        }
        if (name.length() > 20) {
            throw new ValidationException("Name cannot exceed 20 characters");
        }
    }

    @FunctionalInterface
    private interface Validator<T> {
        void validate(T value) throws ValidationException;
    }

    private static class ValidationException extends RuntimeException {
        public ValidationException(String message) {
            super(message);
        }
    }
}