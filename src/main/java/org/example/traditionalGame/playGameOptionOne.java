package org.example.traditionalGame;

import org.example.commomMethods.printResult;

import static org.example.commomMethods.computerPicksOption.computerPicksOption;
import static org.example.commomMethods.printResult.printResult;

public class playGameOptionOne {
    public static int playGameOptionOne(String[] values, String userInput, int userScore){
        // Create a random num & pick a robot input
        String robotInput = computerPicksOption(values, 3);
        // concatenate
        String concatAnswer = robotInput + " " + userInput;

        // safety
        if(userInput.equals("!rating"))concatAnswer = userInput;
        if(userInput.equals("!exit"))concatAnswer = userInput;

        // play  game
        int result = playTraditionalGame.playTraditionalGame(concatAnswer);

        // print results --/--
        printResult.printResult(result, robotInput, userScore);

        return result;
    }

}
