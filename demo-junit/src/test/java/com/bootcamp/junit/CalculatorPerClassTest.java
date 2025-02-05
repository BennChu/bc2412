package com.bootcamp.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
//one test object to call all test cases
//@TestInstance(Lifecycle.PER_METHOD)
@TestMethodOrder(OrderAnnotation.class)
public class CalculatorPerClassTest {
    //Test Object
    private int x;//test env variable

    @BeforeAll//before all test cases
    void initAll() {
        System.out.println("Before All test case");
    }

    @AfterAll
    void afterAll() {
        System.out.println("After All test case");
    }

    @BeforeEach
    void reset() {
        System.out.println("Before each test case, reset something...");
    }

    @AfterEach
    void clear() {
        System.out.println("After each test case, clear something...");
    }

    @Test
    @Order(1)
    void testSum() {
        this.x += Calculator.sum2(1,2);
        assertEquals(3, this.x);
    }

    @Test
    @Order(2)
    void testSum2() {
        this.x += Calculator.sum2(1,2);
        assertEquals(3, this.x);
    }


    public static void main(String[] args) {
        
    }




}
