public class takePic extends action {
    private boolean highResolution;

    public takePic(boolean highResolution) {
        super(highResolution ? 60 : 40); 
        this.highResolution = highResolution;
    }

    public void display() {
        System.out.println("We took a picture :");
        if (highResolution) {
            System.out.println("high Resolution");
        } else {
            System.out.println("Low resolution");
        }
        super.display();
    }
}