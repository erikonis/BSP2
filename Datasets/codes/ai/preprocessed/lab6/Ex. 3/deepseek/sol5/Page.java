public class Page extends Profile {
    private int likeCount;

    public Page(String name) {
        super(name);
        this.likeCount = 0;
    }

    public void like() {
        likeCount++;
    }

    @Override
    public boolean canViewPosts(Profile viewer) {
        return true; // Pages are public
    }

    @Override
    public void displayPosts(Profile viewer) {
        super.displayPosts(viewer);
        System.out.println("Likes: " + likeCount);
    }
}