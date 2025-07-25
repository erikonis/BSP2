public class Robot {

    private int battery;

    public Robot() {
        battery = 3000;
    }

    public void executeInstructions(action[] whatToDo) {
        int countActions = 0;
        for (int i = 0; i < whatToDo.length; i++) {
            if (battery >= whatToDo[i].getTime()) { // sanity check for battery life
                countActions++; // Increment the number of actions
                whatToDo[i].display();
                battery -= whatToDo[i].getTime(); // Decresing the battery time
            } else {
                System.out.println("Out of battery power!! Could not execute this action");
            }
        }
        System.out.println("We executed " + countActions + " actions");
        System.out.println("Remaining battery time is : " + battery);
    }
}