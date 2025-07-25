package lu.uni.programming1.lab4.exercise5;

import java.util.Scanner;

public class TicTacToe3X3 {

    public static String gameField(byte field[][]) {
        String string = "Board: \n";

        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                //displays cross & circle
                switch (field[i][j]) {
                    case 1:
                        string += "X ";
                        break;
                    case 2:
                        string += "O ";
                        break;
                    default:
                        string += "/ ";
                        break;
                };
            }
            //goes to the next line
            string += "\n";
        }
        
        return string;
    }

    public static boolean win(byte field[][]) {
        boolean win = false;

        //horizontally
        if (field[0][0] == field[0][1] && field[0][1] == field[0][2] && field[0][0] != 0 || field[1][0] == field[1][1] && field[1][1] == field[1][2] && field[1][0] != 0 || field[2][0] == field[2][1] && field[2][1] == field[2][2] && field[2][0] != 0) {
            win = true;
        }

        //vertically
        if (field[0][0] == field[1][0] && field[1][0] == field[2][0] && field[0][0] != 0 || field[0][1] == field[1][1] && field[1][1] == field[2][1] && field[0][1] != 0 || field[0][2] == field[1][2] && field[1][2] == field[2][2] && field[0][2] != 0) {
            win = true;
        }

        //diagonally
        if (field[0][0] == field[1][1] && field[1][1] == field[2][2] && field[1][1] != 0 || field[0][2] == field[1][1] && field[1][1] == field[2][0] && field[1][1] != 0 ) {
            win = true;
        }
        return win;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //declare new field of type byte, 0 represents empty, 1 cross and 2 circle
        byte field[][];
        field = new byte[3][3];

        short round = 0;
        String winner = "No one";
        boolean finished = false;

        do {
            //displays the field
            System.out.println(gameField(field));

            //checks if player places on allowed field
            boolean allowed = true;

            //every second round, other player plays
            if (round % 2 == 0) {
                //If player wants to overwrite already existing field -> do while loop and if condidtion
                do {
                    System.out.println("It's time to place a circle!\nWhere do you want to place the circle?");

                    //Player enters coordinates
                    System.out.print("Enter the X coordinate (from 1 to 3) : ");
                    byte x = (byte)(scanner.nextByte()-1);
                    System.out.print("Enter the Y coordinate (from 1 to 3) : ");
                    byte y = (byte)(scanner.nextByte()-1);

                    if (field[y][x] == 0) {
                        field[y][x] = 2;
                        allowed = true;
                        //checks if game is won
                        finished = win(field);
                        //Name of the winner
                        if (finished) {
                            winner = "Circle";
                        }
                    } else {
                        System.out.println("There is already a cross or circle on this field.\nPlease choose another field.");
                        allowed = false;
                    }
                    
                } while (!allowed);
            } else {
                do {
                    System.out.println("It's time to place a cross!\nWhere do you want to place the cross?");

                    //Player enters coordinates
                    System.out.print("Enter the X coordinate (from 1 to 3) : ");
                    byte x = (byte)(scanner.nextByte()-1);
                    System.out.print("Enter the Y coordinate (from 1 to 3) : ");
                    byte y = (byte)(scanner.nextByte()-1);

                    if (field[y][x] == 0) {
                        field[y][x] = 1;
                        allowed = true;
                        //checks if game is won
                        finished = win(field);
                        //Name of the winner
                        if (finished) {
                            winner = "Cross";
                        }
                    } else {
                        System.out.println("There is already a cross or circle on this field.\nPlease choose another field.");
                        allowed = false;
                    }
                    
                } while (!allowed) ;
            }
            round += 1;
        } while (round < 9 && !finished) ;

        //displays field at the end
        System.out.println(gameField(field));
        //Outputs winner
        System.out.println( winner + " won!");

        scanner.close();
    }
}