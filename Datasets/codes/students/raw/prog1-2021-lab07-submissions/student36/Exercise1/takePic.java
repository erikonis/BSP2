package src.lu.uni.programming1.lab7.Exercise1;

public class takePic extends action {
    private boolean highResolution;

    public takePic(boolean highResolution) {
        super(highResolution ? 60 : 40); // Inline if statement
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