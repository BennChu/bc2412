import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class DemoLambda {

    public static void main(String[] args) {
        
        //java Lambda expression -> Stream, Optional
        //2014 java 8 提升
        
        //java Built-in Lambda Functions
        // y = f(x), input -> output

        //define function
        //definition 係 runtime
        //s (input) -> s.length() (output)
        //係 runtime call一次, runtime program, after java 8 可以做
        //將 method 既野變成 runtime 寫


        //public interface Function<T, R> {
        //    R apply(T t);

        //Function is an interface with 1 input, 1 output
        //stringLength is a variable holds a reference to an instance of a Function object
        //return Integer s.length
        //use apply()
        //traditional method need to create class eg. StringLengthFunction.java
        Function<String, Integer> stringLength = s -> s.length(); //skip return keyword
        System.out.println(stringLength.apply("Hello"));//5

        stringLength = s -> s.length() + 10;

        
        //2 個入口, or 多個入口, 出口得一個
        //Input (String & String)
        //Output (Integer)
        //apply()
        BiFunction<String, String, Integer> totalLength =
            (s1, s2) -> s1.length() + s2.length(); //skip return keyword

        System.out.println(totalLength.apply("oscar", "lucas"));//10


        //SuperFunction (Interface), 3 input 1 output
        SuperFunction<Integer, Integer, Integer, Integer> multiply = (x1, x2, x3) -> x1 * x2 * x3;
        System.out.println(multiply.apply(1,2,3));//6


        SuperFunction<Double, Double, Double, Double> addition1 = (x1, x2, x3) -> x1 + x2 + x3;
        System.out.println(addition1.apply(0.3,0.1,0.0));//0.4


        //3 inputs (Double), 1 output (Double)
        //計除數
        //無理由 user 入 BigDecimal, 所以入 Double
        //自己 coding 做 BigDecimal
        SuperFunction<Double, Double, Double, Double> division = (x1, x2, x3) -> {
            Double result = BigDecimal.valueOf(x1).divide(BigDecimal.valueOf(x2))
                                                .multiply(BigDecimal.valueOf(x3))
                                                .doubleValue();
            return result;
        };

        //SuperFunction<Integer[], Integer[], int[], int[]> arr = (x1[], x2[], x3[]) -> 

        //before the constructor was private, i change it to public
        Person p1 = new Person("Vincent", 18);

        SuperFunction<Person, Person, Person, String> personDetails = (x1, x2, x3) -> x1.getName() + x2.getAge() + x3.getAge();
        System.out.println(personDetails.apply(p1,p1,p1)); 


        //3 inputs (String), 1 output (Integer)
        //use apply()
        SuperFunction<String, String, String, Integer> formula = (s1, s2, s3) -> {
            int result = s1.length() + s2.length() + s3.length();
            return result;
        };
        System.out.println(formula.apply("abc", "", "ppp"));//6



        //1 input, 0 output
        //Consumer.class 係 interface
        //用 accept();
        //java 8 build-in
        Consumer<String> printString = s -> System.out.println("The String is " + s);
        printString.accept("hello");
        


        //0 input, 1 output
        //Supplier.class, 係 interface
        //要放 wrapper class Integer
        //java 8 build in
        //都係 new
        //用 get()
        Supplier<Integer> randomMarkSix = () -> new Random().nextInt(49) + 1;
        System.out.println(randomMarkSix.get());


        //Custom FunctionInterface Swimable
        //java before 8: interface -> class -> object
        //java after 8: interface -> object
        Swimable lucas = () -> System.out.println("Lucas is swimming");
        lucas.swim();//lucas is swimming


        //Lambda assumption: has FunctionalInterface -> one method only -> lambda expression

        //MathOperation
        MathOperation addition = (x , y) -> x + y;
        MathOperation subtract = (x , y) -> x - y;

        System.out.println(addition.operate(1,2));//3
        System.out.println(subtract.operate(1,2));//-1


        List<Book> books = new ArrayList<>();
        books.add(new Book(1));
        books.add(new Book(3));
        books.add(new Book(10));
        books.add(new Book(12));

        //for each loop to print book id
        for (Book book : books) {
            System.out.println(book.getId());
        }

        //Lambda expression for each loop to print book id
        //b 呢個位, 寫 book 都得, 只係一個名
        //books -> List 的 books
        //forEach -> for each loop
        //b -> variable
        books.forEach(b -> System.out.println(b.getId()));
        books.forEach(book -> System.out.println(book.getId()));

        //Lambda expression Lambda for each loop
        //if coding more than 1 line
        books.forEach(b -> {
            String message = "hello";
            System.out.println(b.getId() + " " + message);
        });



        Map<String, String> fruitMap = new HashMap<>();
        fruitMap.put("orange", "abc");
        fruitMap.put("apple", "def");

        //
        fruitMap.forEach((key, value) -> {

            System.out.println("Key=" + key + ", " + "value=" + value);

        });

        //Predicate is a interface
        //x>8 -> boolean
        // x -> x > 8 -> Predicate

        int x1 = -1;
        boolean isLargerThanEight = x1 > 8;//false


        //Predicate is an interface with 1 input, boolean output
        //use test()
        Predicate<Integer> isLargerThan8 = x -> x > 8;
        System.out.println(isLargerThan8.test(9));//true
        System.out.println(isLargerThan8.test(8));//false

        //check if the integer is even number
        Predicate<Integer> isEvenNumber = x -> x % 2 == 0;
        System.out.println(isLargerThan8.and(isEvenNumber).test(10));//true
        System.out.println(isLargerThan8.or(isEvenNumber).test(9));//true

        System.out.println(books.size());
        //removeIf()
        books.removeIf(book -> book.getId() % 2 == 0);
        //System.out.p
books.

        //2 inputs, 1 output
        BiFunction<String, String, String> appendHello = (oldV, newV) -> oldV + newV;
        fruitMap.merge("lemon", "xyz", appendHello);
        fruitMap.merge("apple", "mno", appendHello);
        fruitMap.merge("orange", "yyy", appendHello);
        fruitMap.merge("grape", "xxx", appendHello);
        
        System.out.println(fruitMap);
        //{orange=Hello, apple=Hello, lemon=xyz}
        //{orange=abcyyy, apple=defmno, lemon=xyz}
        //{orange=abcyyy, apple=defmno, lemon=xyz, grape=xxx}


        //UnaryOperator<String> -> Function<String, String>
        //apply()
        UnaryOperator<String> toUpperCase = s -> s.toUpperCase();
        System.out.println(toUpperCase.apply("Hello"));//HELLO


        UnaryOperator<String> transform = s -> {

            if (s.length() > 5){
                return s.substring(0,5);
            } else {
                if (s.startsWith("a")) {
                    return "Wrong string.";
                }
                return s;
            }

        };
        System.out.println(transform.apply("abcdef"));//abcde, 因為 length>5, 所以 return substring(0,5), end index is 5-1
        System.out.println(transform.apply("abc"));//Wrong string. 因為step 1. 不是長過 5, step 2.是 startsWith "a", so return Wrong string
        System.out.println(transform.apply("bbbc"));//bbbc, 因為不是長過5, 又不是 startsWith "a", so return bbbc


    }//end main


    public static class Book {
        private int id;
        
        public Book(int id) {
            this.id = id;
        }

        public int getId() {
            return this.id;
        }
    }






    
    //有 input, 無 output
    //Similar to Consumer.class
    public static void printString(String s) {
        System.out.println("The String is " + s);
    }

    //有 output, 冇 input
    //similar to Supplier.class
    public static int randomMarkSix() {
        return new Random().nextInt(49) + 1; //1-49
    }


    //method 都可以做到, 工能一樣
    //similar to Function.class
    public static Integer stringLength(String s) {
        return s.length();
    }
    
}
