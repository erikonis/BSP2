public class Page extends Profile {

    private long likes;

    public Page(String name) {
        super(name);
        this.likes = 0;
    }

    public void getLiked(User user) {
        //user cannot like multiple times
        boolean liked = user.getLikedPages().contains(this);
        if (!liked) {
            likes += 1;
            user.addLiked(this);
        }
    }

    public String showTimeline() {
        return super.showPosts();
    }

    public long getLikes() {
        return likes;
    }
    
}
