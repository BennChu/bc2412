public class DemoInnerClass {//outer class

    private int x;//instance variable

    private static int z = 100;

    //setter
    public void setX(int x) {
        this.x = x;
    }

    //instance method
    public void print() {
        //System.out.println(y);//outer class cannot read the inner class object attribute
        System.out.println("Outer.print(): x= " + this.x);

        //寫 syntax 可能性, 唔係建議你咁寫
        //local class, only for print() to use
        class Cat {
            private int age;
            
            public Cat(int age) {
                this.age = age;
            }

            public int getAge() {
                return this.age;
            }
        }
        Cat cat = new Cat(10);// 呢句先會生產 object
        System.out.println("cat age " + cat.getAge() + " this is instance method calling static variable " + z);



    }
   
    //同 object 無關既 叫佢
    //has static, called static nested class
    //get read outer class static variable
    public static class Library {
        public void print3() {
            System.out.println("this is from a method inside public static class Library " + z);
        }

    }


    //static nested class
    public static class Builder {

    }


    public class Student {//無 static 叫 inner class, can read outter class instance and static attribute

        private int y;//even if public, outer class still cannot get it

        //this is an instance method inside class Student
        public void print() {
            System.out.println("Student.print(): x= " + x + ", y= " + this.y + "," + z);
            //this.x cannot, Student 冇自己 x 
            //super.x cannot, 冇 parent x
        
        }

        public void setY(int y) {
            this.y = y;
        }

    }

    public static void main(String[] args) {
        
        DemoInnerClass.Library library = new DemoInnerClass.Library();

        //開左一隻 object, 再開一隻 object
        //兩隻都有地址
        //not parent child relationship
        DemoInnerClass dic = new DemoInnerClass();
        DemoInnerClass.Student student = dic.new Student();

        //same
        //DemoInnerClass.Student student = new DemoInnerClass().new Student();
   
        
        dic.setX(10);       
        student.setY(20);

        dic.print();
        student.print();

        //like turning on the light (calling a method). You need an object of the room to interact with it.
        DemoInnerClass.Library nested = new DemoInnerClass.Library();
        nested.print3();//this is from a method inside public static class Library 100

        //this writing cannot
        // DemoInnerClass nested1 = new DemoInnerClass();
        // DemoInnerClass.Library nested2 = nested1.new Library();
        // nested2.print3();
   

        //Anonymous Inner Class (Before java 8)
        //都唔使開 class
        Swimable person = new Swimable() {
            int count = 0;
            @Override
            public void swim() {
                this.count++;
                System.out.println("Anonymous Object");
            }

            // public int getCount() {
            //     return this.count;
            // }
       
       
        };



   
    }





    //can static, 自己用
    
    @FunctionalInterface
    public static interface Swimable {
        void swim();
    }
    
}
