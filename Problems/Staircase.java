package Problems;

import java.io.*;
import java.util.*;
import java.math.*;


/*
Function Description
The input will take an integer n, and the output will be a staircase with the n levels. The base and height of the pyramid will equal n, drawn using # symbols and spaces. 

EXAMPLE:
input = 4
Staircase:
   #
  ##
 ###
####
 */



public class Staircase {

    public static void StaircaseSolver(int n){
        
        // n = 4
        //_ _ _ #  spaces = 3 sym = 1
        //_ _ # #  spaces = 2 sym = 2
        //_ # # #  spaces = 1 sym = 3
        //# # # #  spaces = 0 sym = 4
        //
        //sym - spaces = n
        //
        //
        

       for(int numSymbols = 1; numSymbols <= n; numSymbols++){
           int numSpaces = n - numSymbols;
            for(int i = 0; i < numSpaces; i++){
                System.out.print(" ");
            }
            for(int i = 0; i < numSymbols; i++){
                System.out.print("#");

            }
            System.out.println("");
                
       }



    }

    public static void main(String[] args){
        int n = 6;

        StaircaseSolver(n);

    }


}




    




