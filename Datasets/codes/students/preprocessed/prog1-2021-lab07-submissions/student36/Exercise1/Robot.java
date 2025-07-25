public class Robot {

    private int battery;

    public Robot() {
        battery = 3000;
    }

    public void executeInstructions(action[] whatToDo) {
        for (int i = 0; i < whatToDo.length; i++) {
            whatToDo[i].display();
            battery -= whatToDo[i].getTime(); // Decresing the battery time

        }
        System.out.println("We executed " + whatToDo.length + " actions");
        System.out.println("Remaining battery time is : " + battery);
    }
}