public class Coins {

    public static void main (String[]args){

        int i = 0;
        int j = 0 ;
        int j2 = 0;

       for ( i = 0; i < 5; i++) {
           for (j = 0; j < 10; j++) {
              for (j2 = 0; j2 < 20; j2++) {
                  if (i*5 + j*10 + j2*20 == 100){
                  System.out.println(i + "\t" + j + "\t" + j2);
                   
                  }
              }
           }
       }
       
       System.out.println("The number of possibilities : " + (i+j+j2));
        

    }
}