/**
 * @author
 * @since
 * @version
 */

public class Person {

    private String name;
    private int age;


    //change public to private, force ppl to use builder
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * static method
     */
    //return type is Builder, 做一個新 Builder
    public static Builder builder() {

        return new Builder();
    }


    /**
     * static class
     */
    public static class Builder {
        private String name;
        private int age;


        //old, public void setName
        //similer to setter but return this
        public Builder name(String name) { 
            this.name = name;
            return this;
        }


        //similer to setter but return this
        public Builder age(int age) {
            this.age = age;
            return this;
        }


         //the return type is Person, new 一個 Person
         public Person build() {
            return new Person(this.name, this.age);
        }

    }




    public static void main(String[] args) {
        
        Person p1 = new Person("Vincent" , 18);
        
        //Advantages
        //1. no longer need to pass null for those unnecessary attribute
        //2. if there are many attribute (ie 20+ string), you have to manually check if the value
        //    passed to the right parameters
        //no need to follow order
        Person p2 = Person.builder()
                    .name("Vincent")
                    .age(18)
                    .build();

        Person p3 = Person.builder()
                    .age(18)
                    .name("Oscar")
                    .build();

        System.out.println(p2.getName());
    }
}
