package lu.uni.programming1.lab4.exercise7;

import java.util.Scanner;

public class TicTacToeNXM {
     //handling the display for the grid
     public static void display(char[][] toDisplay) {

        String newLine = ""; 

        for(int i = 0; i < toDisplay[0].length; ++i) {newLine += "----";}

        String lines = "-" + newLine + "\n";

        for(char[] row : toDisplay){
            String l = "| ";
            for(char i : row){
                l += (i + " | ");
            }

            lines += (l + "\n");
            lines += newLine + "\n";
        }

        System.out.println(lines);
    }

    public static byte checkInput(byte i, byte x){//Ensure that no input is lower than 0 or higher than 3

        x -= 1;

        if (i > x) {i = x;}
        else if (i < 0) {i = 0;}

        return i;
    } 

    public static boolean[] checkWin(char[][] toCheck, byte n, byte m, byte toWin){

        boolean[] isWin = {false, false}; //Is there and winner and is it circle

        byte[] vOCounter = {0,0,0}; //Counters the first 0 represent the first column etc, if O in row
        byte[] vXCounter = {0,0,0}; 


        //Diagonals
        byte d0OCounter = 0; //For counting diagonals from 0;0 -> 2;2
        byte d0XCounter = 0;

        byte d1OCounter = 0; //For counting diagonals from 0;2 -> 2;0
        byte d1XCounter = 0;

        for(int i = 0; i < toCheck.length; ++i) {//For each row...


            byte hOCounter = 0;//Counters
            byte hXCounter = 0;

            for(int j = 0; j < toCheck[i].length; ++j){ //for column in each rows, count the numbers of cross and circles
                if (toCheck[i][j] == 'O') {++hOCounter; ++vOCounter[j];} 
                if (toCheck[i][j] == 'X') {++hXCounter; ++vXCounter[j];}

                if  (i == j) {
                    if (toCheck[i][j] == 'O') {++d0OCounter;} 
                    if (toCheck[i][j] == 'X') {++d0XCounter;}

                } 
                if (i == -j) {//if i == 2-j we are on the diagonal (2;0) -> (0;2), same as i == j is diagonal from (0;0) -> (2;2) but -2 offsets it
                    if (toCheck[i][j] == 'O') {++d1OCounter;} 
                    if (toCheck[i][j] == 'X') {++d1XCounter;}
                }
            }

            // if one of the counter is == 3 then we got a winner
            if (hOCounter == toWin) {isWin[0] = true; isWin[1] = true; break;}
            if (hXCounter == toWin) {isWin[0] = true; break;}
        }
        if (d0OCounter == toWin || d1OCounter == 3) {isWin[0] = true; isWin[1] = true;}//checking if diagonals counteur arre 3
        if (d0XCounter == toWin || d1XCounter == 3) {isWin[0] = true;}

        for(byte vOnb : vOCounter){
            if (vOnb == toWin) {isWin[0] = true; isWin[1] = true; break;}
        }

        for (byte vXnb : vXCounter){
            if (vXnb == toWin) {isWin[0] = true; break;}
        }      

        return isWin;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean playerCirclePlaying = true;

        //Input grid size
        byte n = 4;//vertical
        byte m = 5;//horizontal

        byte toWin = n<m ? n : m;

        char[][] grid = new char[n][m];

        for(byte i = 0; i < n; ++i){
            for(byte j = 0; j < m; ++j){
                grid[i][j] = ' ';
            }
        }
    

        //Some informational stuff
        System.out.println("TicTacToe but it's in java\nPlayer 'circle' starts by inputing where they want to play (From (0;0) to (2;2), input numbers separatly)");


        boolean[] isWin = {false, false};
        //Main Loop
        for(int i = 0; i < m*n; ++i){//Loops 9 times
            char toPlace;

            if (playerCirclePlaying) {
                System.out.println("Player Cicrle turn :");
                toPlace = 'O';
                //for next turn
                playerCirclePlaying = false;
            }
            else {
                System.out.println("Player Cross turn :");
                toPlace = 'X';

                playerCirclePlaying = true;
            }

            //Get Input
            byte[] coo = new byte[2];
            coo[1] = checkInput(scan.nextByte(), m);
            coo[0] = checkInput(scan.nextByte(), n);

            if (grid[coo[0]][coo[1]] == ' ') {grid[coo[0]][coo[1]] = toPlace;}
            else {
                System.out.println("This spot is already taken, play again");
                --i; 
                if(playerCirclePlaying) {playerCirclePlaying = false;} else {playerCirclePlaying = true;}
            }
            

            //Display
            display(grid);

            isWin = checkWin(grid, n, m, toWin);
            if (isWin[0]) {//If someone has win, we stop the Game

                char winner = isWin[1] ? 'O' : 'X';

                System.out.println(winner + " has won the game !");

                break;
            }

        }

        if (!isWin[0]) {
            System.out.println("No one has won the game.");
        }

        scan.close();
    }  
}
