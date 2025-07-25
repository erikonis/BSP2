package lu.uni.programming1.lab6.Exercise1;

class Pavilion {
    private static String name;
    private static double price;

    Pavilion(String name, double price) {
        this.setName(name);
        this.setPrice(price);
    }

    public static double getPrice() {// getter
        return price;
    }

    public void setPrice(double price) {// setter
        this.price = price;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}