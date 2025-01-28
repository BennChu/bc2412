package com.bootcamp.lombok;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//JDK Java Development Kit = Dev Library/Tool (javac) + JRE + JVM
//Dev Lib -> eg javac, class Library (BigDecimal:java.math), StringBuilder(java.lang)
//1. some of the Library auto-imported by Java Project (ie java.lang)
//2. but some of them have to be manually import (ie. BigDecimal)
//3. Maven: download external (outside JDK) library from maven public (i.e. lombok framework)

//Lombok 提升開發 speed, 但冇提升 runtime

//how lombok get it work?
//Class level annotation
@Getter //can be field level
@Setter //can be field level
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode //what is extends
@Builder


public class Person {
    private String name;
    //@Getter onlny age has getter
    //一行都得 
    //@Getter private int age;

    //@ToString.Exclude
    private int age;




    public static void main(String[] args) {
        //BigDecimal needs import
        //BigDecimal bd = new BigDecimal("0");

        //no need import
        //StringBuilder sb = new StringBuilder();

        Person p1 = new Person();
        p1.setAge(20);
        p1.setName("Peter");

        Person p2 = new Person("Tommy", 10);
        System.out.println(p2.getAge());
        System.out.println(p2.getName());

        Person p3 = new Person("Tommy", 10);
        System.out.println(p2.equals(p3));//true
        System.out.println(p2.hashCode() == p3.hashCode());//true

        Person p4 = Person.builder().name("Tommy").age(10).build();
        System.out.println(p4);

    }

}
