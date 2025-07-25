public class VariableExtracted {
    public static void main(String[] args) {
        String platform = "macOS Sierra";
		String browser = "Safari";
		double zoomLevel = 1.5;

		int indexOf = platform.toUpperCase().indexOf("MAC");
        boolean equals = browser.equals("Safari");
        boolean b = zoomLevel >= 1.5;
        
        if (indexOf > -1 && equals && b) {
			// do something ...
		}
    }
}
