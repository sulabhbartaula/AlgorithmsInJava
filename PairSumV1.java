/*

Description

Given an array of integers arr and an integer k,
create a boolean function that checks if there exists two elements in arr
such that we get k when we add them together.
 */

package com.sulabh;

import java.util.Arrays;

public class PairSumV1 {

    public static boolean hasPairSum(int[] arr, int key) {
        //sort the given array
        //time complexity is O(n logn)
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        //traverse through each element of array
        //time complexity is O(n)
        while(left < right){
            if(arr[left] + arr[right] == key){
                return true;
            }
            else if(arr[left] + arr[right] < key){
                left++;
            }else{
                right--;
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
