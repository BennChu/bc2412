package com.bootcamp.junit;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

//mvn compile: compile main code
//mvn testCompile: "mvn compile" + compile test code
//mvn test: "mvn testCompile" + run all test cases
//mvn package: "mvn test" + package jar
//mvn install: "mvn package" + install jar to m2
//我地要 .jar not .class

//Regression Test (for day 2 enhancement)
//TDD (test case first) -> rapidly define all test cases without main code
//mvn test -> locate "@Test" annotation
//Maven create test object to invoke testSum()

public class CalculatorTest {
    //寫 test cases, java 都係冇
    //Unit test = Requires a framework to compare the actual & expected result
    //Definition of PASS
    @Test//
    void testSum() {
        //TC1: 1 + 2 = 3
        //TC2: -1 + 3 = 2
        //TC3: 0 + 0 = 0
        //before 3, after 4
        Assertions.assertEquals(4, Calculator.sum(1,2));
        //if actual result != expected result, maven throw error
        //so that you cannot pass through the "test" cycle
        //after 3, before 2
        Assertions.assertEquals(3, Calculator.sum(-1,3));
        //after 1, before 0
        Assertions.assertEquals(1, Calculator.sum(0,0));
        
        //bcoz imported static Assertions
        assertEquals(1, Calculator.sum(0,0));
    }

    // @Test
    // void testSum2() {
    //     Assertions.assertEquals(-5, Calculator.sum(-1,-4));
    // }

    // public static void main(String[] args) {
    //     CalculatorTest ct = new CalculatorTest();
    //     ct.testSum();
    // }

    //Mockito
    @Test
    void testMethodB() {
        //before 23, after 24
        Assertions.assertEquals(24, Calculator.methodB(7));
    }
    
}
