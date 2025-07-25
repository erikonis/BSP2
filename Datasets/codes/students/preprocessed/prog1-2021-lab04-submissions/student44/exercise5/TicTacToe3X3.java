import java.util.Scanner;

public class TicTacToe3X3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        char arr[][] = new char [3][3];
        arr[0][0] = ' ';
        arr[0][1] = ' ';
        arr[0][2] = ' ';
        arr[1][0] = ' ';
        arr[1][1] = ' ';
        arr[1][2] = ' ';
        arr[2][0] = ' ';
        arr[2][1] = ' ';
        arr[2][2] = ' ';

        int turns = 0;
        
        do { 
        
        System.out.println("\n");
        System.out.println(" " + arr[0][0] + " | " + arr[0][1] + " | " + arr[0][2] + " ");
        System.out.println("---|---|---");
        System.out.println(" " + arr[1][0] + " | " + arr[1][1] + " | " + arr[1][2] + " ");
        System.out.println("---|---|---");
        System.out.println(" " + arr[2][0] + " | " + arr[2][1] + " | " + arr[2][2] + " ");
        

        System.out.println("Player circle's turn (O): ");
        System.out.println("Select row by entering 1 or 2 or 3 (up to bottom): ");
        int rowO = scanner.nextInt();
        System.out.println("Select square by entering 1 or 2 or 3 (left to right): ");
        int squareO = scanner.nextInt();

       if (rowO == 1) 
       {switch (squareO)
           
       {case 1 : arr[0][0] = 'O';
       break;
       case 2 : arr[0][1] = 'O';
       break;
       case 3 : arr[0][2] = 'O';
       break;}}

        if (rowO == 2)
        { switch (squareO)

        {case 1 : arr[1][0] = 'O';
        break;
        case 2 : arr[1][1] = 'O';
        break;
        case 3 : arr[1][2] = 'O';
        break;}}

        if (rowO == 3)
        { switch (squareO)

        {case 1 : arr[2][0] = 'O';
        break;
        case 2 : arr[2][1] = 'O';
        break;
        case 3: arr[2][2] = 'O';
        break;}}

        turns += 1;

        if (arr[0][0] == 'O' && arr[1][1] == 'O' && arr[2][2] == 'O') {turns = 5; System.out.println("Circle wins !");}
        if (arr[0][2] == 'O' && arr[1][1] == 'O' && arr[2][0] == 'O') {turns = 5; System.out.println("Circle wins !");}
        if (arr[0][0] == 'O' && arr[1][0] == 'O' && arr[2][0] == 'O') {turns = 5; System.out.println("Circle wins !");}
        if (arr[0][1] == 'O' && arr[1][1] == 'O' && arr[2][1] == 'O') {turns = 5; System.out.println("Circle wins !");}
        if (arr[0][2] == 'O' && arr[1][2] == 'O' && arr[2][2] == 'O') {turns = 5; System.out.println("Circle wins !");}
        if (arr[0][0] == 'O' && arr[0][1] == 'O' && arr[0][2] == 'O') {turns = 5; System.out.println("Circle wins !");}
        if (arr[1][0] == 'O' && arr[1][1] == 'O' && arr[1][2] == 'O') {turns = 5; System.out.println("Circle wins !");}
        if (arr[2][0] == 'O' && arr[2][1] == 'O' && arr[2][2] == 'O') {turns = 5; System.out.println("Circle wins !");}

        if (turns != 5)
        {
        
        System.out.println("\n");
        System.out.println(" " + arr[0][0] + " | " + arr[0][1] + " | " + arr[0][2] + " ");
        System.out.println("---|---|---");
        System.out.println(" " + arr[1][0] + " | " + arr[1][1] + " | " + arr[1][2] + " ");
        System.out.println("---|---|---");
        System.out.println(" " + arr[2][0] + " | " + arr[2][1] + " | " + arr[2][2] + " ");

        System.out.println("Player cross's turn (X): ");
        System.out.println("Select row by entering 1 or 2 or 3 (up to bottom): ");
        int rowX = scanner.nextInt();
        System.out.println("Select square of your choice by entering 1 or 2 or 3 (left to right): ");
        int squareX = scanner.nextInt();

        if (rowX == 1) 
       {switch (squareX)
           
       {case 1 : arr[0][0] = 'X';
       break;
       case 2 : arr[0][1] = 'X';
       break;
       case 3 : arr[0][2] = 'X';
       break;}}

        if (rowX == 2)
        { switch (squareX)

        {case 1 : arr[1][0] = 'X';
        break;
        case 2 : arr[1][1] = 'X';
        break;
        case 3 : arr[1][2] = 'X';
        break;}}

        if (rowX == 3)
        { switch (squareX)

        {case 1 : arr[2][0] = 'X';
        break;
        case 2 : arr[2][1] = 'X';
        break;
        case 3: arr[2][2] = 'X';
        break;}}
    
        if (arr[0][0] == 'X' && arr[1][1] == 'X' && arr[2][2] == 'X') {turns = 5; System.out.println("Cross wins !");}
        if (arr[0][2] == 'X' && arr[1][1] == 'X' && arr[2][0] == 'X') {turns = 5; System.out.println("Cross wins !");}
        if (arr[0][0] == 'X' && arr[1][0] == 'X' && arr[2][0] == 'X') {turns = 5; System.out.println("Cross wins !");}
        if (arr[0][1] == 'X' && arr[1][1] == 'X' && arr[2][1] == 'X') {turns = 5; System.out.println("Cross wins !");}
        if (arr[0][2] == 'X' && arr[1][2] == 'X' && arr[2][2] == 'X') {turns = 5; System.out.println("Cross wins !");}
        if (arr[0][0] == 'X' && arr[0][1] == 'X' && arr[0][2] == 'X') {turns = 5; System.out.println("Cross wins !");}
        if (arr[1][0] == 'X' && arr[1][1] == 'X' && arr[1][2] == 'X') {turns = 5; System.out.println("Cross wins !");}
        if (arr[2][0] == 'X' && arr[2][1] == 'X' && arr[2][2] == 'X') {turns = 5; System.out.println("Cross wins !");}
        }
        

        } while (turns != 5);

        System.out.println("Game finished !");
        System.out.println(" " + arr[0][0] + " | " + arr[0][1] + " | " + arr[0][2] + " ");
        System.out.println("---|---|---");
        System.out.println(" " + arr[1][0] + " | " + arr[1][1] + " | " + arr[1][2] + " ");
        System.out.println("---|---|---");
        System.out.println(" " + arr[2][0] + " | " + arr[2][1] + " | " + arr[2][2] + " ");

        scanner.close();

    }

    
    
}
