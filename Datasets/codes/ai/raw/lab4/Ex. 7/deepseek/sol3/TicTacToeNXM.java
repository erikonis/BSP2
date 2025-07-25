import java.util.Scanner;
import java.util.Random;

public class TicTacToeNXM {
    private static char[][] board;
    private static int rows, cols, winLength;
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        initializeGame();
        char currentPlayer = 'O'; // Human starts
        
        while (true) {
            printBoard();
            if (currentPlayer == 'O') {
                humanMove();
            } else {
                aiSmartMove();
            }
            
            if (checkWin(currentPlayer)) {
                printBoard();
                System.out.println(currentPlayer + " wins!");
                break;
            }
            
            if (isBoardFull()) {
                printBoard();
                System.out.println("It's a draw!");
                break;
            }
            
            currentPlayer = (currentPlayer == 'O') ? 'X' : 'O';
        }
    }

    private static void initializeGame() {
        System.out.print("Enter number of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        cols = scanner.nextInt();
        System.out.print("Enter winning line length: ");
        winLength = scanner.nextInt();
        
        board = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = ' ';
            }
        }
    }

    private static void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(" " + board[i][j] + " ");
                if (j < cols - 1) System.out.print("|");
            }
            System.out.println();
            if (i < rows - 1) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("---");
                    if (j < cols - 1) System.out.print("+");
                }
                System.out.println();
            }
        }
    }

    private static void humanMove() {
        int row, col;
        do {
            System.out.print("Enter row (1-" + rows + ") and column (1-" + cols + "): ");
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;
        } while (row < 0 || row >= rows || col < 0 || col >= cols || board[row][col] != ' ');
        board[row][col] = 'O';
    }

    private static void aiRandomMove() {
        int row, col;
        do {
            row = random.nextInt(rows);
            col = random.nextInt(cols);
        } while (board[row][col] != ' ');
        board[row][col] = 'X';
        System.out.println("AI plays at (" + (row+1) + "," + (col+1) + ")");
    }

    // Add this method to the previous solution to replace aiRandomMove()
private static void aiSmartMove() {
    // First check if AI can win
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (board[i][j] == ' ') {
                board[i][j] = 'X';
                if (checkWin('X')) {
                    System.out.println("AI plays at (" + (i+1) + "," + (j+1) + ")");
                    return;
                }
                board[i][j] = ' ';
            }
        }
    }
    
    // Then check if human can win and block
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (board[i][j] == ' ') {
                board[i][j] = 'O';
                if (checkWin('O')) {
                    board[i][j] = 'X';
                    System.out.println("AI plays at (" + (i+1) + "," + (j+1) + ")");
                    return;
                }
                board[i][j] = ' ';
            }
        }
    }
    
    // If no immediate win/block, play randomly
    aiRandomMove();
}

    private static boolean checkWin(char player) {
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
        
        // Check diagonals
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
                
                win = true;
                for (int k = 0; k < winLength; k++) {
                    if (board[i + k][j + winLength - 1 - k] != player) {
                        win = false;
                        break;
                    }
                }
                if (win) return true;
            }
        }
        
        return false;
    }

    private static boolean isBoardFull() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}