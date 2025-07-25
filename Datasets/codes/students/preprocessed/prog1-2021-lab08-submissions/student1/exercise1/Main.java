
public class Main {
    public static void main(String[] args) {
        //orders of today
        Shipping[] aPackage = new Shipping[4];

        aPackage[0]= new Shipping("Robert", "Dupont", "12, Avenue de la liberté", "PC gaming", Country.FRANCE, ShippingMethod.EXPRESS);
        aPackage[1]= new Shipping("Kristina", "Kun", "Meininger Strasse 37, 66520", "PC gaming", Country.GERMANY, ShippingMethod.CLASSIC);
        aPackage[2]= new Shipping("Guust", "Bliekendaal", "Rue des Honnelles 31, 3476, West Flanders", "PC gaming", Country.BELGIUM, ShippingMethod.PRIORITY);
        aPackage[3]= new Shipping("Marta", "Costa", "5, Rue Mathias Birthon, 4653, Luxembourg", "PC gaming", Country.LUXEMBOURG, ShippingMethod.NORUSH);
        aPackage[0].setReady(true);
        aPackage[2].setReady(true);
        

        for (Shipping s : aPackage) {
            if(s.getReady())
                System.out.println(s);
        }




    }
    
}
