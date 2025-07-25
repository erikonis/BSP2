public class VariablesExtracted {
    public static void main(String[] args) {
        String platform = "macOS Sierra";
        String browser = "Safari";
        double zoomLevel = 1.5;

        boolean isMac = platform.toUpperCase().contains("MAC");
        boolean isSafari = browser.equals("Safari");
        boolean zoomOk = zoomLevel >= 1.5;

        if (isMac && isSafari && zoomOk) {
            System.out.println("Condition met!");
        }
    }
}
