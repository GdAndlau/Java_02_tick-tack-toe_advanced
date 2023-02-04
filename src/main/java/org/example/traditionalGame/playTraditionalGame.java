package org.example.traditionalGame;

public class playTraditionalGame {
    String concatAnswer = "";

    public playTraditionalGame(String concatAnswer){
        this.concatAnswer = concatAnswer;
    }

    public static int playTraditionalGame(String concatAnswer){
        int result;
        switch(concatAnswer){
            case "rock scissors":
            case "paper rock":
            case "scissors paper":
                result = 1;
                break;
            case "scissors rock":
            case "rock paper":
            case "paper scissors":
                result = 3;
                break;
            case "scissors scissors":
            case "rock rock":
            case "paper paper":
                result = 2;
                break;
            case "!rating":
                result = 5;
                break;
            case "!exit":
                result = 0;
                break;
            default:
                result = 4;
                break;
        }
        return result;
    }

}
