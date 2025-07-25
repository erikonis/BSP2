public class Main {
    public static void main(String[] args) {
        // Create users and pages
        User user1 = new User("1", "Alice");
        User user2 = new User("2", "Bob");
        User user3 = new User("3", "Charlie");

        Page page1 = new Page("101", "Tech Page");
        Page page2 = new Page("102", "Travel Page");

        // Create posts
        Post post1 = new Post("Alice's first post!");
        Post post2 = new Post("Bob's first post!");
        Post post3 = new Post("Tech Page is live!");
        Post post4 = new Post("Travel Page is exploring new destinations!");

        // Add posts to profiles
        user1.addPost(post1);
        user2.addPost(post2);
        page1.addPost(post3);
        page2.addPost(post4);

        // Add friends
        user1.addFriend(user2);
        user2.addFriend(user1);

        // Users viewing timelines
        System.out.println("\n--- Alice's Timeline ---");
        user1.showTimeline(user2);  // Bob is a friend of Alice

        System.out.println("\n--- Bob's Timeline ---");
        user2.showTimeline(user1);  // Alice is a friend of Bob

        System.out.println("\n--- Page 1 Timeline ---");
        page1.showTimeline(user1);  // Pages are public, can be viewed by anyone

        // Liking a page
        System.out.println("\n--- Liking Pages ---");
        page1.likePage();
        page2.likePage();
    }
}
