public class Page extends Profile {
    private int likeCounter;

    public Page(String id, String name) {
        super(id, name);
        this.likeCounter = 0;
    }

    public void likePage() {
        likeCounter++;
    }

    @Override
    public void showTimeline(Profile observer) {
        System.out.println("Timeline of " + name + ": " + posts);
    }
}
