public class VariablesExtracted {

    public static void main(String[] args) {
        String osName = "macOS Sierra";
        String webEngine = "Safari";
        double pageScale = 1.5;

        boolean onMac = osName.toUpperCase().contains("MAC");
        boolean usingSafari = webEngine.equals("Safari");
        boolean zoomAtLeastOnePointFive = pageScale >= 1.5;

        if (onMac && usingSafari && zoomAtLeastOnePointFive) {
            // do something ...
            System.out.println("Target environment configuration detected.");
        } else {
            System.out.println("Current environment does not match target configuration.");
        }
    }
}