public class ViewPartyHandler implements EventHandler<ViewPartyEvent> {
    private Party[] parties;

    public ViewPartyHandler(Party[] parties) {
        this.parties = parties;
    }

    @Override
    public void handle(ViewPartyEvent event) {
        try {
            System.out.println(parties[event.getPartyIndex()]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Invalid party index. Please enter 0 or 1.");
        }
    }
}