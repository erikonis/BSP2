package lu.uni.programming1.lab4.exercise5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
    Array :
    [0,0] | [0,1] | [0,2]
    ----- + ----- + -----
    [1,0] | [1,1] | [1,2]
    ----- + ----- + -----
    [2,0] | [2,1] | [2,2]
 */
public class TicTacToe {
    public static char[][] arr = new char[3][3]; //free the array mem
    public static char listOfStates[] = {'X', 'O', ' '};
    public static List<Integer>usedCoords = new ArrayList<Integer>();
    public static int choice,aiChoice;
    public static char pos1 =
            listOfStates[2],
            pos2 = listOfStates[2],
            pos3 = listOfStates[2],
            pos4 = listOfStates[2],
            pos5 = listOfStates[2],
            pos6 = listOfStates[2],
            pos7 = listOfStates[2],
            pos8 = listOfStates[2],
            pos9 = listOfStates[2];
    public static String gridTxt = "";
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LoadArr(arr);
        AskUser();
    }

    private static int AskUser() {
            InitializeGrid();
            System.out.println("Please choose the pos :");
            choice = sc.nextInt();
            usedCoords.add(choice);
            gridID();
        return choice;
    }

    private static String InitializeGrid() {
        gridTxt =
                "|\t" + pos1 + "\t|\t" + pos2 + "\t|\t" + pos3 + "\t|\n" +
                "|\t" + pos4 + "\t|\t" + pos5 + "\t|\t" + pos6 + "\t|\n" +
                "|\t" + pos7 + "\t|\t" + pos8 + "\t|\t" + pos9 + "\t|\n";
        System.out.println(gridTxt);
        return gridTxt;
    }

    private static void LoadArr(char[][]arr){
        pos1 = arr[0][0];   pos4 = arr[1][0]; pos7 = arr[2][0];
        pos2 = arr[0][1];   pos5 = arr[1][1]; pos8 = arr[2][1];
        pos3 = arr[0][2];   pos6 = arr[1][2]; pos9 = arr[2][2];
    }

    private static void gridID() {
        switch (choice) {
            case 0:
                break;
            case 1:
                if(pos1 == listOfStates[0] || pos1 == listOfStates[1]){
                    System.out.println("Invalid move !");
                    AskUser();
                }
                else{
                    pos1 = listOfStates[0];
                    AIMove();
                    AskUser();
                }
                break;
            case 2:
                if(pos2 == listOfStates[0] || pos2 == listOfStates[1]){
                    System.out.println("Invalid move !");
                    AskUser();
                }
                else{
                    pos2 = listOfStates[0];
                    AIMove();
                    AskUser();
                }
                break;
            case 3:
                if(pos3 == listOfStates[0] || pos3 == listOfStates[1]){
                    System.out.println("Invalid move !");
                    AskUser();
                }
                else{
                    pos3 = listOfStates[0];
                    AIMove();
                    AskUser();
                }
                break;
            case 4:
                if(pos4 == listOfStates[0] || pos4 == listOfStates[1]){
                    System.out.println("Invalid move !");
                    AskUser();
                }
                else{
                    pos4 = listOfStates[0];
                    AIMove();
                    AskUser();
                }
                break;
            case 5:
                if(pos5 == listOfStates[0] || pos5 == listOfStates[1]){
                    System.out.println("Invalid move !");
                    AskUser();
                }
                else{
                    pos5 = listOfStates[0];
                    AIMove();
                    AskUser();
                }
            case 6:
                if(pos6 == listOfStates[0] || pos6 == listOfStates[1]){
                    System.out.println("Invalid move !");
                    AskUser();
                }
                else{
                    pos6 = listOfStates[0];
                    AIMove();
                    AskUser();
                }
                break;
            case 7:
                if(pos7 == listOfStates[0] || pos7 == listOfStates[1]){
                    System.out.println("Invalid move !");
                    AskUser();
                }
                else{
                    pos7 = listOfStates[0];
                    AIMove();
                    AskUser();
                }
                break;
            case 8:
                if(pos8 == listOfStates[0] || pos8 == listOfStates[1]){
                    System.out.println("Invalid move !");
                    AskUser();
                }
                else{
                    pos8 = listOfStates[0];
                    AIMove();
                    AskUser();
                }
                break;
            case 9:
                if(pos9 == listOfStates[0] || pos9 == listOfStates[1]){
                    System.out.println("Invalid move !");
                    AskUser();
                }
                else{
                    pos9 = listOfStates[0];
                    AIMove();
                    AskUser();
                }
                break;
            default:
                throw new Error("Invalid ID");
        }
    }
    private static int AIMove(){
        aiChoice = (int)(Math.random()*9) + 1;
        CheckGrid();
        switch (aiChoice){
            case 1:
                if(pos1 == listOfStates[0] || pos1 == listOfStates[1]){
                    AIMove();
                }
                else{
                    usedCoords.add(aiChoice);
                    pos1 = listOfStates[1];
                }
                break;
            case 2:
                if(pos2 == listOfStates[0] || pos2 == listOfStates[1]){
                    AIMove();
                }
                else{
                    usedCoords.add(aiChoice);
                    pos2 = listOfStates[1];
                }
                break;
            case 3:
                if(pos3 == listOfStates[0] || pos3 == listOfStates[1]){
                    AIMove();
                }
                else{
                    usedCoords.add(aiChoice);
                    pos3= listOfStates[1];
                }
                break;
            case 4:
                if(pos4 == listOfStates[0] || pos4 == listOfStates[1]){
                    AIMove();
                }
                else{
                    usedCoords.add(aiChoice);
                    pos4= listOfStates[1];
                }
                break;
            case 5:
                if(pos5 == listOfStates[0] || pos5 == listOfStates[1]){
                    AIMove();
                }
                else{
                    usedCoords.add(aiChoice);
                    pos5= listOfStates[1];
                }
                break;
            case 6:
                if(pos6 == listOfStates[0] || pos6 == listOfStates[1]){
                    AIMove();
                }
                else{
                    usedCoords.add(aiChoice);
                    pos6= listOfStates[1];
                }
                break;
            case 7:
                if(pos7== listOfStates[0] || pos7 == listOfStates[1]){
                    AIMove();
                }
                else{
                    usedCoords.add(aiChoice);
                    pos7= listOfStates[1];
                }
                break;
            case 8:
                if(pos8 == listOfStates[0] || pos8 == listOfStates[1]){
                    AIMove();
                }
                else{
                    usedCoords.add(aiChoice);
                    pos8= listOfStates[1];
                }
                break;
            case 9:
                if(pos9 == listOfStates[0] || pos9 == listOfStates[1]){
                    AIMove();
                }
                else{
                    usedCoords.add(aiChoice);
                    pos9= listOfStates[1];
                }
                break;
        }
        return aiChoice;
    }
    private static void CheckGrid(){
        if(usedCoords.size() == 9){
            System.out.println("It's a tie !");
            System.exit(1);
        }
        if ((pos1 == listOfStates[0] && pos2 == listOfStates[0] && pos3 == listOfStates[0])
        || (pos4 == listOfStates[0] && pos5 == listOfStates[0] && pos6 == listOfStates[0])
        || (pos7 == listOfStates[0] && pos8 == listOfStates[0] && pos9 == listOfStates[0])
        ///
        || (pos1 == listOfStates[0] && pos4 == listOfStates[0] && pos7 == listOfStates[0])
        || (pos2 == listOfStates[0] && pos5 == listOfStates[0] && pos8 == listOfStates[0])
        || (pos3 == listOfStates[0] && pos6 == listOfStates[0] && pos9 == listOfStates[0])
        ///
        || (pos1 == listOfStates[0] && pos5 == listOfStates[0] && pos9 == listOfStates[0])
        || (pos3 == listOfStates[0] && pos5 == listOfStates[0] && pos7 == listOfStates[0])){
            System.out.println("You won");
            System.exit(1);
        }
        else if ((pos1 == listOfStates[1] && pos2 == listOfStates[1] && pos3 == listOfStates[1])
                || (pos4 == listOfStates[1] && pos5 == listOfStates[1] && pos9 == listOfStates[1])
                ///
                || (pos1 == listOfStates[1] && pos5 == listOfStates[1] && pos8 == listOfStates[1])
                || (pos3 == listOfStates[1] && pos6 == listOfStates[1] && pos9 == listOfStates[1])
                ///
                || (pos1 == listOfStates[1] && pos5 == listOfStates[1] && pos9 == listOfStates[1])
                || (pos3 == listOfStates[1] && pos5 == listOfStates[1] && pos7 == listOfStates[1])){
            System.out.println("You lost");
            System.exit(1);
        }
    }
}
