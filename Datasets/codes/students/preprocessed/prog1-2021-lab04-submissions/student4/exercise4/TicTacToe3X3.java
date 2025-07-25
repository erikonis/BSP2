import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TicTacToe3X3 {

    static ArrayList<Integer> player1pos = new ArrayList<Integer>();
    static ArrayList<Integer> player2pos = new ArrayList<Integer>();

    public static void main (String[] args) {

        int place1, place2;

        char [][] GameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', ' ', '-', ' ', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', ' ', '-', ' ', '-'},
                {' ', '|', ' ', '|', ' '},};

        printGmeBoard(GameBoard);

        while (true) {
            Scanner scan = new Scanner(System.in);
            //Demande au Joueur 1 de jouer
            System.out.print("Player 1: ");
            System.out.print("Choose your field (1-9): ");
            place1 = scan.nextInt();
            while(player1pos.contains(place1) || player2pos.contains(player1pos)) {
                System.out.print("Position already taken! Choose an other one: ");
                place1 = scan.nextInt();
            }
            //Positione le symbole du Joueur 1 et regarde s'il a gagné
            PlaceSym(GameBoard, place1, "Player 1");
            printGmeBoard(GameBoard);
            String result = Winner();
            if(result.length() > 0) {
                System.out.println(result);
                break;
            }
            //Demande au Joueur 2 de jouer 
            System.out.print("Player 2: ");
            System.out.print("Choose your field (1-9): ");
            place2 = scan.nextInt();
            while(player1pos.contains(place2) || player2pos.contains(player2pos)) {
                System.out.print("Position already taken! Choose an other one: ");
                place2 = scan.nextInt();
            }
            //Positione le symbole du Joueur 2 et regarde s'il a gagné
            PlaceSym(GameBoard, place2, "Player 2");
            printGmeBoard(GameBoard);
            result = Winner();
            if(result.length() > 0) {
                System.out.println(result);
                break;
            }
            
        }

    }

// Print le tableau
    public static void printGmeBoard(char[][] GameBoard){
        for(char [] row : GameBoard) {
            for(char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }

// Print les symboles sur le tableau
    public static void PlaceSym(char [][] GameBoard, int place, String user){

            char symbole = ' ';

            if(user.equals("Player 1")) {
                symbole = 'X';
                player1pos.add(place);
            } else if (user.equals("Player 2")){
                symbole = 'O';
                player2pos.add(place);
            }

            switch(place){
            case 1:
                GameBoard[0][0] = symbole;
                break;
            case 2:
                GameBoard[0][2] = symbole;
                break;
            case 3:
                GameBoard[0][4] = symbole;
                break;
            case 4:
                GameBoard[2][0] = symbole;
                break;
            case 5:
                GameBoard[2][2] = symbole;
                break;
            case 6:
                GameBoard[2][4] = symbole;
                break;
            case 7:
                GameBoard[4][0] = symbole;
                break;
            case 8:
                GameBoard[4][2] = symbole;
                break;
            case 9:
                GameBoard[4][4] = symbole;
                break;
            default:
                break;
            }

    }

// Regarde si qqn a gagner ou pas
    public static String Winner(){

        List row1 = Arrays.asList(1, 2, 3);
        List row2 = Arrays.asList(4, 5, 6);
        List row3 = Arrays.asList(7, 8, 9);
        List col1 = Arrays.asList(7, 4, 1);
        List col2 = Arrays.asList(8, 5, 2);
        List col3 = Arrays.asList(9, 6, 3);
        List diag1 = Arrays.asList(1, 5, 9);
        List diag2 = Arrays.asList(7, 5, 3);

        List<List> Win = new ArrayList<List>();
        Win.add(row1);
        Win.add(row2);
        Win.add(row3);
        Win.add(col1);
        Win.add(col2);
        Win.add(col3);
        Win.add(diag1);
        Win.add(diag2);

        for(List l : Win){
            if(player1pos.containsAll(l)) {
                return "Player 1 gets: WINNER WINNER CHICKEN DINNER!!";
            } else if(player2pos.contains(l)){
                return "Player 2 gets: WINNER WINNER CHICKEN DINNER!!";
            } else if(player1pos.size() + player2pos.size() == 9) {
                return "SHEEEEEEHS CLOSE CALL!!";
            }
        }
    
        return "";
    }
}
