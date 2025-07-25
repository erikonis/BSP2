public class VariablesExtracted {

    public static void main(String[] args) {
        String platform = "macOS Sierra";
        String browser = "Safari";
        double zoomLevel = 1.5;

        // Extracted variables for clarity and maintainability
        boolean isMacPlatform = platform.toUpperCase().indexOf("MAC") > -1;
        boolean isSafariBrowser = browser.equals("Safari");
        boolean isZoomSufficient = zoomLevel >= 1.5;

        if (isMacPlatform && isSafariBrowser && isZoomSufficient) {
            // do something ...
            System.out.println("All conditions met. Proceeding...");
        }
    }
}