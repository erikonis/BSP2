package lu.uni.programming1.lab7.exercise1;

public class Main {
    public static void main(String[] args) {
        Prototype prototype = new Prototype("v1 mars");
        Controller controller = new Controller(prototype);

        Actions[] act ={
            //Actions.forward(),
            //Actions.left(),
            //Actions.left(),
            //Actions.left(),
            //Actions.forward(),
            //Actions.pick(),
            //Actions.forward(),
            //Actions.forward(),
            //Actions.HDpicture(),
            //Actions.right(),
            //Actions.right(),
            //Actions.forward(),
            //Actions.left(),
            //Actions.forward(),
        };
        controller.execute(act); 
    }
    
}
