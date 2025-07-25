import java.util.Random;
import java.util.Scanner;

public class TicTacToeNXM {

    public static void main(Stringargs) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows (N): ");
        int N = scanner.nextInt();
        System.out.print("Enter number of columns (M): ");
        int M = scanner.nextInt();

        charboard = new char[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                board[i][j] = ' ';
            }
        }

        char currentPlayer = 'O';
        boolean gameWon = false;
        int rounds = 0;
        int maxRounds = N * M;
        Random random = new Random();

        while (rounds < maxRounds && !gameWon) {
            System.out.println("Current board:");
            printBoard(board);

            if (currentPlayer == 'O') {
                System.out.print("Player " + currentPlayer + ", enter your move (row and column): ");
                int row = scanner.nextInt();
                int col = scanner.nextInt();

                if (row >= 0 && row < N && col >= 0 && col < M && board[row][col] == ' ') {
                    board[row][col] = currentPlayer;
                    rounds++;
                    gameWon = checkWin(board, currentPlayer, Math.min(N, M));
                    currentPlayer = 'X';
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            } else {
                // AI's turn (random move)
                int row, col;
                do {
                    row = random.nextInt(N);
                    col = random.nextInt(M);
                } while (board[row][col] != ' ');

                board[row][col] = currentPlayer;
                rounds++;
                gameWon = checkWin(board, currentPlayer, Math.min(N, M));
                currentPlayer = 'O';
            }
        }

        System.out.println("Final board:");
        printBoard(board);

        if (gameWon) {
            System.out.println("Player " + (currentPlayer == 'O' ? 'X' : 'O') + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }

    static void printBoard(charboard) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static boolean checkWin(charboard, char player, int winLength) {
        int rows = board.length;
        int cols = board[0].length;

        // Check rows
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= cols - winLength; j++) {
                boolean win = true;
                for (int k = 0; k < winLength; k++) {
                    if (board[i][j + k] != player) {
                        win = false;
                        break;
                    }
                }
                if (win) return true;
            }
        }

        // Check columns
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i <= rows - winLength; i++) {
                boolean win = true;
                for (int k = 0; k < winLength; k++) {
                    if (board[i + k][j] != player) {
                        win = false;
                        break;
                    }
                }
                if (win) return true;
            }
        }

        // Check diagonals (top-left to bottom-right)
        for (int i = 0; i <= rows - winLength; i++) {
            for (int j = 0; j <= cols - winLength; j++) {
                boolean win = true;
                for (int k = 0; k < winLength; k++) {
                    if (board[i + k][j + k] != player) {
                        win = false;
                        break;
                    }
                }
                if (win) return true;
            }
        }

        // Check diagonals (top-right to bottom-left)
        for (int i = 0; i <= rows - winLength; i++) {
            for (int j = winLength - 1; j < cols; j++) {
                boolean win = true;
                for (int k = 0; k < winLength; k++) {
                    if (board[i + k][j - k] != player) {
                        win = false;
                        break;
                    }
                }
                if (win) return true;
            }
        }

        return false;
    }
}