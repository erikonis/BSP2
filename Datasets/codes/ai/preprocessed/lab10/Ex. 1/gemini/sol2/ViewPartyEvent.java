public class ViewPartyEvent implements Event {
    private int partyIndex;

    public ViewPartyEvent(int partyIndex) {
        this.partyIndex = partyIndex;
    }

    public int getPartyIndex() {
        return partyIndex;
    }
}