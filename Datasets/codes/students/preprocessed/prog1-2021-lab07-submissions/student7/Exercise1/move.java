public class move extends action {
    private int direction;

    public move(int directionToMove) {
        super(10); 
        this.direction = directionToMove;
    }

    public void display() {
        System.out.println("(forward :");
        switch (direction) {
        case 0:
            System.out.println("Up");
            break;
        case 1:
            System.out.println("Down");

            break;
        case 2:
            System.out.println("Left");
            break;
        case 3:
            System.out.println("Right");
            break;

        default:
            System.out.println("Unknown");
            break;
        }
        super.display();
    }
}