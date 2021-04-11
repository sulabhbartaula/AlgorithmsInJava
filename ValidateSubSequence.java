package com.sulabh;

public class ValidateSubSequence {

    public static void main(String[] args) {

        int mainArray[] = {5,1,22,25,6,-1,8,10};
        int subArray[] = {1,6,-1,10};

        boolean result = validateSubSequence(mainArray,subArray);

        if(result){
            System.out.println("Yes it is sub-sequence");
        }else{
            System.out.println("No not a sub-sequence");
        }
    }

    private static boolean validateSubSequence(int[] mainArray, int[] subArray) {

        int mainArrayIndex = 0;
        int subArrayIndex = 0;

        while (mainArrayIndex < mainArray.length && subArrayIndex < subArray.length){

            if(mainArray[mainArrayIndex] == subArray[subArrayIndex]){
                subArrayIndex++;
            }

            mainArrayIndex++;
        }

        return subArrayIndex == subArray.length - 1;
    }
}
