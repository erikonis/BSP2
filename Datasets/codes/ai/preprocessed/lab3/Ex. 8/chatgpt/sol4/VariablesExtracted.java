public class VariablesExtracted {

    public static void main(String[] args) {
        String platform = "macOS Sierra";
        String browser = "Safari";
        double zoomLevel = 1.5;

        String upperPlatform = platform.toUpperCase();
        boolean isMacOS = upperPlatform.contains("MAC");

        boolean isSafariBrowser = browser.equals("Safari");

        boolean isSufficientZoom = zoomLevel >= 1.5;

        if (isMacOS && isSafariBrowser && isSufficientZoom) {
            System.out.println("All conditions met. Performing the action.");
        }
    }
}