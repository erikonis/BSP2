package lu.uni.programming1.lab3.exercise8;

public class VariableExtracted {

public static void main(String[] args) {
    String platform = "macOS Sierra";
    String browser = "Safari";
    double zoomLevel = 1.5;

    boolean mac = platform.toUpperCase().indexOf("MAC") > -1;
    boolean safari = browser.equals("Safari");
    boolean zlevel = zoomLevel >= 1.5;
    if (mac && safari && zlevel) {
        // do something ...
     }
    }
}