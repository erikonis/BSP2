import java.util.*;

public class TicTacToeMCTS {
    private static char[][] board;
    private static int rows, cols, winLength;
    private static Scanner scanner = new Scanner(System.in);
    private static final char HUMAN = 'O';
    private static final char AI = 'X';
    private static final char EMPTY = ' ';

    public static void main(String[] args) {
        initializeGame();
        char currentPlayer = HUMAN; // Human starts first
        
        while (true) {
            printBoard();
            
            if (currentPlayer == HUMAN) {
                humanMove();
            } else {
                System.out.println("AI is thinking...");
                aiMCTSMove();
            }
            
            if (checkWin(currentPlayer)) {
                printBoard();
                System.out.println(currentPlayer == HUMAN ? "You win!" : "AI wins!");
                break;
            }
            
            if (isBoardFull()) {
                printBoard();
                System.out.println("It's a draw!");
                break;
            }
            
            currentPlayer = (currentPlayer == HUMAN) ? AI : HUMAN;
        }
    }

    // ... (initializeGame, printBoard, humanMove, checkWin, isBoardFull methods same as Solution 3)

    private static void aiMCTSMove() {
        MCTSNode root = new MCTSNode(copyBoard(board), null, AI);
        root.expand();
        
        long endTime = System.currentTimeMillis() + 2000; // Run for 2 seconds
        while (System.currentTimeMillis() < endTime) {
            MCTSNode selected = root.select();
            if (selected == null) continue;
            
            MCTSNode expanded = selected.expand();
            if (expanded == null) continue;
            
            int result = expanded.simulate();
            expanded.backpropagate(result);
        }
        
        MCTSNode bestChild = root.getBestChild();
        board = bestChild.board;
        System.out.println("AI plays at (" + (bestChild.move[0]+1) + "," + (bestChild.move[1]+1) + ")");
    }

    private static char[][] copyBoard(char[][] original) {
        char[][] copy = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            System.arraycopy(original[i], 0, copy[i], 0, cols);
        }
        return copy;
    }

    static class MCTSNode {
        char[][] board;
        int[] move;
        MCTSNode parent;
        List<MCTSNode> children;
        int wins;
        int visits;
        char player;
        char nextPlayer;

        public MCTSNode(char[][] board, MCTSNode parent, char player) {
            this.board = board;
            this.parent = parent;
            this.player = player;
            this.nextPlayer = (player == AI) ? HUMAN : AI;
            this.children = new ArrayList<>();
            this.wins = 0;
            this.visits = 0;
        }

        public MCTSNode select() {
            if (children.isEmpty()) return this;
            
            MCTSNode selected = null;
            double bestUCB = Double.NEGATIVE_INFINITY;
            
            for (MCTSNode child : children) {
                double ucb = child.calculateUCB();
                if (ucb > bestUCB) {
                    bestUCB = ucb;
                    selected = child;
                }
            }
            
            return selected.select();
        }

        public MCTSNode expand() {
            if (checkWin(AI) || checkWin(HUMAN) || isBoardFull()) {
                return null;
            }
            
            List<int[]> possibleMoves = getPossibleMoves();
            if (possibleMoves.isEmpty()) return null;
            
            for (int[] move : possibleMoves) {
                char[][] newBoard = copyBoard(board);
                newBoard[move[0]][move[1]] = nextPlayer;
                children.add(new MCTSNode(newBoard, this, nextPlayer));
            }
            
            return children.get(0);
        }

        public int simulate() {
            char[][] simBoard = copyBoard(board);
            char currentPlayer = nextPlayer;
            
            while (true) {
                if (checkWin(simBoard, AI)) return 1;
                if (checkWin(simBoard, HUMAN)) return -1;
                if (isBoardFull(simBoard)) return 0;
                
                List<int[]> moves = getPossibleMoves(simBoard);
                if (moves.isEmpty()) break;
                
                int[] randomMove = moves.get((int) (Math.random() * moves.size()));
                simBoard[randomMove[0]][randomMove[1]] = currentPlayer;
                currentPlayer = (currentPlayer == AI) ? HUMAN : AI;
            }
            
            return 0;
        }

        public void backpropagate(int result) {
            visits++;
            wins += result;
            if (parent != null) {
                parent.backpropagate(-result); // Alternate perspective for parent
            }
        }

        public MCTSNode getBestChild() {
            MCTSNode bestChild = null;
            int mostVisits = -1;
            
            for (MCTSNode child : children) {
                if (child.visits > mostVisits) {
                    mostVisits = child.visits;
                    bestChild = child;
                }
            }
            
            return bestChild;
        }

        private double calculateUCB() {
            if (visits == 0) return Double.POSITIVE_INFINITY;
            return (wins / (double) visits) + 1.4 * Math.sqrt(Math.log(parent.visits) / visits);
        }

        private List<int[]> getPossibleMoves() {
            return getPossibleMoves(board);
        }

        private List<int[]> getPossibleMoves(char[][] board) {
            List<int[]> moves = new ArrayList<>();
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (board[i][j] == EMPTY) {
                        moves.add(new int[]{i, j});
                    }
                }
            }
            return moves;
        }

        private boolean checkWin(char[][] board, char player) {
            // Same checkWin logic as before but for any board
            // Check rows, columns, and diagonals as in Solution 3
            // Implementation omitted for brevity
        }

        private boolean isBoardFull(char[][] board) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (board[i][j] == EMPTY) return false;
                }
            }
            return true;
        }
    }
}