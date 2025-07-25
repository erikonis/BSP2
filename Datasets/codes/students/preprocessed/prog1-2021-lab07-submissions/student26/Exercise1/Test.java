import java.util.Scanner;

public class Test {



    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);










        Abstract.resetbool();
        Abstract.erase();

        Abstract.add(Alien.getAlienchar(), 8,1);
        Abstract.add(Rock.getRockChar(), 3,1);
        
        Abstract.add(PlusWall.getplus(), 0,0);
        Abstract.add(PlusWall.getplus(), 0,9);
        Abstract.add(PlusWall.getplus(), 9,0);
        Abstract.add(PlusWall.getplus(), 9,9);
        Abstract.add(PlusWall.getplus(), 2,2);
        Abstract.add(PlusWall.getplus(), 2,6);
        Abstract.add(PlusWall.getplus(), 7,2);

        Abstract.add(HWall.getH(), 0,1);
        Abstract.add(HWall.getH(), 0,2);
        Abstract.add(HWall.getH(), 0,3);
        Abstract.add(HWall.getH(), 0,4);
        Abstract.add(HWall.getH(), 0,6);
        Abstract.add(HWall.getH(), 0,7);
        Abstract.add(HWall.getH(), 0,8);

        Abstract.add(HWall.getH(), 2,3);
        Abstract.add(HWall.getH(), 2,4);
        Abstract.add(HWall.getH(), 2,5);

        Abstract.add(HWall.getH(), 5,3);
        Abstract.add(HWall.getH(), 5,4);
        Abstract.add(HWall.getH(), 5,7);
        Abstract.add(HWall.getH(), 5,8);

        Abstract.add(HWall.getH(), 7,3);

        Abstract.add(HWall.getH(), 9,1);
        Abstract.add(HWall.getH(), 9,2 );

        Abstract.add(HWall.getH(), 9,4);
        Abstract.add(HWall.getH(), 9,5);
        Abstract.add(HWall.getH(), 9,6);
        Abstract.add(HWall.getH(), 9,7);
        Abstract.add(HWall.getH(), 9,8);


        Abstract.add(VWall.getV(), 1,0);
        Abstract.add(VWall.getV(), 1,6);
        Abstract.add(VWall.getV(), 1,9);

        Abstract.add(VWall.getV(), 2,0);
        Abstract.add(VWall.getV(), 2,9);

        Abstract.add(VWall.getV(), 3,0);
        Abstract.add(VWall.getV(), 3,2);
        Abstract.add(VWall.getV(), 3,9);

        Abstract.add(VWall.getV(), 4,0);
        Abstract.add(VWall.getV(), 4,9);

        Abstract.add(VWall.getV(), 5,0);
        Abstract.add(VWall.getV(), 5,9);

        Abstract.add(VWall.getV(), 6,0);
        Abstract.add(VWall.getV(), 6,5);
        Abstract.add(VWall.getV(), 6,9);

        Abstract.add(VWall.getV(), 7,0);
        Abstract.add(VWall.getV(), 7,5);
        Abstract.add(VWall.getV(), 7,7);
        Abstract.add(VWall.getV(), 7,9);

        Abstract.add(VWall.getV(), 8,0);
        Abstract.add(VWall.getV(), 8,2);
        Abstract.add(VWall.getV(), 8,5);
        Abstract.add(VWall.getV(), 8,7);
        Abstract.add(VWall.getV(), 8,9);




    int choice = 0; char chooserobot=' ';

    System.out.println("Choose your robot (type 1, 2, or 3): ");
    System.out.println("1: §");
    System.out.println("2: ¥");
    System.out.println("3: π");
    choice = sc.nextInt();


    if (choice==1)      chooserobot='§';

    if (choice==2)      chooserobot='¥';

    if (choice==3)      chooserobot='π';

    if (choice!=1 && choice!=2 && choice!=3) {System.out.println("Invalid option. Exiting... "); sc.close(); System.exit(0);};


        Robot.setRobotchar(chooserobot);

    Controller.initRobo();



    String w ="w";
    String a ="a";
    String s = "s";
    String d = "d";
    String r ="r";
    String p ="p";
    String P = "P";

    String x = "x";


        // auto mode
    //String auto = "a";


    String userstate="n";






        

    do {

        
            if (Robot.getRobotbat()<=0) {System.out.println("Battery life is 0. Game over. Exiting... "); sc.close(); System.exit(0);}
            else System.out.println(Robot.getRobotbat() + " seconds of battery life left... ");

        System.out.println("Use wasd to move around, a to switch to auto mode, p to take a lo-res photo, P to take a high-res photo, r to pickup rock, or x to exit");
        System.out.println("Note: When you reach the (6,4) address on the map with the robot please use s instead of a to turn left. There is an undebugged program error and the a key currently doesn't work . ");

        userstate = sc.nextLine();

        if (Controller.getXR()==1 && Controller.getYR()== 5) {System.out.println("You won! "); sc.close(); System.exit(0);};

        if (Controller.getXR()==7 && Controller.getYR()==1 && userstate.equals(p) ) 

        {

Abstract.remove(8,1 ); Abstract.add(Alien.getAlienphotopose(), 8, 1); System.out.println("Picture taken! ");

Robot.reduceRobotbat(Alien.getLores());


        };



        if (Controller.getXR()==7 && Controller.getYR()==1 && userstate.equals(P) ) {


            Abstract.remove(8,1 ); Abstract.add(Alien.getAlienphotopose(), 8, 1); System.out.println("Picture taken! ");

            Robot.reduceRobotbat(Alien.getHighresphotoconsumption());





        };





        if (Controller.getXR()==4 && Controller.getYR()==1 && userstate.equals(r)) Abstract.remove(3,1);


        if (userstate.equals(w)) {Controller.moveUp(); Robot.reduceRobotbat(10);};
        if (userstate.equals(a)) {Controller.moveDown(); Robot.reduceRobotbat(10);};
        if (userstate.equals(s)) {Controller.moveLeft(); Robot.reduceRobotbat(10);};
        if (userstate.equals(d)) {Controller.moveRight(); Robot.reduceRobotbat(10);};

        if (userstate.equals(x)) {System.out.println("Exiting game... "); sc.close(); System.exit(0);};



        PrintMap.doIt();





    } while (!userstate.equals(x));










        sc.close();
        
    }
    
}
