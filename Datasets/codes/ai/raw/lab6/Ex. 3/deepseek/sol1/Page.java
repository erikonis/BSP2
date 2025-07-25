package exercise3;

public class Page extends Profile {
    private int likeCounter;

    public Page(String id, String name) {
        super(id, name);
        this.likeCounter = 0;
    }

    public void like() {
        likeCounter++;
    }

    @Override
    public void showTimeline(Profile observer) {
        System.out.println("Timeline for " + getName() + ":");
        for (Post post : getPosts()) {
            System.out.println(post);
        }
    }

    public int getLikeCounter() {
        return likeCounter;
    }
}