public class PartyManagementHandler implements EventHandler<AddCharacterToPartyEvent> {
    private Party[] parties;

    public PartyManagementHandler(Party[] parties) {
        this.parties = parties;
    }

    @Override
    public void handle(AddCharacterToPartyEvent event) {
        try {
            parties[event.getPartyIndex()].addCharacter(event.getCharacter());
            System.out.println("Character added to Party " + event.getPartyIndex() + " successfully.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Invalid party index. Please enter 0 or 1.");
        } catch (PartyFullException | InvalidPartyCompositionException | CharacterAlreadyInPartyException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}