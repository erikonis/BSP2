package Exercise1;

public abstract class Controller {


    public  static int origXpos =8;
    public  static int origYpos =3 ;


    public void setXR (int whatXint) { origXpos=whatXint;  }

    public void setYR (int whatYint) { origYpos=whatYint;   }





    public static int getXR() { return origXpos; }

    public static int getYR() { return origYpos; }



    public static void initRobo() {


        Abstract.remove(origXpos, origYpos);

        Abstract.add(Robot.getRobotchar(), origXpos, origYpos);




    }






        public static void moveUp() {

            if (origXpos>1) { int captureXpos1=origXpos;

            if ((Abstract.onthemap[captureXpos1-1][origYpos]==false) 
          /*  && (origXpos!=1) && (origYpos!=5) */
            
            ) {

                Abstract.remove(origXpos, origYpos);

                
                origXpos-=1;

                Abstract.add(Robot.getRobotchar(), origXpos, origYpos);




            }; }


        }




        public static void moveDown() {


            if(origXpos<8){       int captureXpos2=origXpos;

            if ( (Abstract.onthemap[captureXpos2+1][origYpos]==false)
            /*&& (origXpos!=8) && (origYpos!=3)
 */            
            ) {

                Abstract.remove(origXpos, origYpos);


                origXpos+=1;

                Abstract.add(Robot.getRobotchar(), origXpos, origYpos);








            };}




        }


            // the MoveLeft function DOES NOT WORK!!! use the s key instead of the a key to move left once you reach (6,4)

        public static void moveLeft() {


            if(origYpos>1){      int captureYpos1=origYpos;

            if (Abstract.onthemap[origXpos][captureYpos1-1]==false) {

                Abstract.remove(origXpos, origYpos);


                origYpos-=1;

                Abstract.add(Robot.getRobotchar(), origXpos, origYpos);




            } ; }





        }




        public static void moveRight() {


            if (origYpos<8) {        int captureYpos2=origYpos;


            if (Abstract.onthemap[origXpos][captureYpos2+1]==false) {

                    
                Abstract.remove(origXpos, origYpos);


                origYpos+=1;

                Abstract.add(Robot.getRobotchar(), origXpos, origYpos);



            } ;} 






        }








}