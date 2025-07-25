public class PavilionWrapper {
    private Pavilion pavilion;

    public PavilionWrapper(Pavilion pavilion) {
        this.pavilion = pavilion;
    }

    public Pavilion getPavilion() {
        return pavilion;
    }

    @Override
    public String toString() {
        return pavilion.getName() + ": " + pavilion.getPrice() + " EUR";
    }
}