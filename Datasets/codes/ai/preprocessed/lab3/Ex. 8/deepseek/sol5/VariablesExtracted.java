public class VariablesExtracted {

    private static final double MINIMUM_ZOOM_LEVEL = 1.5;
    private static final String TARGET_PLATFORM = "MAC";
    private static final String TARGET_BROWSER = "Safari";

    public static void main(String[] args) {
        String operatingSystem = "macOS Sierra";
        String webBrowser = "Safari";
        double currentZoomLevel = 1.5;

        boolean isTargetPlatform = isTargetPlatform(operatingSystem);
        boolean isTargetBrowser = isTargetBrowser(webBrowser);
        boolean hasMinimumZoom = hasMinimumZoom(currentZoomLevel);

        if (shouldExecuteFeature(isTargetPlatform, isTargetBrowser, hasMinimumZoom)) {
            executeFeature();
        }
    }

    private static boolean isTargetPlatform(String platform) {
        return platform.toUpperCase().contains(TARGET_PLATFORM);
    }

    private static boolean isTargetBrowser(String browser) {
        return TARGET_BROWSER.equals(browser);
    }

    private static boolean hasMinimumZoom(double zoomLevel) {
        return zoomLevel >= MINIMUM_ZOOM_LEVEL;
    }

    private static boolean shouldExecuteFeature(boolean platformMatch,
                                            boolean browserMatch,
                                            boolean zoomMatch) {
        return platformMatch && browserMatch && zoomMatch;
    }

    private static void executeFeature() {
        System.out.println("Executing feature for supported platform/browser with sufficient zoom");
        // Actual feature implementation would go here
    }
}