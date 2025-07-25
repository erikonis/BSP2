public class Page extends Profile {
    private int likeCount;

    public Page(String id, String name) {
        super(id, name);
        this.likeCount = 0;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void likePage() {
        likeCount++;
        System.out.println(getName() + " has been liked! Current like count: " + likeCount);
    }

    @Override
    public void showTimeline(Profile viewer) {
        System.out.println("Page Timeline (Public):");
        for (Post post : getPosts()) {
            System.out.println(post);
        }
    }
}
