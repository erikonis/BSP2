package Exercise1simple;

public class Robot {
    private String name;
    protected int bLife = 3000, posx = 0, posy = 4, actions;

    public Robot(String name) {
        this.name = name;
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }

    public String getName() {
        return name;
    }

    public int getbLife() {
        return bLife;
    }

}
