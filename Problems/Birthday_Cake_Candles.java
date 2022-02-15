package Problems;

import java.io.*;
import java.math.*;
import java.util.*;

/*
    Description: 
    You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age. They will only be able to blow out the tallest of the candles. Count how many candles are tallest.

    Example: 
    Input-

    candles = [1,3,2,1]

    Output-
    2





*/

public class Birthday_Cake_Candles {

    public static int birthdayCakeCandles(List<Integer> candles){
        int max = 0;
        int c = 0;
        for(int i = 0; i<= candles.size() -1; i++){
            
            if(max == candles.get(i)){
                c++;
            }
            
            if(max < candles.get(i)){
                max = candles.get(i);
                c = 1;
            }
            
            
            
            
        }
        return c;
    }
    

    public static void main(String[] args){
        List<Integer> arr = List.of(3,2,1,3);

        System.out.println(birthdayCakeCandles(arr));


    }

    

}
