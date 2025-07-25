import java.util.Scanner;

public class TicTacToe3X3 {
    public static void main(String[] args) {
        // Ex 5.1
        char[][] gamefield = new char[3][3];

        Scanner scanner = new Scanner(System.in);

        char turn = 'o'; // circle starts

        // Ex 5.2
        boolean winnerExists = false;
        for (int i = 0; i < 9; i++) {
            // read move
            System.out.println("It is " + turn + "'s turn, please enter x and y coordinate: (1-3)");
            int x = scanner.nextInt() - 1; // we do -1 to get the array index
            int y = scanner.nextInt() - 1;

            if (x < 0 || x > 2 || y < 0 || y > 2) {
                i--;
                System.out.println("Invalid move, index out of bounds! Try again!");
                continue;
            }

            // check if field is already occupied
            if ((gamefield[x][y] == 'x') || (gamefield[x][y] == 'o')) {
                i--;
                System.out.println("Invalid move, field occupied! Try again!");
                continue;
            }

            gamefield[x][y] = turn;

            // print play field
            for (int b = 0; b < 3; b++) { // vertical index
                for (int a = 0; a < 3; a++) { // horizontal index
                    char state = gamefield[a][b] == 0 ? '.' : gamefield[a][b];
                    System.out.print(state + "\t");
                }
                System.out.println();
            }

            turn = (turn == 'o') ? 'x' : 'o'; // switch turns

            // Ex 5.3
            char winner = 0;
            char[][] g = gamefield;

            if (g[0][0] == g[1][1] && g[1][1] == g[2][2]) { // diagonal 1
                winner = g[1][1];
            } else if (g[2][0] == g[1][1] && g[1][1] == g[0][2]) { // diagonal 2
                winner = g[1][1];
            } else {
                for (int h = 0; h < 3; h++) {
                    if (g[h][0] == g[h][1] && g[h][1] == g[h][2]) { // row
                        winner = g[h][1];
                        break;
                    } else if (g[0][h] == g[1][h] && g[1][h] == g[2][h]) { // column
                        winner = g[1][h];
                        break;
                    }
                }
            }
            if (winner != 0) {
                System.out.println("Winner is " + winner);
                winnerExists = true;
                break;
            }

        }

        if (!winnerExists) {
            System.out.println("There was no winner, game was a tie!");
        }

        scanner.close();
    }

}