package exercise3;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Alice");
        User user2 = new User("Bob");
        Page page1 = new Page("Tech News");

        user1.addFriend(user2);

        Post post1 = new Post("Hello, world!");
        Post post2 = new Post("Learning Java!");
        Post post3 = new Post("Latest tech updates!");

        user1.addPost(post1);
        user2.addPost(post2);
        page1.addPost(post3);

        System.out.println("User1's timeline as seen by User2:");
        user1.showTimeline(user2);

        System.out.println("\nUser2's timeline as seen by User1:");
        user2.showTimeline(user1);

        System.out.println("\nPage1's timeline as seen by User1:");
        page1.showTimeline(user1);

        System.out.println("\nPage1's like counter before liking: " + page1.getLikeCounter());
        page1.like();
        System.out.println("Page1's like counter after liking: " + page1.getLikeCounter());
    }
}