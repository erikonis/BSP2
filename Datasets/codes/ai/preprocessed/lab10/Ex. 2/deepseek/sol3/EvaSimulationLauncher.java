public class EvaSimulationLauncher {
    public static void main(String[] args) {
        // Setup
        EventStore eventStore = new InMemoryEventStore();
        EvaCommandHandler commandHandler = new EvaCommandHandler(eventStore);
        EvaQueryService queryService = new EvaQueryService(eventStore);

        // Create Unit-01 with Shinji
        commandHandler.handle(new CreateUnitCommand(
            "unit-01", 1, "Shinji Ikari", PilotType.HUMAN, 80
        ));

        // Activate Unit
        commandHandler.handle(new ActivateUnitCommand("unit-01"));

        // Check activation status
        if (queryService.isUnitActive("unit-01")) {
            // Perform maneuver against Angel
            commandHandler.handle(new ManeuverCommand("unit-01", ObstacleType.ANGEL));
        }

        // Print pilot sanity
        System.out.println("Shinji's sanity: " +
            queryService.getPilotSanity("unit-01"));
    }
}