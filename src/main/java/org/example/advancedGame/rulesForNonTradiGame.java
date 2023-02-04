package org.example.advancedGame;

public class rulesForNonTradiGame {
    public static int rulesForNonTradiGame(String userInput){
        int result = 0;
        if(userInput.equals("!rating")){
            result = 5;
        } else if(userInput.equals("!exit")) {
            result = 0;
        } else {
            System.out.println("You need to keep to the values you inputed");
        }
        return result;
    }

}
