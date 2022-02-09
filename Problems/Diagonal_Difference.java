package Problems;

import java.io.*;
import java.math.*;
import java.util.*;




/* 

Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix

1 2 3
4 5 6
9 8 9  

The left-to-right diagonal =  1 + 5 + 9 = 15
The right to left diagonal = 3 + 5 + 9 = 17
Their absolute difference is |15-17| = 2
 */

public class Diagonal_Difference {

    public static int diagonalDifference(List<List<Integer>> arr){
        
        int r_to_l = 0;
        int l_to_r = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        int l = arr.size() - 1;
        
        int rows = arr.size();
        int columns = arr.get(0).size();
        
        while(i < rows && j < columns && k < rows && l >= 0) {
            r_to_l += arr.get(i).get(j);
            l_to_r += arr.get(k).get(l);
            
            
            i++;
            j++;
            k++;
            l--;
            
        }
        
        return Math.abs(r_to_l - l_to_r);
        
        
    

    }



    public static void main(String[] args){
        List<List<Integer>> arr = List.of(List.of(11,2,4), List.of(4,5,6), List.of(10,8,-12));
        System.out.println(diagonalDifference(arr));

        
        

    }

}

