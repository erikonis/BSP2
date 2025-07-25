public class card {
    private String name;
    private int id;
    private int points;
    public card(String name, int id, int points){
        this.name = name;
        this.id = id;
        this.points = points;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getPoints() {
        return points;
    }
}
