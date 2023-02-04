package org.example.commomMethods;

import java.util.Random;

public class computerPicksOption {
    public static String computerPicksOption(String[] values, int limit){
        Random ran = new Random();
        int nxt = ran.nextInt(limit);
        String robotInput = values[nxt];
        return robotInput;
    }

}
