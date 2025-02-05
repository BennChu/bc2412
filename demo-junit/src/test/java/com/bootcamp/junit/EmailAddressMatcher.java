package com.bootcamp.junit;

import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.mockito.internal.verification.Description;

public class EmailAddressMatcher extends TypeSafeMatcher<String> { //<String> match with below (String)

    //寫 static method 包裝
    //public static 

    //String Regular Expression = the rule of String
    //example 對 email
    @Override
    public boolean matchesSafely(String email) {
        return email.matches("[a-zA-Z0-9]+@[a-z]+.com");//"[A-Z]+1"
        //a-z allows lowercase letters
        //A-Z allows uppercase letters
        //0-9 allows digits
        //[a-zA-Z0-9]+@[a-zA-Z0-9]+\.(com|net|org)
    }

    @Override
    public void describeTo(Description description) { //pass by reference
        description.appendText("Contain Uppercase Only!!");
    }

    
}
