/*

Description

Given an array of integers arr and an integer k,
create a boolean function that checks if there exists two elements in arr
such that we get k when we add them together.
 */

package com.sulabh;

import java.util.HashMap;

public class PairSumHashMap {

    public static boolean hasPairSum(int[] arr, int key) {

        HashMap<Integer, Boolean> visited = new HashMap<Integer,Boolean>();

        //time complexity of traversing through array is O(N)
        for(int element : arr){
            if(visited.containsKey(key - element)){
                return true;
            }else{
                visited.put(element,true);
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{4, 5, 1, -3, 6};
        int key = 8;

        boolean result = hasPairSum(arr,key);
        System.out.println(result);

    }
}
