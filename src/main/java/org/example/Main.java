package org.example;

import java.util.*;
import static org.example.commomMethods.checkOption.checkOption;
import static org.example.commomMethods.setRating.setRating;
import static org.example.commomMethods.updateScore.updateScore;
import static org.example.traditionalGame.playGameOptionOne.*;
import static org.example.advancedGame.playNonTraditionalGame.*;


public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        // initial values
        String[] values = {"rock", "paper", "scissors"};
        String userInput = "";
        int userScore = 0;

        //intro logic
        System.out.print("Enter your name: ");
        String userName = myObj.nextLine();
        userScore += setRating(userName); //set the user score;
        System.out.println("Hello, " + userName);

        // options of the game
        String userChoices = myObj.nextLine();
        int option = checkOption(userChoices);

        System.out.println("Okay, let's start");

        while(!userInput.equals("!exit")){
            // initial values
            int result = 0;
            // Get user input
            userInput = myObj.nextLine();

            if(option == 1){
                //play tradtional game
                result = playGameOptionOne(values, userInput, userScore);
            } else if(option == 2) {
                result = playNonTraditionalGame(userChoices, userInput, userScore);
            }

            //update user score
            userScore += updateScore(result);
        }
        System.out.println("Bye!");
    }
}