package exercise3;

public class Page extends Profile implements PrivacyControl {
    private int likeCounter;

    public Page(String name) {
        super(name);
        this.likeCounter = 0;
    }

    public int getLikeCounter() {
        return likeCounter;
    }

    public void like() {
        likeCounter++;
    }

    @Override
    public void showTimeline(Profile observer) {
        System.out.println("Timeline of " + getName() + ":");
        for (Post post : getPosts()) {
            System.out.println(post);
        }
    }
}