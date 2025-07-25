public class VariablesExtracted {

    public static void main(String[] args) {
        String platform = "macOS Sierra";
        String browser = "Safari";
        double zoomLevel = 1.5;

        String upperCasePlatform = platform.toUpperCase();
        boolean isMacPlatform = upperCasePlatform.indexOf("MAC") > -1;
        boolean isSafariBrowser = browser.equals("Safari");
        boolean isZoomLevelHighEnough = zoomLevel >= 1.5;

        if (isMacPlatform && isSafariBrowser && isZoomLevelHighEnough) {
            // do something ...
            System.out.println("Condition met!"); // Added a placeholder action
        } else {
            System.out.println("Condition not met."); // Added a placeholder action
        }
    }
}