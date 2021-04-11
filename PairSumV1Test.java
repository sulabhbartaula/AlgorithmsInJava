package com.sulabh;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PairSumV1Test {

    @Test
    void testArray1(){
        boolean result = PairSumV1.hasPairSum(new int[]{4, 5, 1, -3, 6},11);
        assertEquals(true,result);

    }
    @Test
    void testArray2(){
        boolean result = PairSumV1.hasPairSum(new int[]{4, 5, 1, -3, 6},-2);
        assertEquals(true,result);

    }
    @Test
    void testArray3(){
        boolean result = PairSumV1.hasPairSum(new int[]{4, 5, 1, -3, 6},8);
        assertEquals(false,result);

    }

}
