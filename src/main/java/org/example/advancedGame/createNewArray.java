package org.example.advancedGame;

import java.util.ArrayList;

public class createNewArray {
    public static ArrayList<String> createNewArray(ArrayList<String> allChoicesArrayList, int indexOfUserPlay){
        //First are the options that follow the chosen one in the original list;
        ArrayList<String> firstHalf = new ArrayList<String>(indexOfUserPlay);
        for (int i = 0; i < indexOfUserPlay; i++){
            firstHalf.add(allChoicesArrayList.get(i));
        }

        // then, there are the ones that precede it.
        ArrayList<String> secondHalf = new ArrayList<String>(allChoicesArrayList.size() - indexOfUserPlay);
        for (int i = indexOfUserPlay; i < allChoicesArrayList.size(); i++){
            secondHalf.add(allChoicesArrayList.get(i));
        }
        secondHalf.addAll(firstHalf);

        return secondHalf;

    }

}
