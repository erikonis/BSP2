public class VariablesExtracted {

    public static void main(String[] args) {
        String platform = "macOS Sierra";
        String browser = "Safari";
        double zoomLevel = 1.5;

        // Extracted variables for each condition
        boolean isMac = platform.toUpperCase().indexOf("MAC") > -1;
        boolean isSafari = browser.equals("Safari");
        boolean isZoomSufficient = zoomLevel >= 1.5;

        if (isMac && isSafari && isZoomSufficient) {
            // do something ...
            System.out.println("Conditions met!");
        }
    }
}