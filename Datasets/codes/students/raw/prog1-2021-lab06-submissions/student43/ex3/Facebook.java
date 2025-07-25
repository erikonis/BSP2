package lu.uni.programming1.lab6.ex3;

public class Facebook {

    public static void main(String[] args) {

        User steffen = new User("Steffen");
        User denis = new User("Denis");

        steffen.createPost("In the Programming 1 lecture #placetobe");
        steffen.showTimeline(denis);
        denis.addFriend(steffen, true);
        steffen.showTimeline(denis);

        Page uni = new Page("Uni.lu");
        uni.createPost("Moving to Belval ...");
        uni.like(denis);
        uni.like(steffen);
        uni.showTimeline(denis);
        System.out.println(
                String.format("%s has %d like%s", uni, uni.getLikeCounter(), uni.getLikeCounter() != 1 ? "s" : ""));
    }
}