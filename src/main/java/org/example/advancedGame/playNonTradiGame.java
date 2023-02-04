package org.example.advancedGame;

import java.util.ArrayList;
import java.util.List;

public class playNonTradiGame {
    public playNonTradiGame(String computerChoice, String userInput, int computerChoiceIndex, ArrayList<String> allChoicesArrayList) {

    }

    public static int playNonTradiGame(String computerChoice, String userInput, int computerChoiceIndex, List allChoicesArrayList){
        int result = 0;
        // evaluate score
        if(computerChoice.equals(userInput)){
            result = 2;
        } else if(computerChoiceIndex >= (allChoicesArrayList.size() / 2)){
            result = 3;
        } else if (computerChoiceIndex < (allChoicesArrayList.size() / 2)) {
            result = 1;
        }

        return result;
    }

}
