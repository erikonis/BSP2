public class Pavilion {
    
    private static String name;

    private static double price;

    public Pavilion(String name, double price){
        Pavilion.name=name;
        Pavilion.price=price;

    }
    public static String getname(){
        return name;

    }
    public static double getprice(){
        return price;

    }
}
