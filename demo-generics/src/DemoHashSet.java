import java.util.HashSet;

public class DemoHashSet {

    public static void main(String[] args) {
        

        HashSet<String> strings = new HashSet<>();
        strings.add("ABC");
        strings.add("IJK");
        System.out.println("before " + strings.size());
        
        strings.add("ABC");//add 會 return true or false, repeat will false
        System.out.println(strings.add("ABC")); //add 時有問題, 重複係 add 唔到
                                                //return false, 加唔到, 係 HashSet 特色
                                                //search first, if already have the same item, then exit, do not add

        System.out.println("after " + strings.size());//return 2
                                                      //HashSet avoid duplicate item
                                                      //strings 作者寫 equals() 係 check value not object reference
        strings.add("XYZ");
        System.out.println(strings.size());//3, can add

        strings.remove(new String("XYZ"));//remove, return true false
        System.out.println(strings.size());//2, strings 作者寫 equals() 係 check value not object reference

        //HashSet strings no remove by index function
        //HashSet 底層唔係 array
        //ArrayList has remove by index
        //strings.remove


        //HashSet cannot be ordering natually
        //because its underlying data structure is not an array
        
        //so, hashset did not provide remove by index method
        // int targetRemoveIndex = 1;
        // String targetRemoveString = null;
        // int index = 0;

        // for (String s : strings) {
        //     if (targetRemoveIndex == index) {
        //         targetRemoveString = s;
        //         break;
        //     }
        //     index++;
        // }
        // strings.remove(targetRemoveString);
    }
    
}
