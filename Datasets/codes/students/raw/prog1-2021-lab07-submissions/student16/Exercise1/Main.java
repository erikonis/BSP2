public class Main {

    public static void main(String[] args) {

        Actions a = new Actions();
       
        battery bat= new battery();
        int batterylife = bat.getBattery();

        System.out.println("Your steps for set 1 were: ");
        Actions[] set1 = {a.getForward(),a.getLeft(),a.getLeft(),a.getLeft(),a.getForward(),a.getRock(),a.getForward(),a.getHighphoto(),a.getRight()} ;

        System.out.println();

        System.out.println("Your steps for set 2 were: ");
        Actions[] set2 = {a.getRight(),a.getForward(),a.getLeft()} ;


        

       
    


        

       
        
        
    }
}

   

