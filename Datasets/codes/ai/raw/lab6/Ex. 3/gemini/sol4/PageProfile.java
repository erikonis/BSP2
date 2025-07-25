// PageProfile.java
public class PageProfile extends Profile {
    private int likeCount;

    public PageProfile(String id, String name) {
        super(id, name);
        this.likeCount = 0;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void likePage() {
        this.likeCount++;
        System.out.println(getName() + " now has " + likeCount + " likes.");
    }

    @Override
    public void showTimeline(Profile viewer) {
        System.out.println("--- " + getName() + "'s Timeline ---");
        for (Post post : getPosts()) {
            System.out.println(post);
        }
    }
}