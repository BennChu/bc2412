package com.bootcamp.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//write class also ok, no need public
//public 
class StaffTest {
    @Test
    void testStaff_GetterSetter() {
        Staff s1 = new Staff();
        Assertions.assertEquals(0, s1.getAge());
        s1.setAge(18);
        Assertions.assertEquals(18, s1.getAge());
        
    }

    @Test
    void testStaff_Constructor() {
        Staff s = new Staff("John", 19);
        Assertions.assertEquals("John", s.getName());
        Assertions.assertEquals(19, s.getAge());
    }

    // @Test
    // void testStaffEqual() {
    //     Staff s1 = new Staff("Steven", 30);
    //     Staff s2 = new Staff("Steven", 30);
    //     Assertions.assertEquals(s1, s2);//想佢地係 equal 同一個人
    // }
    
}
