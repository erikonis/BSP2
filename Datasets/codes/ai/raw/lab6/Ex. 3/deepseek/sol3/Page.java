package exercise3;

public class Page extends Profile {
    private int likeCounter;

    public Page(String id, String name) {
        super(id, name, new PublicTimelineStrategy());
        this.likeCounter = 0;
    }

    public void like() {
        likeCounter++;
    }

    public int getLikeCounter() {
        return likeCounter;
    }
}