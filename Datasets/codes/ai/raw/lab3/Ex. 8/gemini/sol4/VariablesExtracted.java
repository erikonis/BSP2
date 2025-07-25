public class VariablesExtracted {

    public static void main(String[] args) {
        String operatingSystem = "macOS Sierra";
        String webBrowser = "Safari";
        double pageZoom = 1.5;

        boolean isMac = operatingSystem.toUpperCase().contains("MAC");
        boolean isSafari = webBrowser.equals("Safari");
        boolean zoomIsSufficient = pageZoom >= 1.5;

        if (isMac && isSafari && zoomIsSufficient) {
            // do something ...
            System.out.println("User environment matches the criteria.");
        } else {
            System.out.println("User environment does not match all criteria.");
        }
    }
}