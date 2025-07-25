public class PrintMap {
    

    public static void doIt() {

        String thestringcharZ=" ";



        for (int i=0; i<=9; i++)

        for (int j=0; j<=9; j++) 

        {    char c=Abstract.themap[i][j]; if (c==' ') thestringcharZ=" "; else  thestringcharZ=String.valueOf(c);
            System.out.print(thestringcharZ  );
        
           if (j==9) {System.out.print("\n"); }; }


 System.out.println("You are now on position " + Controller.getXR() + ", " + Controller.getYR());



    }



}
