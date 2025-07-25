public class VariablesExtracted {
    public static void main(String[] args) {
        String platform = "macOS Sierra";
        String browser = "Safari";
        double zoomLevel = 1.5;

        boolean isMac = platform.toUpperCase().indexOf("MAC") > -1;
        boolean isSafari = browser.equals("Safari");
        boolean isZoomed = zoomLevel >= 1.5;

        if (isMac && isSafari && isZoomed) {
            System.out.println("Do something...");
        }
    }
}