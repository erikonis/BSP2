import java.util.Scanner;

class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // define multidimensional array [][]
        String[][] array = new String[3][3];
        //for-loop (3 passages)
        for (int i = 0; i < 3; i++) {
            //for-loop (3 passages)
            for (int j = 0; j < 3; j++) {
                //initialise array (value is empty)
                array[i][j] = "Empty";
            }
        }
        //start of the game
        System.out.println("\n---Game Board at start---\n");
        //for-loop
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (array[i][j]) {
                //first the player "circle" enters his value
                case "Circle":
                    System.out.print("\t O |");
                    break;
                //secodly the player "cross" enters his value
                case "Cross":
                    System.out.print("\t X |");
                    break;
                //default-value
                default:
                    System.out.print("\t  |");
                }
            }
            System.out.println("\n\t-----------------------");
        }
        //define integer for rounds (initialise with the value 1)
        int rounds = 1;
        //define boolean varibale 
        //boolean varibales can only have 2 vaues true or false
        boolean finished = false;
        //define string for circle
        String player = "Circle";
        //while-loop for the rounds (9rounds!)
        while (rounds <= 9 && !finished) {
            //ask the player to enter his values
            System.out.println("Player '" + player + "' it is your turn!");
            //define boolean
            boolean valid = false;
            //define 2 new integers
            int x = -1;
            int y = -1;
            //while-loop -> as long as valid is not true
            while (!valid) {
                //ask the user for his options/values
                System.out.println("Please type in your choice for X: ");
                x = scanner.nextInt();
                System.out.println("Please type in your choice for Y: ");
                y = scanner.nextInt();
                //if clause to check if array is empty
                if (array[x][y] == "Empty") {
                    //initialise the array with the player's choice value
                    array[x][y] = player;
                    //change the value of valid
                    valid = true;
                } 
                //when the option is already taken or you enter something irrelevant
                else {
                    System.out.println("Wrong option, please enter somehting else!");
                }
            }
            //Game-Board after round1,round2,round3 -> round9
            //round's value change after each round (round + 1)
            System.out.println("\n---Game Board after round " + rounds + " ---\n");
            //for-loop
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    switch (array[i][j]) {
                    case "Circle":
                        System.out.print("\t O |");
                        break;

                    case "Cross":
                        System.out.print("\t X |");
                        break;

                    default:
                        System.out.print("\t  |");
                    }
                }
                System.out.println("\n\t----------------------");
            }
            //define 4 integers (later to have the opportunity to check the winner)
            //each integer has the value 0
            int checkerHorizontal = 0;
            int checkerVertical = 0;
            int checkerDiagonal1 = 0;
            int checkerDiagonal2 = 0;
            //for-loop
            for (int i = 0; i < 3; i++) {
                //if array has the same value as player's choice
                if (array[i][y] == player) {
                    //initialise checkerVertical + 1
                    checkerVertical++;
                }
                //if array has the same value as player's choice
                if (array[x][i] == player) {
                    //initialise checkerHorizontal + 1
                    checkerHorizontal++;
                }
                //for-loop
                for (int j = 0; j < 3; j++) {

                    if (i == j && array[i][j] == player) {
                        //initialise the checkerDiagonal + 1
                        checkerDiagonal1++;
                        if (i == 1 && j == 1 && array[i][j] == player) {
                            if (array[0][2] == player && array[2][0] == player) {
                                checkerDiagonal2 = 3;
                            }
                        }
                    }
                }
            }
            //check if the integers has the value 3
            if (checkerHorizontal == 3 || checkerVertical == 3 || checkerDiagonal1 == 3 || checkerDiagonal2 == 3) {
                //the boolean varibale finished is now true
                //the game is finished
                finished = true;
                //announcement
                System.out.println("The winner is Player '" + player + "'!");
            }
            //initialise rounds + 1
            rounds++;
            //check if modulo 2 from rounds is 0
            player = rounds % 2 == 0 ? "Cross" : "Circle";
        }
        //close the scanner
        scanner.close();
    }
}