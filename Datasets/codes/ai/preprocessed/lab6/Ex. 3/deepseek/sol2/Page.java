public class Page extends Profile {
    private int likeCount;

    public Page(String name) {
        super(name);
        this.likeCount = 0;
    }

    public void like() {
        likeCount++;
    }

    public int getLikeCount() {
        return likeCount;
    }

    @Override
    public boolean canViewTimeline(Profile viewer) {
        // Anyone can view a page's timeline
        return true;
    }

    @Override
    public String toString() {
        return "Page: " + super.toString() + " (Likes: " + likeCount + ")";
    }
}