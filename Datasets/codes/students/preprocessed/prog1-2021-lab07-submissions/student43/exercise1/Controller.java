public class Controller extends CommandList{

    private Robot test;
    private int actions;
    private int[] list;

    public Controller(Robot test) {
        this.list = new int[10];
        this.actions = 0;
        this.test = test;

    }

    public void MoveLeft() {
        if (actions < 10) {
            list[actions] = 1;
            actions++;
            
        }
        else { System.out.println("No more actions left !");}
    }
    public void MoveRight() {
        if (actions < 10) {
            list[actions] = 2;
            actions++;
            
        }
        else { System.out.println("No more actions left !");}
    }
    public void MoveUp() {
        if (actions < 10) {
            list[actions] = 3;
            actions++;
            
        }
        else { System.out.println("No more actions left !");}
    }
    public void MoveDown() {
        if (actions < 10) {
            list[actions] = 4;
            actions++;
            
        }
        else { System.out.println("No more actions left !");}
    }
    
    public void PickRock() {
        if (actions < 10) {
            list[actions] = 5;
            actions++;
            
        }
        else { System.out.println("No more actions left !");}
    }
    
    public void PhotoHigh() {
        if (actions < 10) {
            list[actions] = 6;
            actions++;
            
        }
        else { System.out.println("No more actions left !");}
    }
    public void PhotoLow() {
        if (actions < 10) {
            list[actions] = 7;
            actions++;
            
        }
        else { System.out.println("No more actions left !");}
    }

    public void Reset() {
        actions = 0;
        list = new int [10];
    }

    public void SendToRobot() {
        for (int i = 0 ; i<10 ; i++) {
            switch (list[i]) {
                case 1 : test.MoveLeft(); 
                break;
                case 2 : test.MoveRight(); 
                break;
                case 3 : test.MoveUp(); 
                break;
                case 4 : test.MoveDown(); 
                break;
                case 5 : test.PickRock(); 
                break;
                case 6 : test.PhotoHigh(); 
                break;
                case 7 : test.PhotoLow(); 
                break;
                default : 
                break;
            }
        }
        System.out.println(test.GetBattery() + " seconds of battery left !");
    }
    
}
