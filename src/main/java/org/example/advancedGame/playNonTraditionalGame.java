package org.example.advancedGame;

import java.util.ArrayList;

import static org.example.commomMethods.computerPicksOption.computerPicksOption;
import static org.example.commomMethods.printResult.printResult;

public class playNonTraditionalGame {
    public static int playNonTraditionalGame(String userChoices, String userInput, int userScore) {
        int result = 0;
        String computerChoice = "";

        if (userInput.equals("!exit") || userInput.equals("!rating")) {
            // or see other option than play
            result = rulesForNonTradiGame.rulesForNonTradiGame(userInput);

        } else {
            String[] allChoices = userChoices.split(","); // what the user included

            // create an array without the user choice
            ArrayList<String> allChoicesArrayList = new ArrayList<String>();
            for (String i : allChoices) {
                allChoicesArrayList.add(i);
            }

            // find and remove user input
            int indexOfUserPlay = allChoicesArrayList.indexOf(userInput);
            try {
                allChoicesArrayList.remove(indexOfUserPlay);
            } catch (Exception e) {
                System.out.println("something went wrong");
            }

            // shuffle the list --- deprecated
            //Collections.shuffle(allChoicesArrayList);

            //new array
            allChoicesArrayList = createNewArray.createNewArray(allChoicesArrayList, indexOfUserPlay);

            //the computer makes a pick
            String[] userChoicesArray = new String[allChoicesArrayList.size()];
            userChoicesArray = allChoicesArrayList.toArray(userChoicesArray);
            computerChoice = computerPicksOption(userChoicesArray, allChoicesArrayList.size());
            int computerChoiceIndex = allChoicesArrayList.indexOf(computerChoice);

            // evaluate score
            result = playNonTradiGame.playNonTradiGame(computerChoice, userInput, computerChoiceIndex, allChoicesArrayList);

        }


        // print results ----
        printResult(result, computerChoice, userScore);
        return result;
    };

}
