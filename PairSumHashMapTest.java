package com.sulabh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PairSumHashMapTest {

    @Test
    void testArray1(){
        boolean result = PairSumHashMap.hasPairSum(new int[]{4, 5, 1, -3, 6},11);
        assertEquals(true,result);

    }
    @Test
    void testArray2(){
        boolean result = PairSumHashMap.hasPairSum(new int[]{4, 5, 1, -3, 6},-2);
        assertEquals(true,result);

    }
    @Test
    void testArray3(){
        boolean result = PairSumHashMap.hasPairSum(new int[]{4, 5, 1, -3, 6},8);
        assertEquals(false,result);

    }

}
