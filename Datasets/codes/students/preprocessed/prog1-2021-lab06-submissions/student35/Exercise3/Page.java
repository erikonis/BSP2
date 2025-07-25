public class Page extends Profile {

    private int likeCounter = 0;

    public Page(String name) {
        super(name);
    }

    public int getLikeCounter() {
        return this.likeCounter;
    }

    public void like(User by) {
        this.likeCounter++;
        this.createPost(by + " likes " + this);
    }
}