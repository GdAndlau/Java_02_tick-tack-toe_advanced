package org.example.commomMethods;

public class checkOption {
    public static int checkOption(String userChoices){
        int option;
        if (userChoices.equals("") || userChoices.equals(" ")){
            option = 1;
        } else {
            option = 2;
        }
        return option;
    }

}
