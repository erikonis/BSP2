import java.util.Scanner;

public class TicTacToe3X3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input name of player 1: ");
        String player1 = scanner.next();
        System.out.print("Input name of player 2: ");
        String player2 = scanner.next();
        //setup asking for the player names, purely decorative

        //setup of a huge number of variables:

        int tm;
        //tm will be used for turn count modulo 2
        char pin;
        //used to hold X and O as the player input
        int wch = 0;
        //counter for the loop checking the win conditions
        int r = 1;
        //row counter
        int c = 1;
        //collumn counter
        int t = 0;
        //turn counter
        boolean turnend = false;
        //checks if the turn has ended
        char arr1[][];
        //initialization of the array holding the entire game
        boolean win = false;
        //nobody has won yet given that the game hasn't started yet
        arr1 = new char[4][4];
        //sets the size of the array
        arr1[0][0] = '0';
        arr1[1][0] = '1';
        arr1[0][1] = '1';
        arr1[2][0] = '2';
        arr1[0][2] = '2';
        arr1[3][0] = '3';
        arr1[0][3] = '3';
        while (r<=3){
            c = 1;
            while (c<=3){arr1[r][c++] = '_';}
            r++;}
        //setting up the array values manually and with a loop to create:
        //0 1 2 3
        //1 _ _ _
        //2 _ _ _
        //3 _ _ _
        // to give the players a grid to play on
        r = 0;
        c = 0;
            //setting r and c to a value that won't conflict with loops later

        for(int row=0;row<arr1.length;++row){
            for(int column=0 ; column<arr1[row].length;column++){
                System.out.print(arr1[row][column]+" ");}
                                System.out.println();}
            //a loop that prints the array as a table, this handy loop was gotten from the Programming Scrapbook
            
            //what follows is one heck of a loop:
            do{turnend = false;
                tm = t%2;
                pin = switch (tm) {
                    case 0 -> 'O';
                    case 1 -> 'X';
                    default-> '?';};
                    //sets the end of turn variable to false, and 
                    //checks if the turn counter is odd or even to determine what's added to the array

                if(t%2==0){
                    System.out.println("Player 1: "+player1+" ; O");}
                if((t%2==1)&&(t!=0)&&(turnend==false)){
                    System.out.println("Player 2: "+player2+" ; X");}
                    //checks what players turn it is 
                    //informs them of their turn and reminds them of their symbol
                    System.out.print("Input row: ");
                    r = scanner.nextInt();
                    System.out.print("Input column: ");
                    c = scanner.nextInt();
                    //asks for inputs for the row and column counters
                    if ((r<=0)||(r>3)){
                        System.out.println("Invalid input, your coordinates are not on the table, try again");}
                        //error message for invalid row input
                    if ((r==1)||(r==2)||(r==3)){
                        //checks if the input is 1, 2 or 3
                        if ((c<=0)||(c>3)){
                            System.out.println("Invalid input, your coordinates are not on the table, try again");}
                            //error message for invalid column input
                            if ((c==1)||(c==2)||(c==3)){
                                //valid column input
                                if ((arr1[r][c] == 'X')||(arr1[r][c]=='O')){
                                    System.out.println("Invalid input, this spot is taken, try again");}
                                    //checks if the spot chosen is already taken
                                if (arr1[r][c] == '_'){
                                    //if it's an empty space '_'
                                arr1[r][c] = pin;
                                //replaces the empty space with the player's symbol
                                t++;
                                //adds to the turn counter
                                turnend = true;}
                                //signals that the turn is over
                            }
                    }
                
                // if((t%2==1)&&(t!=0)&&(turnend==false)){
                //     System.out.println("Player 2: "+player2+" ; X");
                //     System.out.print("Input row: ");
                //     r = scanner.nextInt();
                //     System.out.print("Input column: ");
                //     c = scanner.nextInt();
                //     if ((r<=0)||(r>3)){
                //         System.out.println("Invalid input, your coordinates are not on the table, try again");}
                //     if ((r==1)||(r==2)||(r==3)){
                //         if ((c<=0)||(c>3)){
                //             System.out.println("Invalid input, your coordinates are not on the table, try again");}
                //             if ((c==1)||(c==2)||(c==3)){
                //                 if ((arr1[r][c] == 'X')||(arr1[r][c]=='O')){
                //                     System.out.println("Invalid input, this spot is taken, try again");}
                //                 if (arr1[r][c] == '_'){
                //                 arr1[r][c] = pin;
                //                 t++;}
                //             }
                //     }
                // }
                    //realized I didn't need to write this part twice

                for(int row=0;row<arr1.length;++row){
                    for(int column=0 ; column<arr1[row].length;column++){
                        System.out.print(arr1[row][column]+" ");}
                    System.out.println();}
                    //printing the array
                        r = 1;
                        c = 1;
                        //sets the row and column counters for the win condition checking
                    //loops 3 times
                        while(wch<6){
                        if ((r>0)&&(r<3)){
                            if ((arr1[r][1] == arr1[r][2])&&(arr1[r][1]==arr1[r][3])&&(arr1[r][1]!='_')){
                                win = true;}
                            //checks for wins with a row being made of the same symbols that are not '_'
                            r++;
                            wch++;}
                            //adds 1 to the row and win check counters regardless of outcome
                        if ((c>0)&&(c<3)){
                            if ((arr1[1][c] == arr1[2][c])&&(arr1[1][c]==arr1[3][c])&&(arr1[1][c]!='_')){
                                win = true;}
                            c++;
                            wch++;}
                            //same as the conditions for the rows, but for the columns
                            if ((arr1[1][1] == arr1[2][2])&&(arr1[1][1]==arr1[3][3])&&(arr1[2][2]!='_')){
                                win = true;}
                            if ((arr1[1][3] == arr1[2][2])&&(arr1[1][3]==arr1[3][1])&&(arr1[2][2]!='_')){
                                win = true;}
                                //checking for the diagonals
                            }
                wch = 0;
                //resets the win check counter after it's completed
            }while((t<9)&&(win==false));
            //end of the loop, which happens when it has either happened 9 times or someone has won
        System.out.println("GAME OVER:");
        System.out.println("Displaying final board");
        for(int row=0;row<arr1.length;++row){
            for(int column=0 ; column<arr1[row].length;column++){
                System.out.print(arr1[row][column]+" ");}
            System.out.println();}
        //announces the end of the game, prints the final board
            if (win){
                if (pin == 'O') {System.out.println("Player 1: "+player1+" has won!");}
                if (pin == 'X') {System.out.println("Player 2: "+player2+" has won!");}}
                //announces the winner if there was one
        scanner.close();
    }
}
