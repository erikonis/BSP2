package Exercise1;

public class Robot {


    public static char robotchar='∆';

    public static char initbat =3000;


   


    public static char getRobotchar() {
        return robotchar;
    }

    public static void setRobotchar(char wr2) {
        robotchar = wr2;
    }



    public static int getRobotbat() {
        return initbat;
    }

    public static void reduceRobotbat(int wr3) {
        initbat -= wr3;
    }




    public void chargeBattery() {

        initbat =3000;

    }




    
}
