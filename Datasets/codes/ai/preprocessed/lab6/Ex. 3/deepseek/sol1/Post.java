public class Post {
    private String content;

    public Post(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return content;
    }
}