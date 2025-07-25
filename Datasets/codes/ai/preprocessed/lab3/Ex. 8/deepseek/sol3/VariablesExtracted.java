public class VariablesExtracted {

    public static void main(String[] args) {
        // Constants for configuration values
        final String TARGET_PLATFORM = "MAC";
        final String TARGET_BROWSER = "Safari";
        final double MIN_ZOOM_LEVEL = 1.5;

        // User configuration
        String platform = "macOS Sierra";
        String browser = "Safari";
        double zoomLevel = 1.5;

        // Extracted validation methods
        boolean isCorrectPlatform = isTargetPlatform(platform, TARGET_PLATFORM);
        boolean isCorrectBrowser = isTargetBrowser(browser, TARGET_BROWSER);
        boolean hasMinimumZoom = hasSufficientZoom(zoomLevel, MIN_ZOOM_LEVEL);

        if (isCorrectPlatform && isCorrectBrowser && hasMinimumZoom) {
            executeBrowserAction();
        }
    }

    private static boolean isTargetPlatform(String platform, String target) {
        return platform.toUpperCase().contains(target);
    }

    private static boolean isTargetBrowser(String browser, String target) {
        return target.equals(browser);
    }

    private static boolean hasSufficientZoom(double currentZoom, double minZoom) {
        return currentZoom >= minZoom;
    }

    private static void executeBrowserAction() {
        System.out.println("All conditions met - executing browser action");
        // Additional business logic here
    }
}