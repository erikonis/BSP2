package exercise3;

public class Page extends Profile {
    private int likes;

    public Page(String id, String name) {
        super(id, name);
        this.likes = 0;
    }

    public void likePage() {
        likes++;
        System.out.println(name + " now has " + likes + " likes!");
    }

    @Override
    public void showTimeline(Profile observer) {
        System.out.println(name + "'s Timeline (Public Page):");
        for (Post post : timeline) {
            System.out.println(post);
        }
    }
}
