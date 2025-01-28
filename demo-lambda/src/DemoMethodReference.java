import java.util.Arrays;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class DemoMethodReference {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        numbers.forEach( e -> {
            System.out.println(e);
        });

        //it implies you won's change the values passing to method
        // + 10 加, 已經做唔到
        numbers.forEach(System.out::println);

        // Function<String, Integer> stringLength = s -> s.length();
        // <String, Integer> stringLength2 = 

        String s = "hello";
        //無可能性, 無參數, 就可以咁寫
        //:: 都係 lambda, 就可以寫 lambda
        //java 8 
        Supplier<Integer> stringLength = () -> s.length();
        Supplier<Integer> stringLength2 = s::length;

        //static method
        Function<String, Integer> stringToInteger = str -> Integer.valueOf(str);
        //Function<> Integer::valueOf;


    }
}
