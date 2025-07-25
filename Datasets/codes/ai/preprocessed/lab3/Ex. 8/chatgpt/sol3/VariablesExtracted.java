public class VariablesExtracted {

    public static void main(String[] args) {
        String currentPlatform = "macOS Sierra";
        String currentBrowser = "Safari";
        double currentZoom = 1.5;

        // Alternative variable naming and style
        boolean platformIsMac = currentPlatform.toUpperCase().contains("MAC");
        boolean browserIsSafari = "Safari".equals(currentBrowser);
        boolean zoomIsAtLeastDefault = currentZoom >= 1.5;

        if (platformIsMac && browserIsSafari && zoomIsAtLeastDefault) {
            System.out.println("Conditions matched. Executing operation...");
        }
    }
}