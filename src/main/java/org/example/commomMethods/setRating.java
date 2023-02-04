package org.example.commomMethods;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class setRating {
    public static int setRating(String name){
        int userScore = 0;

        try {
            File myObj = new File("rating.txt");
            Scanner myReader = new Scanner(myObj);

            // get the name
            while(myReader.hasNext()){
                String line = myReader.nextLine();
                if(line.contains(name)){
                    String[] str = line.split(" ");
                    int number = Integer.parseInt(str[1]);
                    userScore += number;
                    break;
                }
            }}
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return userScore;
    }

}


