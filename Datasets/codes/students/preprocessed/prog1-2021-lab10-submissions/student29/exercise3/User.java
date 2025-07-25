public class User {
    String username;
    OS os;

    User(String username, OS os){
        this.username = username;
        this.os = os;
    }

    public void Print(){
        System.out.println("connected with " + username);
    }
}
