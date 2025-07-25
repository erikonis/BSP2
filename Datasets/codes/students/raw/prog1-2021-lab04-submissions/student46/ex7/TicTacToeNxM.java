package lu.uni.programming1.lab4.ex7;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeNxM {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width and height of the gamefield: ");
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        char[][] gamefield = new char[width][height];

        char turn = 'o'; // circle starts

        for (int i = 0; i < width * height; i++) {
            int x, y;
            if (turn == 'x') { // "AI"
                do { // find a field that is empty
                    x = random.nextInt(width);
                    y = random.nextInt(height);
                } while (gamefield[x][y] == 'x' || gamefield[x][y] == 'o');
                System.out.printf("AI (x) plays on field: %d %d\f", x, y);
            } else {
                // read move
                System.out.printf("It is " + turn + "'s turn, please enter x (1-%d) and y (1-%d) coordinate: \n", width,
                        height);
                x = scanner.nextInt() - 1; // we do -1 to get the array index
                y = scanner.nextInt() - 1;
            }

            // check if field is already occupied
            if ((gamefield[x][y] == 'x') || (gamefield[x][y] == 'o')) {
                i--;
                System.out.println("Invalid move, field occupied! Try again!");
                continue;
            }

            gamefield[x][y] = turn;

            // print play field
            for (int b = 0; b < height; b++) {
                for (int a = 0; a < width; a++) {
                    char state = gamefield[a][b] == 0 ? '.' : gamefield[a][b];
                    System.out.print(state + "\t");
                }
                System.out.println();
            }

            turn = (turn == 'o') ? 'x' : 'o'; // switch turns

            char winner = 0;
            char[][] g = gamefield;
            // check if there are 3 equal signs somewhere on the board
            for (int ox = 0; ox < width - 3; ox++) {
                for (int oy = 0; oy < height - 3; oy++) {
                    if (g[ox + 0][oy + 0] == g[ox + 1][oy + 1] && g[ox + 1][oy + 1] == g[ox + 2][oy + 2]) { // diagonal
                                                                                                            // 1
                        winner = g[ox + 1][oy + 1];
                    } else if (g[ox + 2][oy + 0] == g[ox + 1][oy + 1] && g[ox + 1][oy + 1] == g[ox + 0][oy + 2]) { // diagonal
                                                                                                                   // 2
                        winner = g[ox + 1][oy + 1];
                    } else {
                        for (int h = 0; h < 3; h++) {
                            if (g[ox + h][oy + 0] == g[ox + h][oy + 1] && g[ox + h][oy + 1] == g[ox + h][oy + 2]) { // row
                                winner = g[ox + h][oy + 1];
                                break;
                            } else if (g[ox + 0][oy + h] == g[ox + 1][oy + h]
                                    && g[ox + 1][oy + h] == g[ox + 2][oy + h]) { // column
                                winner = g[ox + 1][oy + h];
                                break;
                            }
                        }
                    }
                }
            }
            if (winner != 0) {
                System.out.println("Winner is " + winner);
                break;
            }
        }

        scanner.close();
    }

}