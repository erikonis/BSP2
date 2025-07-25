public class FacebookSimulation {
    public static void main(String[] args) {
        RegularUser user1 = new RegularUser("1", "Alice");
        RegularUser user2 = new RegularUser("2", "Bob");
        Page page1 = new Page("3", "Tech News");

        user1.addPost("Hello, this is Alice!");
        user2.addPost("Hi, I'm Bob!");
        page1.addPost("Latest tech news!");

        user1.addFriend(user2);

        System.out.println("User1's timeline viewed by User2:");
        user1.showTimeline(user2);

        System.out.println("User2's timeline viewed by User1:");
        user2.showTimeline(user1);

        System.out.println("Page1's timeline viewed by User1:");
        page1.showTimeline(user1);

        System.out.println("Page1's timeline viewed by User2:");
        page1.showTimeline(user2);

        page1.likePage();
        System.out.println("Page1's like count: " + page1.likeCounter);
    }
}
