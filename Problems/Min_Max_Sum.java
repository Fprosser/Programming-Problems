package Problems;

import java.util.*;
import java.io.*;
import java.math.*;

/*
Description

Given fice positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective min and max values as a single line of two space-separated integers.

Example:
Input
arr = [1,3,5,7,9]

min sum is 1 + 3 + 5 + 7 = 16
max sum is 3 + 5 + 7 + 9 = 24

Output

16 24
*/


public class Min_Max_Sum {
    public static void MinMax(List<Integer> arr){

        //Using long because Hackerrank wants to be cute and use gigantic ints and you will fail the majority of the test cases if you use int. 
        long min = 1;
        long max = 0;
        long sum = 0;

        if(arr.get(0) > arr.get(1)){
            min = arr.get(1);
            max = arr.get(0);
        } else {
            min = arr.get(0);
            max = arr.get(1);
        }
        

        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) > max){
                max = arr.get(i);

            } else if(arr.get(i) < min){
                min = arr.get(i);

                
            }
            sum+=arr.get(i);
        }


        long x = sum - min;
        long n = sum - max;

        System.out.print(n + " " + x);

        //Algorithm sets the min and max values as first two indexes, then searches the rest of the list for the min and max values. I concluded that the min value = Sum - max and the Max = Sum - min.
            





    }

    public static void main(String[] args){
        List<Integer> arr0 = List.of(1,3,5,7,9);
        List<Integer> arr1 = List.of(793810624,895642170,685903712,623789054,468592370);

        MinMax(arr0);

        

    

    }

    
}

