package Exercise1;

public abstract class Abstract {

    static char[][] themap = new char[10][10];

    static boolean[][] onthemap = new boolean[10][10];

    public static void resetbool() {  

        for (int i=0; i<=9; i++)

        for (int j=0; j<=9; j++) { onthemap[i][j]=false; };  }


    public static void erase() {



        for (int i=0; i<=9; i++)

        for (int j=0; j<=9; j++) {  themap[i][j]=' '; };


    }


        public static void add(char chartoadd, int Xpos, int Ypos)  {

            char whatwasadded=chartoadd;


            if(onthemap[Xpos][Ypos]==false) {
            onthemap[Xpos][Ypos]=true;
            themap[Xpos][Ypos]=whatwasadded;};

        }

        public static void remove(int xp, int yp) {

            if(onthemap[xp][yp]==true) {

                onthemap[xp][yp]=false;

                themap[xp][yp]=' ';
            

        };        }






        


}
