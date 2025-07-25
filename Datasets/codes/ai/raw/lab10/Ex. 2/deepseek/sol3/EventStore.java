public interface EventStore {
    void publish(EvaEvent event);
    List<EvaEvent> getEvents(String unitId);
    EvaState getCurrentState(String unitId);
}