package org.example.commomMethods;

public class updateScore {
    public static int updateScore(int result){
        int addToScore;
        switch(result){
            case 1:
                addToScore = 0;
                break;
            case 2:
                addToScore = 50;
                break;
            case 3:
                addToScore = 100;
                break;
            default:
                addToScore = 0;
                break;
        }
        return addToScore;
    }

}
