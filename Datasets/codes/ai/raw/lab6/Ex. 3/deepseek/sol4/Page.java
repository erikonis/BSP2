public class Page extends Profile {
    private int likes;
    
    public Page(String name) {
        super(name);
    }
    
    public void like() {
        likes++;
    }
    
    @Override
    public boolean canView(Profile requester) {
        return true; // Pages are public
    }
    
    @Override
    public void showPosts(Profile viewer) {
        super.showPosts(viewer);
        System.out.println(likes + " likes");
    }
}