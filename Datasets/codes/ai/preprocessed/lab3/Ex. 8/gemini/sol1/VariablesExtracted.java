public class VariablesExtracted {
    public static void main(Stringargs) {
        String platform = " macOS Sierra ";
        String browser = " Safari ";
        double zoomLevel = 1.5;

        boolean isMac = platform.toUpperCase().indexOf("MAC") > -1;
        boolean isSafari = browser.equals(" Safari ");
        boolean isZoomLevelSufficient = zoomLevel >= 1.5;

        if (isMac && isSafari && isZoomLevelSufficient) {
            // Simulated actions based on the condition being true.
            System.out.println("User is on a Mac with Safari and sufficient zoom.");
            performSpecificAction();
        } else {
            System.out.println("User does not meet the criteria.");
        }
    }

    // Example method to show what happens when the condition is met.
    private static void performSpecificAction() {
        System.out.println("Performing specific action for Mac/Safari/Zoom user...");
        // Add specific functionality here.
        System.out.println("Action completed.");
    }
}