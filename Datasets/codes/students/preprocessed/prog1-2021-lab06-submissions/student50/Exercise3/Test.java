public class Test {
    public static void main(String[] args) {
        User u1= new User("Sara Vatavu");
        User u2= new User("Caps");
        User u3= new User("REkkles");
        Page p1= new Page("Morgana");

        u1.addFriend(u2); 
        u1.addFriend(u3);
      

        u1.addPost("I love playing League of Legends!!");
        u1.addPost("It's really fun :)");
       System.out.println(u2.viewTimeline(u1));

       u2.addPost("Support is op");
       System.out.println(u3.viewTimeline(u2));
       System.out.println(u1.viewTimeline(u2));

       p1.addPost("I am bound, but I will not break!");
       System.out.println(u1.viewTimeline(p1));


    }
}
