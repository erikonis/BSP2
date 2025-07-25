public class Test {
    public static void main(String[] args) {
        // Create users
        User alice = new User("Alice");
        User bob = new User("Bob");
        User charlie = new User("Charlie");

        // Create a page
        Page techNews = new Page("Tech News");

        // Alice and Bob become friends
        alice.addFriend(bob);

        // Create posts
        alice.createPost("Just had a great lunch!");
        bob.createPost("Working on a new project.");
        charlie.createPost("Nobody can see this post unless we're friends.");
        techNews.createPost("New smartphone released today!");
        techNews.createPost("Tech conference next week!");

        // Like the page
        techNews.like();
        techNews.like();

        // Test timeline viewing
        System.out.println("=== Alice viewing her own timeline ===");
        alice.showTimeline(alice);

        System.out.println("\n=== Alice viewing Bob's timeline ===");
        bob.showTimeline(alice);

        System.out.println("\n=== Alice viewing Charlie's timeline ===");
        charlie.showTimeline(alice);

        System.out.println("\n=== Alice viewing Tech News timeline ===");
        techNews.showTimeline(alice);

        System.out.println("\n=== Tech News viewing Alice's timeline ===");
        alice.showTimeline(techNews);
    }
}