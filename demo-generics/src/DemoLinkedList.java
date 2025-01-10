import java.beans.DefaultPersistenceDelegate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
    

    public static void main(String[] args) {

        LinkedList<String> strings = new LinkedList<>();//LinkedList and ArrayList same family collection, so has .add .
        strings.add("ABC");
        strings.add("DEF");
        strings.add("XYZ");
        System.out.println(strings.size());//3
        System.out.println(strings);

        System.out.println(strings.get(1));

        strings.remove(1);//0 is index
        System.out.println(strings);//DEF, XYZ
        strings.add(1,"DEF");
        System.out.println(strings);

        strings.remove("ABC");//remove 第一個 match到
        System.out.println(strings);//DEF

        strings.add("Oscar");
        strings.add("Jenny");
        strings.remove();           //retrieve and remove the head, ArrayList no this method
        System.out.println(strings);//Oscar, Jenny

        System.out.println(strings.contains("Jenny"));//true, return boolean
        System.out.println(strings.contains("Vincent"));//false

        //tiger, pig , common eat(), same family
        //contains(), add(), remove()...(Object obj) are common method for ArrayList and LinkedList
        //same family under List

        System.out.println(strings.isEmpty());//false

        for (String s : strings) {
            System.out.println(s);
        }

        strings.clear();//clear strings, but the list still here
        System.out.println(strings.isEmpty());//true

        //polymorphim
        //開箱即用
        //List<Integer> ss = new ArrayList<>();
        List<Integer> ss = new LinkedList<>();
        ss.add(100);
        ss.add(1000);
        //because of Interface List, ss object can invoke add() at compile time
        //during runtime, we found the object is LinkedList, thd add() method will be the LinkedList
        //compile time 可以 invoke the add() method 因為阿媽有, 係 (List interface)
        //runtime 厡來係 LinkedList 既 mehtod
        //ss.remove() 唔可以 remove by head, 因為 List Interface doesnt contain remove()
        //唔打算 remove
        //call 既內容唔一樣
        //將 ss 變 LinkedList

        LinkedList<Integer> ss2 = (LinkedList<Integer>) ss;//ss and ss2 are references, 
        ss2.remove();


        List<Animal> animals = new ArrayList<>();
        animals.add(new Tiger());
        animals.add(new Panda());

        for (Animal animal : animals) {
            System.out.println(animal.run());
        }




    }
}
