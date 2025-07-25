public class CharacterCreationHandler implements EventHandler<CreateCharacterEvent> {
    @Override
    public void handle(CreateCharacterEvent event) {
        try {
            CharacterRole role = CharacterRole.fromString(event.getRole());
            Character character = new Character(event.getName(), role);
            // In a real system, you might store this character somewhere
            System.out.println("Character created: " + character);
            // We don't directly add to a party here; that's a separate event
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating character: " + e.getMessage());
        }
    }
}