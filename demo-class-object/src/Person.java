import java.util.Arrays;

public class Person { //冇 s , 唔可以 Persons
                      //blueprint 設計圖  / 說明書, 用一個 blueprint 可以生產好多野
                      //example 月餅模, 一個模可以生產好多次, 月餅模唔係月餅
                      //class 係個 file 寫係 harddisk, 可以 delete
                      //object 係有生命
 
    //attributes 特徵
    private String name;
    private int age;
    private String email;
    private char gender; //F/M


    //constructor, not method, no return type, 如何用一個人, 唔需要 return
    //constructor is to create object
    //now 3 paras, so 唔可以入2個
    //做箱放 data
    public Person(String name, int age, String email, char gender){

        this.name = name;   //create object 時, this 係個 object 個名
        this.age = age;
        this.email = email;
        this.gender = gender;

    }

    public int getNameLength(){

        return;
    }



    public boolean isMale(){

        return this.gender=='M' ? true : false;
    }


    //usually 幾多 attributor 有幾多 getter
    //係一個攞野既 method, 有 return 就係 method 
    //有個工具
    //instance method is able to return its object value
    //getter (instance = object)
    public String getName(){
        return this.name; //this 係 object 自己的 name
    }

    public int getAge(){
        return this.age;
    }

    public String getEmail(){
        return this.email;
    }


    //setter
    //set 野, 改野, 冇野 return
    //void , means nothing return, return nothing
    public void setAge(int age){
        this.age = age;
    }


    public void setName(String name){
        this.name = name;
    }


    public static main(String[] args){

        Person p1 = new Person("Jimmy", 5, "jimmy@gmail.com", 'M');
        System.out.println(p1.getName().getLength());
        System.out.println(p1.getNameLength());
    }





}
