package exercise3;

public class Page extends Profile {
    private int likes;

    public Page(int id, String name) {
        super(id, name);
        this.likes = 0;
    }

    public void addLike() {
        likes++;
    }

    @Override
    public void showTimeline(Profile viewer) {
        displayPosts(viewer);
        System.out.println("Likes: " + likes);
    }
}