package Exercise1;
import java.util.Scanner;
public class Maze {
    static Scanner scan = new Scanner(System.in);
    static int time = 3000;
    static boolean canGoLeft = false;
    static boolean canGoRight = false;
    static boolean canGoDown = false;
    static boolean canGoUp = false;

    Maze(boolean canGoLeft, boolean canGoRight, boolean canGoDown, boolean canGoUp){
        this.canGoLeft = canGoLeft;
        this.canGoRight = canGoRight;
        this.canGoDown = canGoDown;
        this.canGoUp = canGoUp;
    }

    public static void main(String[] args){

        //1st step
        direction();
        canGoD();
        String input = scan.nextLine();
        Controller ctrl = new Controller(input,canGoLeft,canGoRight,canGoDown,canGoUp);
        ctrl.goDirection();

        if (input.contains("down")){
            //2nd step
            direction();
            canGoL();
            input = scan.nextLine();
            ctrl = new Controller(input,canGoLeft,canGoRight,canGoDown,canGoUp);
            ctrl.goDirection();

            if (input.contains("left")){
                //3rd step
                direction();
                canGoL();
                input = scan.nextLine();
                ctrl = new Controller(input,canGoLeft,canGoRight,canGoDown,canGoUp);
                ctrl.goDirection();

                if (input.contains("left")){
                    //4th step
                    direction();
                    canGoL();
                    input = scan.nextLine();
                    ctrl = new Controller(input,canGoLeft,canGoRight,canGoDown,canGoUp);
                    ctrl.goDirection();

                    if (input.contains("left")){
                        //5th step
                        ctrl.picksUpRock();
                        direction();
                        canGoD();
                        input = scan.nextLine();
                        ctrl = new Controller(input,canGoLeft,canGoRight,canGoDown,canGoUp);
                        ctrl.goDirection();

                        if (input.contains("down")){
                            //6th step
                            direction();
                            canGoR();
                            canGoD();
                            input = scan.nextLine();
                            ctrl = new Controller(input,canGoLeft,canGoRight,canGoDown,canGoUp);
                            ctrl.goDirection();

                            if (input.contains("down")){
                                //7th step
                                ctrl.takePicture();
                                direction();
                                canGoR();
                                input = scan.nextLine();
                                ctrl = new Controller(input,canGoLeft,canGoRight,canGoDown,canGoUp);
                                ctrl.goDirection();

                                if (input.contains("right")){
                                    //8th step
                                    direction();
                                    canGoR();
                                    input = scan.nextLine();
                                    ctrl = new Controller(input,canGoLeft,canGoRight,canGoDown,canGoUp);
                                    ctrl.goDirection();

                                    if (input.contains("right")){
                                        //9th step
                                        direction();
                                        canGoD();
                                        input = scan.nextLine();
                                        ctrl = new Controller(input,canGoLeft,canGoRight,canGoDown,canGoUp);
                                        ctrl.goDirection();

                                        if (input.contains("down")){
                                            //10th step
                                            direction();
                                            canGoL();
                                            input = scan.nextLine();
                                            ctrl = new Controller(input,canGoLeft,canGoRight,canGoDown,canGoUp);
                                            ctrl.goDirection();

                                            if (input.contains("left")){
                                                System.out.println("you got out of the maze safely... and with a minor traumatism" + "\n" + time);

                                            }
                                        }
                                    }
                                }
                            }

                            if (input.contains("right")){
                                //7th step
                                direction();
                                canGoU();
                                canGoR();
                                input = scan.nextLine();
                                ctrl = new Controller(input,canGoLeft,canGoRight,canGoDown,canGoUp);
                                ctrl.goDirection();

                                if (input.contains("right")){
                                    //8th step
                                    direction();
                                    canGoR();
                                    input = scan.nextLine();
                                    ctrl = new Controller(input,canGoLeft,canGoRight,canGoDown,canGoUp);
                                    ctrl.goDirection();

                                    if (input.contains("right")){
                                        //9th step
                                        direction();
                                        canGoR();
                                        canGoD();
                                        input = scan.nextLine();
                                        ctrl = new Controller(input,canGoLeft,canGoRight,canGoDown,canGoUp);
                                        ctrl.goDirection();
                                        System.out.println("you are lost... forever...");
                                    }        
                                }

                                if (input.contains("up")){
                                    //8th step
                                    direction();
                                    canGoR();
                                    input = scan.nextLine();
                                    ctrl = new Controller(input,canGoLeft,canGoRight,canGoDown,canGoUp);
                                    ctrl.goDirection();

                                    if (input.contains("right")){
                                        //9th step
                                        direction();
                                        canGoR();
                                        input = scan.nextLine();
                                        ctrl = new Controller(input,canGoLeft,canGoRight,canGoDown,canGoUp);
                                        ctrl.goDirection();
                                        System.out.println("you are lost... forever...");
                                    }
                                }
                            }


                        }
                    }
                }
            }
        }
    }


    static public void direction(){
        System.out.println("Which direction do you want to go? ");
    }

    static void canGoL(){
        System.out.println("(can go left)");
        canGoLeft = true;
    }

    static void canGoR(){
        System.out.println("(can go right)");
        canGoRight = true;
    }

    static void canGoU(){
        System.out.println("(can go up)");
        canGoUp = true;
    }

    static void canGoD(){
        System.out.println("(can go down)");
        canGoDown = true;
    }
}
