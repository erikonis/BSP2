public class VariablesExtracted {

    public static void main(String[] args) {
        String platform = "macOS Sierra";
        String browser = "Safari";
        double zoomLevel = 1.5;

        boolean isPlatformMac = platform.toUpperCase().contains("MAC");
        boolean isCorrectBrowser = browser.equals("Safari");
        boolean isZoomSufficient = zoomLevel >= 1.5;

        if (isPlatformMac && isCorrectBrowser && isZoomSufficient) {
            // do something ...
            System.out.println("All conditions are true.");
        } else {
            System.out.println("At least one condition is false.");
        }
    }
}