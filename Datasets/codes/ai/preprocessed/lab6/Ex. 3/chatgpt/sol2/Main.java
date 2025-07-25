public class Main {
    public static void main(String[] args) {
        User alice = new User("U1", "Alice");
        User bob = new User("U2", "Bob");
        Page techPage = new Page("P1", "Tech News");

        alice.addFriend(bob);

        System.out.println("\n🔹 Alice posts a new status:");
        alice.addPost("Hello world! This is my first post.");

        System.out.println("\n🔹 Bob posts an update:");
        bob.addPost("Excited for my new job!");

        System.out.println("\n🔹 Tech News posts a public update:");
        techPage.addPost("Breaking: New AI technology released!");

        System.out.println("\n🔹 Alice checks Bob's timeline:");
        bob.showTimeline(alice);

        System.out.println("\n🔹 Tech News Page Timeline:");
        techPage.showTimeline(alice);
    }
}