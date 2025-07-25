public class EvaQueryService {
    private final EventStore eventStore;

    public EvaQueryService(EventStore eventStore) {
        this.eventStore = eventStore;
    }

    public boolean isUnitActive(String unitId) {
        return eventStore.getCurrentState(unitId).isActive();
    }

    public List<Obstacle> getEncounteredObstacles(String unitId) {
        return eventStore.getCurrentState(unitId).encounteredObstacles();
    }

    public int getPilotSanity(String unitId) {
        return eventStore.getCurrentState(unitId).pilot().getSanity();
    }
}