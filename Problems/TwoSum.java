import java.util.*;


/*
leetcode question

Description

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example:
    Input: 
        nums = [2,7,11,15], target = 9

    
    Output: 
        [0,1]

*/



public class TwoSum {

    

    public static int[] twoSum(int[] nums, int target){

        //This is the O(n) solution using a hashmap
        //The O(n^2) solution is obvious so I moved on trying to make it more efficient. 


        Map<Integer, Integer> H = new HashMap<>();
        int[] ans = new int[2];
        


        for(int i = 0; i<nums.length; i++){
            int com = target - nums[i];
            //this is to move the current index to the front of the array, to match the expected output but it will be accepted at index 0
            ans[1] = i;
            if(H.get(com) != null){
                ans[0] = H.get(com);
                break;

            }

            H.put(nums[i], i);
        }
        
        return ans;

    }


    public static void main(String[] args){

        int[] nums = {1, 3, 5, 4, 8, 9};
        int target = 7;

        int[] ans = twoSum(nums, target);

        System.out.println("(" + ans[0] + "," + ans[1] + ")");


    }
    
}
