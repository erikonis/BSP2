public class FacebookApp {
    public static void main(String[] args) {
        User user1 = new User("U1", "Alice");
        User user2 = new User("U2", "Bob");
        Page page = new Page("P1", "Tech News");

        user1.addFriend(user2);

        user1.addPost(new Post("Hello, world!"));
        user2.addPost(new Post("Having a great day!"));
        page.addPost(new Post("New tech update!"));

        user1.showTimeline(user2); // Can view timeline
        user2.showTimeline(user1); // Can view timeline
        page.showTimeline(user1);  // Can view timeline

        page.like();
        System.out.println("Page likes: " + page.getLikeCounter());
    }
}