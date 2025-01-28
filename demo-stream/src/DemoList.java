import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoList {

    public static void main(String[] args) {
        


        //new ArrayList<>(), can read/ add/ remove/ modify
        //List.of()
        //Arrays.asList


        //able to read/ add/ remove/ modify
        List<String> strings1 = new ArrayList<>();
        strings1.add("ABC");
        strings1.add("DEF");
        System.out.println(strings1);//[ABC, DEF]


        List<String> strings2 = new ArrayList<>(Arrays.asList("ABC", "DEF"));
        System.out.println(strings2.get(0));//ABC
        strings2.add("IJK");//return true
        strings2.add("");
        strings2.add(null);
        if (strings2.remove("DEF")) {//remove the frist occurrence, return true
            System.out.println("DEF is removed");
        }
        System.out.println(strings2);
        strings2.set(0, "XYZ");//can modify
        System.out.println(strings2);//[XYZ, IJK, , null]
        

        //CANNOT add and remove, can read and modify element only
        //array final 左, 長短不能改
        //runtime checker
        //List<String> strings3 = Arrays.asList("ABC", "DEF", "IJK");
        //strings3.add("XYZ");//java.lang.UnsupportedOperationException
        //strings3.remove("IJK");//java.lang.UnsupportedOperationException:

        //List.of()
        //Can read only
        List<String> strings4 = List.of("ABC", "DEF", "IJK");
        // strings4.add("XYZ"); // java.lang.UnsupportedOperationException
        // strings4.remove("ABC"); // java.lang.UnsupportedOperationException
        // strings4.set(0, "LLL"); // java.lang.UnsupportedOperationException
        System.out.println(strings4.get(2)); // IJK

    }
    
}
