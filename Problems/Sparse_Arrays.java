package Problems;

import java.util.*;

/*
Description
Given a List of strings and query strings determine how many times each query string occurs in the input strings.

Example:
    Input:
        List<String> strings = List.of("def", "baba", "de","fgh");
        List<String> queries = List.of("de", "lmn", "fgh");
    
    Output:
        results = [2,1,0]
        *must be an array of the times occured starting at the first query string.

    

*/

public class Sparse_Arrays {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i< queries.size(); i++){
            int x = 0;
            for(int j = 0; j < strings.size(); j++){
                
                if(queries.get(i).equals(strings.get(j))){ //HackerRank won't accept queries.get(i) == strings.get(j) but VSCODE will.
                    x++;   
                    
                }
                
            }

            arr.add(x);
        }
        
        return arr;
    }


    //create a new List for the results. 
    //For every loop through the query input, check each string to see if there is a match. If there is a match iterate the x value.
    //add the x value to our results list.
    // *** I think this could be done faster(with one less for loop) by using a hash map. Most likely, I will revisit this problem in the future and improve this solution. 


    public static void main(String[] args){
        List<String> strings = List.of("def", "baba", "de","fgh");
        List<String> queries = List.of("de", "lmn", "fgh");
        System.out.print(matchingStrings(strings, queries));
    }


}

