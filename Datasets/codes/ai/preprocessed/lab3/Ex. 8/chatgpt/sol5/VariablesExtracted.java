public class VariablesExtracted {

    public static void main(String[] args) {
        String platform = "macOS Sierra";
        String browser = "Safari";
        double zoomLevel = 1.5;

        boolean isMacSystem = platform.toUpperCase().contains("MAC");
        boolean isSafari = "Safari".equals(browser);
        boolean isZoomAcceptable = zoomLevel >= 1.5;

        if (isMacSystem && isSafari && isZoomAcceptable) {
            System.out.println("Conditions matched: Proceeding with the operation.");
        }
    }
}