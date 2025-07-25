public class Test{
    public static void main(String[] args) {
        Airport airport1= new Airport("Luxembourg", "Luxembourg", "LUX");
        Airport airport2= new Airport("Sarajevo", "Bosnia and Herzegovina", "BIH");

        Person pilot1= new Pilot("LuxPlane", "Max Meier", "654768908");
        Person pilot2= new Pilot("Etihad", "Lara Laura", "465789090");
        

        System.out.println("\n");
        System.out.println("_____________________________");
        System.out.println("Ticket:");
        System.out.println(airport1.toString());
        System.out.println(pilot1.toString());
        System.out.println("_____________________________");
        System.out.println("\n");
    
    }
}
