
import java.util.Scanner;

public class TicTacToe3X3 {

    public static void main(String[] args) {
        
        char X='X'; char O='O'; char undef='∆'; char playerchooses = ' '; char wonline='/';
        boolean player1choseX = false; Scanner data = new Scanner(System.in);
        boolean gameover = false; boolean player1turn = true;
        int V=0; int H=0;
        boolean crosswins = false; boolean verticalwins = false; boolean horizontalwins = false; boolean stalemate = false;
        char pl2extra = '2'; int stalematecounter = 0;
        boolean Xwon=false; boolean Owon =false;
         
        char[][] TTT = new char[3][3];

        for (int i=0; i<=2; i++) for (int j=0; j<=2; j++) {TTT[i][j]=undef;};

        // display the initial game state, in this case as art (splash screen)
        System.out.println(" ");
        for (int i=0; i<=2; i++) for (int j=0; j<=2; j++) {System.out.print("   " + TTT[i][j] + "   "+ " " + "  " + " " + "  "); if ((j==2) ) {System.out.println("\n");} };
        
        System.out.println("Player 1 type in your name: ");
        String player1name = data.nextLine();
        
        System.out.println(player1name + ": select X or O: ");
        
        playerchooses = data.nextLine().charAt(0);

        if (playerchooses=='x' || playerchooses=='X') {player1choseX=true;}
        else if (playerchooses!='o' || playerchooses!='O' || playerchooses!='0') {player1choseX=false; }
        else {System.out.println(playerchooses + " is neither X nor O. Exiting... "); data.close(); System.exit(0);};

        System.out.println("Player 2 type in your name: ");
        String player2name = data.nextLine();
        if (player1name==player2name) player2name=player2name+pl2extra;

        //the following line is for debugging
        //System.out.println("Made it till here. OK. ");

        while (!gameover) {

            //update the screen with the current game state
            System.out.println(" ");
            for (int i=0; i<=2; i++) for (int j=0; j<=2; j++) {System.out.print("   " + TTT[i][j] + "  ("+ (i+1) + ", " + (j+1) + ") "); if ((j==2) ) {System.out.println("\n");} };

            // check whether stalemate had already occurred 

            for (int i=0; i<=2; i++) for (int j=0; j<=2; j++) {if (TTT[i][j]!=undef) stalematecounter+=1; };
            if (stalematecounter<9) stalematecounter=0; else stalemate=true; 

            // if it is stalemate, announce it, and exit
            if (stalemate) {System.out.println("STALEMATE!!! "); gameover=true; data.close(); System.exit(0);};

            if (player1turn) System.out.println(player1name + ": "); else System.out.println(player2name + ": ");
            
            // ask for the vertical and horizontal coordinate ...
            do {
            System.out.print(" Type the vertical coordinate (1, 2, or 3): ");
            V = data.nextInt(); V=V-1;

            System.out.print(" Type the horizontal coordinate (1, 2, or 3): ");
            H = data.nextInt(); H=H-1;
            
            // ... as long as it wasn't already marked
            if (TTT[V][H]!=undef) System.out.println(" Already marked. Try again: ");

            } while (TTT[V][H]!=undef);

            //checking if the while loop exited successfully
            //System.out.println(" out of the while loop... ");

            // whose turn was it, and what did they chose?

            if (player1turn && player1choseX) TTT[V][H]=X;
            if (player1turn && !player1choseX) TTT[V][H]=O;
            if (!player1turn && player1choseX) TTT[V][H]=O;
            if (!player1turn && !player1choseX) TTT[V][H]=X;

            //check if the if statements work with the following line
            //System.out.println(TTT[V][H]+ " !!!!!!!!!!!!!!!");

            // check for cross wins

            if ( (TTT[0][0]==TTT[1][1]) && (TTT[1][1]==TTT[2][2]) && (TTT[1][1]==X) ) {crosswins = true; Xwon=true; };

            if ( (TTT[0][2]==TTT[1][1]) && (TTT[2][0]==TTT[1][1]) && (TTT[1][1]==X) ) {crosswins = true; Xwon=true;  };

            if ( (TTT[0][0]==TTT[1][1]) && (TTT[1][1]==TTT[2][2]) && (TTT[1][1]==O ) ) {crosswins = true;  Owon=true; };

            if ( (TTT[0][2]==TTT[1][1]) && (TTT[2][0]==TTT[1][1]) && (TTT[1][1]==O)) {crosswins = true;  Owon=true; };


            // check for horizontal wins

            if ( (TTT[0][0]==TTT[0][1]) && (TTT[0][1]==TTT[0][2]) && (TTT[0][1]==X)) {horizontalwins = true; Xwon=true; };

            if ( (TTT[0][0]==TTT[0][1]) && (TTT[0][1]==TTT[0][2]) && (TTT[0][1]==O)) {horizontalwins = true; Owon=true; };


            if ( (TTT[1][0]==TTT[1][1]) && (TTT[1][1]==TTT[1][2]) && (TTT[1][1]==X)) {horizontalwins = true; Xwon=true; };

            if ( (TTT[1][0]==TTT[1][1]) && (TTT[1][1]==TTT[1][2]) && (TTT[1][1]==O)) {horizontalwins = true; Owon=true; };


            if ( (TTT[2][0]==TTT[2][1]) && (TTT[2][1]==TTT[2][2]) && (TTT[2][1]==X)) {horizontalwins = true; Xwon=true; };

            if ( (TTT[2][0]==TTT[2][1]) && (TTT[2][1]==TTT[2][2]) && (TTT[2][1]==O)) {horizontalwins = true; Owon=true; };


            // check for vertical wins

            if ( (TTT[0][0]==TTT[1][0]) && (TTT[1][0]==TTT[2][0]) && (TTT[1][0]==X)) {verticalwins = true; Xwon=true; };

            if ( (TTT[0][0]==TTT[1][0]) && (TTT[1][0]==TTT[2][0]) && (TTT[1][0]==O)) {verticalwins = true; Owon=true; };


            if ( (TTT[0][1]==TTT[1][1]) && (TTT[1][1]==TTT[2][1]) && (TTT[1][1]==X)) {verticalwins = true; Xwon=true; };

            if ( (TTT[0][1]==TTT[1][1]) && (TTT[1][1]==TTT[2][1]) && (TTT[1][1]==O)) {verticalwins = true; Owon=true; };


            if ( (TTT[0][2]==TTT[1][2]) && (TTT[1][2]==TTT[2][2]) && (TTT[1][2]==X)) {verticalwins = true; Xwon=true; };

            if ( (TTT[0][2]==TTT[1][2]) && (TTT[1][2]==TTT[2][2]) && (TTT[1][2]==O)) {verticalwins = true; Owon=true; };

            // check which player won
             if (crosswins || verticalwins || horizontalwins) {
                
                if (Xwon && player1choseX) {System.out.println(player1name + " WINS!!! "); };
                if (Owon && player1choseX) {System.out.println(player2name + " WINS!!! "); };
                if (Xwon && !player1choseX) {System.out.println(player2name + " WINS!!! "); };
                if (Owon && !player1choseX) {System.out.println(player1name + " WINS!!! "); };

            // draw a line to indicate the win

            if (Xwon) {for (int i=0; i<=2; i++) for (int j=0; j<=2; j++)  if (TTT[i][j]==X)  TTT[i][j]=wonline;  }; 
            
            if (Owon) {for (int i=0; i<=2; i++) for (int j=0; j<=2; j++)  if (TTT[i][j]==O)  TTT[i][j]=wonline;  };

            // display the final game state
            System.out.println(" ");
            for (int i=0; i<=2; i++) for (int j=0; j<=2; j++) { System.out.print("   " + TTT[i][j] + "   "+ " " + "  " + " " + "  "); if ((j==2) ) {System.out.println("\n");} };
                
            gameover=true; data.close(); System.exit(0); };

            // if no one won yet, it is the other player's turn
            player1turn = !player1turn;

                };
            // close the Scanner
            data.close();
            
        }

    }