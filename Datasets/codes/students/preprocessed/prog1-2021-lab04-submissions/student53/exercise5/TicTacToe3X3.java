import java.util.Scanner;

public class TicTacToe3X3 {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        int counter = 0, row, col;
        Scanner scanner = new Scanner(System.in);

        while (counter < 9 && !checkIfOWon(board) && !checkIfXWon(board)) {
            if (counter % 2 == 0) {
                System.out.print("Player O: Please enter a value for the row (0 - 2)");
                row = scanner.nextInt();
                System.out.print("Player O: Please enter a value for the column (0 - 2)");
                col = scanner.nextInt();
                while (!checkIfPossible(row, col, board)) {
                    System.out.print("Player O: Please enter a valid value for the row (0 - 2)");
                    row = scanner.nextInt();
                    System.out.print("Player O: Please enter a valid value for the column (0 - 2)");
                    col = scanner.nextInt();
                }
                board[row][col] = 'O';
            } else {
                System.out.print("Player X: Please enter a value for the row (0 - 2)");
                row = scanner.nextInt();
                System.out.print("Player X: Please enter a value for the column (0 - 2)");
                col = scanner.nextInt();
                while (!checkIfPossible(row, col, board)) {
                    System.out.print("Player X: Please enter a valid value for the row (0 - 2)");
                    row = scanner.nextInt();
                    System.out.print("Player X: Please enter a valid value for the column (0 - 2)");
                    col = scanner.nextInt();
                }
                board[row][col] = 'X';

            }
            counter++;
            printBoard(board);
            if (checkIfOWon(board)) {
                System.out.println("Player O won!");
                break;
            }
            if (checkIfXWon(board)) {
                System.out.println("Player X won!");
                break;
            }
            if (counter == 9) {
                System.out.println("It's a tie!");
                break;
            }
        }
        scanner.close();
    }

    private static boolean checkIfPossible(int r, int c, char[][] b) {
        if (r < b.length && c < b[r].length && b[r][c] != 'X' && b[r][c] != 'O') {
            return true;
        } else {
            return false;
        }
    }

    private static void printBoard(char[][] x) {
        System.out.println("\n\t" + x[0][0] + "\t|\t" + x[0][1] + "\t|\t" + x[0][2]);
        System.out.println("----------------+---------------+-----------------");
        System.out.println("\t" + x[1][0] + "\t|\t" + x[1][1] + "\t|\t" + x[1][2]);
        System.out.println("----------------+---------------+-----------------");
        System.out.println("\t" + x[2][0] + "\t|\t" + x[2][1] + "\t|\t" + x[2][2] + "\n");
    }

    private static boolean checkIfXWon(char[][] x) {
        if ((x[0][0] == 'X' && x[1][1] == 'X' && x[2][2] == 'X')) {
            return true;
        } else if ((x[2][0] == 'X' && x[1][1] == 'X' && x[0][2] == 'X')) {
            return true;
        } else if ((x[0][0] == 'X' && x[1][0] == 'X' && x[2][0] == 'X')
                || (x[0][1] == 'X' && x[1][1] == 'X' && x[2][1] == 'X')
                || (x[0][2] == 'X' && x[1][2] == 'X' && x[2][2] == 'X')) {
            return true;
        } else if ((x[0][0] == 'X' && x[0][1] == 'X' && x[0][2] == 'X')
                || (x[1][0] == 'X' && x[1][1] == 'X' && x[1][2] == 'X')
                || (x[2][0] == 'X' && x[2][1] == 'X' && x[2][2] == 'X')) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean checkIfOWon(char[][] x) {
        if ((x[0][0] == 'O' && x[1][1] == 'O' && x[2][2] == 'O')) {
            return true;
        } else if ((x[2][0] == 'O' && x[1][1] == 'O' && x[0][2] == 'O')) {
            return true;
        } else if ((x[0][0] == 'O' && x[1][0] == 'O' && x[2][0] == 'O')
                || (x[0][1] == 'O' && x[1][1] == 'O' && x[2][1] == 'O')
                || (x[0][2] == 'O' && x[1][2] == 'O' && x[2][2] == 'O')) {
            return true;
        } else if ((x[0][0] == 'O' && x[0][1] == 'O' && x[0][2] == 'O')
                || (x[1][0] == 'O' && x[1][1] == 'O' && x[1][2] == 'O')
                || (x[2][0] == 'O' && x[2][1] == 'O' && x[2][2] == 'O')) {
            return true;
        } else {
            return false;
        }
    }
}