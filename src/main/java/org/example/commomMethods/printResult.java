package org.example.commomMethods;

import org.example.traditionalGame.playTraditionalGame;

public class printResult {
    public static void printResult(int result, String robotInput, int userScore){
        switch(result){
            case 0:
                break;
            case 1:
                System.out.println("Sorry, but the computer chose " + robotInput);
                break;
            case 2:
                System.out.println("There is a draw " + robotInput);
                break;
            case 3:
                System.out.println("Well done. The computer chose " + robotInput + " and failed");
                break;
            case 5:
                System.out.println("Your rating: " + userScore);
                break;
            case 4:
                System.out.println("Invalid input");
                break;

        }
    }

}
