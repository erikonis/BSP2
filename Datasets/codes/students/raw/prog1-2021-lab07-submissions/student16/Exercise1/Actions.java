public class Actions {

    private Actions right;
    private Actions left;
    private Actions forward;
    private Actions back;
    private Actions rock;
    private Actions highphoto;
    private int rightprice = -10; 
    private int leftprice = -10;
    private int forwardprice = -10;
    private int backprice = -10;
    private int rockprice = -150 ;
    private int higphotoprice = -60;


   
    

    public int getRightprice() {
        return rightprice;
    }


    public int getLeftprice() {
        return leftprice;
    }

  

    public int getForwardprice() {
        return forwardprice;
    }

 

    public int getBackprice() {
        return backprice;
    }



    public int getRockprice() {
        return rockprice;
    }


    public int getHigphotoprice() {
        return higphotoprice;
    }


    

    public Actions getRock() {

        System.out.println("You picked up a rock");
        return rock;
    }
  
    public Actions getHighphoto() {

        System.out.println("You made a high resolution photo");
        return highphoto;
    }
   

   
  
  
    public Actions getRight() {
        System.out.println("You went 20 cm to the right");
        return right;
    }
   
    public Actions getLeft() {
        System.out.println("You went 20 cm to the left");
        return left;
    }
  
    public Actions getForward() {
        System.out.println("You went 20 cm forward");
        return forward;
    }
  
    public Actions getBack() {
        System.out.println("You went 20 cm back");
        return back;
    }

}
