import java.util.Scanner;

public class TicTacToe3X3 {
    // Constants for game states
    private static final int EMPTY = 0;
    private static final int CIRCLE = 1;
    private static final int CROSS = 2;
    
    private static final int SIZE = 3;
    private static int[][] board = new int[SIZE][SIZE];
    private static int currentPlayer = CIRCLE;
    private static boolean gameOver = false;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeBoard();
        
        int movesLeft = SIZE * SIZE;
        
        while (movesLeft > 0 && !gameOver) {
            printBoard();
            
            System.out.println("Player " + (currentPlayer == CIRCLE ? "CIRCLE" : "CROSS") + "'s turn");
            System.out.print("Enter row (0-2) and column (0-2) separated by space: ");
            
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            
            if (isValidMove(row, col)) {
                board[row][col] = currentPlayer;
                movesLeft--;
                
                if (checkWin(row, col)) {
                    gameOver = true;
                    printBoard();
                    System.out.println("Player " + (currentPlayer == CIRCLE ? "CIRCLE" : "CROSS") + " wins!");
                } else if (movesLeft == 0) {
                    printBoard();
                    System.out.println("Game ended in a draw!");
                }
                
                currentPlayer = (currentPlayer == CIRCLE) ? CROSS : CIRCLE;
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }
        
        scanner.close();
    }
    
    private static void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = EMPTY;
            }
        }
    }
    
    private static void printBoard() {
        System.out.println("Current board:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                switch (board[i][j]) {
                    case EMPTY:
                        System.out.print("-\t");
                        break;
                    case CIRCLE:
                        System.out.print("O\t");
                        break;
                    case CROSS:
                        System.out.print("X\t");
                        break;
                }
            }
            System.out.println();
        }
    }
    
    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == EMPTY;
    }
    
    private static boolean checkWin(int row, int col) {
        // Check row
        if (board[row][0] == currentPlayer && board[row][1] == currentPlayer && board[row][2] == currentPlayer) {
            return true;
        }
        
        // Check column
        if (board[0][col] == currentPlayer && board[1][col] == currentPlayer && board[2][col] == currentPlayer) {
            return true;
        }
        
        // Check diagonal (if move is on diagonal)
        if (row == col) {
            if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
                return true;
            }
        }
        
        // Check anti-diagonal (if move is on anti-diagonal)
        if (row + col == SIZE - 1) {
            if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
                return true;
            }
        }
        
        return false;
    }
}