package com.bootcamp.junit;

import org.junit.jupiter.api.Assertions;
//可以 import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_METHOD)//by default
//One test Object to call all test cases
public class CalculatorPerMethodTest {
    
    //Test Object
    private int x;

    @Test
    void testSum() {
        this.x += Calculator.sum2(1, 2);
        Assertions.assertEquals(3, this.x);
        //assertEquals(3, this.x);
    }

    @Test
    void testSum2() {
        this.x += Calculator.sum2(1, 2);
        Assertions.assertEquals(3, this.x);
    }


    public static void main(String[] args) {
        CalculatorPerClassTest testObject = new CalculatorPerClassTest();
        testObject.testSum();

        

    }
}
