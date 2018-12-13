package boardgames;

import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Board {
    //scanner used to substitue console input
    static Scanner Read;
    //String array for 9 tictactoe squares
    static String[] squares;
    //string that tracks player X or O
    static String player;

    public static void main(String[] args) {
        Read = new Scanner(System.in);
        squares = new String[9];
        player = "X";
        String WinningCase = null;
        for (int t = 0; t < 9; t++) {
            squares[t] = String.valueOf(t + 1);
        }

        System.out.println("WELCOME TO DAVIDS TIC TAC TOE THINGY");
        System.out.println("PLAYER X choose a number from 1 - 9");
        //checks if game has been won yet
        while (WinningCase == null) {
            //takes in user input and then a if statement for values outside of 0 - 9
           int Input = Read.nextInt();
            if ((Input < 0 && Input >= 9)) {
                System.out.println("Not a number from 1-9 bud");
            }
            if (squares[Input - 1].equals(String.valueOf(Input))) {
                //tells program which player is going X or O
                squares[Input - 1] = player;
                if (player.equals("X")) {
                    player = "O";
                } else {
                    player = "X";
                }
                //send to checking method
                WinningCase = checkForAWinningCase();
            } else {
                //for repeat case
                System.out.println("Re enter, you typed in a number that is already taken...");
            }
        }
        //results
        if (WinningCase.equalsIgnoreCase("draw")) {
            System.out.println("It's a draw :(");
        } else {
            System.out.println("Congratulations! " + WinningCase + "'s have won! ");
        }
    }

    public static String checkForAWinningCase() {
        for (int a = 0; a < 8; a++) {
            //reset line to nothing and checks all winning combinations
            String line = null;
            switch (a) {
                case 0:
                    line = squares[0]+squares[1]+ squares[2];
                    break;
                case 1:
                    line = squares[3]+squares[4] +squares[5];
                    break;
                case 2:
                    line = squares[6]+ squares[7]+ squares[8];
                    break;
                case 3:
                    line = squares[1] + squares[4]+ squares[7];
                    break;
                case 4:
                    line = squares[0]+ squares[3] + squares[6];
                    break;
                case 5:
                    line = squares[0] + squares[4]+ squares[8];
                    break;
                case 6:
                    line = squares[2]+squares[5] +squares[8];
                    break;
                case 7:
                    line = squares[2]+squares[4]+squares[6];
                    break;
            }
            if (line.equals("XXX")) {
                //return winning letter so winner can be announced
                return "X";
            } else if (line.equals("OOO")) {
                return "O";
            }
        }
        for (int t = 0; t < 9; t++) {
            //for draw scenario where 9 string values are placed and no winner found
            if (Arrays.asList(squares).contains(String.valueOf(t + 1))) {
                break;
            } else if (t == 8) {
                return "draw";
            }
        }
        //for no winning scenarion and less than 9 squares filled
        System.out.println(player + "'s player; enter a #:");
        return null;
    }

}
