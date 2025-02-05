package com.bootcamp.junit;

import static org.junit.jupiter.api.Assertions.*;
import static java.util.regex.Matcher.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matchers.*;//greaterThan
import static org.hamcrest.MatcherAssert.*;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HamcrestTest {

    @Test
    void testBasic() {

        assertThat(Calculator.sum(1, 2), is(equalTo(3)));
        assertThat(10, is(greaterThan(9)));
        assertThat("Hello World", containsString("Hello"));
        
    }

    //List
    @Test
    void testList() {
        List<String> names = Arrays.asList("John", "Steven", "Vincent");
        //before need for loop
        //only check single item
        assertThat(names, hasItem("Steven"));

        //assertThat(names, hasItem("Vincent", "John"));
        //only check single item

        //會 fail, 會對 order, 可以 check 埋 order
        //order not same as List names  
        assertThat(names, contains("John", "Vincent", "Steven"));
        assertThat(names, containsInAnyOrder("John", "Vincent", "Steven"));
    }


    @Test
    void testNumber() {
        double tolerance = 0.01d;
        
    }

    void testInstance() {
        //Check Child Object vs Parent Object
        Number num = new Double("3.0");

        //Check Child Class vs Parent Class, 迫佢 extend
        assertThat(Long.class, typeCompatibleWith(Number.class));
    }
}
