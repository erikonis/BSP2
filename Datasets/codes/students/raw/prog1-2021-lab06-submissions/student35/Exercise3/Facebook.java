package lu.uni.programming1.lab6.Exercise3;

public class Facebook {

    public static void main(String[] args) {

        User Eldar = new User("Eldar");
        User Mohammed = new User("Mohammed");

        Eldar.createPost("In the Programming 1 lecture #placetobe");
        Eldar.showTimeline(Mohammed);
        Mohammed.addFriend(Eldar, true);
        Eldar.showTimeline(Mohammed);

        Page uni = new Page("Uni.lu");
        uni.createPost("Moving to Belval ...");
        uni.like(Mohammed);
        uni.like(Eldar);
        uni.showTimeline(Mohammed);
        System.out.println(
                String.format("%s has %d like%s", uni, uni.getLikeCounter(), uni.getLikeCounter() != 1 ? "s" : ""));
    }
}