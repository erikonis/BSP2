package lu.uni.programming1.lab6.exercise3;

public class Launcher {
    public static void main(String[] args) {
        
        //Creating instances of users
        User Tom = new User("Tom");
        User Mark = new User("Mark");
        User Lisa = new User("lisa");

        //Creating instance of page
        Page FacebookNewsletter = new Page("Facebook Newsletter");

        //Test of methods
        Tom.createPost("Hi, I really like Facebook!");
        Tom.createPost("Today, I ate bread! It was really tasty!");

        FacebookNewsletter.createPost("We are changing our name!");
        
        Tom.addFriend(Lisa);
        System.out.println(Lisa.showTo(Tom));
        System.out.println(Tom.showTo(Lisa));
        System.out.println(Tom.showTo(Mark));
        System.out.println(Lisa.showTo(Mark));

        FacebookNewsletter.getLiked(Mark);
        FacebookNewsletter.getLiked(Mark);
        System.out.println("The page currently has " + FacebookNewsletter.getLikes() + " like(s).");
        System.out.println(FacebookNewsletter.showTimeline());
    }
}
