public class VariablesExtracted {

    public static void main(String[] args) {
        String platform = "macOS Sierra";
        String browser = "Safari";
        double zoomLevel = 1.5;

        // Extracting variables
        boolean isMacPlatform = platform.toUpperCase().indexOf("MAC") > -1;
        boolean isSafariBrowser = browser.equals("Safari");
        boolean isZoomLevelHighEnough = zoomLevel >= 1.5;

        if (isMacPlatform && isSafariBrowser && isZoomLevelHighEnough) {
            // do something ...
        }
    }
}