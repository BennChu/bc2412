import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class DemoQueue {

    public static void main(String[] args) {

        //FIFO 排隊
        //Queue is Interface
        //儲存係 LinkedList 方法
        //Queue 封印 佢 LinkedList, 將佢技能收窄
        //Queue好少 method, LinkedList 好多 method
        //linkedList -> add/remove head/tail
        //阿媽 control Object 
        //LinkedList 都可以, 但 Queue 就精準, 可閱性
        //有序, 但 LinkedList 狀態
        Queue<String> strings = new LinkedList<>();

        strings.add("Oscar");//insert to the last of the queue
        strings.add("Vincent");////insert to the last of the queue
        strings.add("Lucas");////insert to the last of the queue
        System.out.println(strings);//[Oscar, Vincent, Lucas]


        String head = strings.poll();//return String, retrieve and remove the first of the queue, null if queue is empty
        System.out.println(head);//Oscar
        System.out.println(strings);//[Vincent, Lucas]


        //Queue Interface hidden lots of funtions of LinkedList
        strings.remove();//similar to poll()


        System.out.println(strings.contains("Lucas"));//true, is for loop


        //lookup the head element, not pick up
        System.out.println(strings.peek());//Lucas, retrieve but does not remove, the head of this queue
        System.out.println(strings.size());//1

        strings.offer("Jenny");

        //開箱即用 (工具), 睇你識唔識
        Queue<String> qq = new ArrayBlockingQueue<>(3);//知道長度一定係3, fixed length queue
        System.out.println(qq.offer("ABC"));//true
        System.out.println(qq.offer("ABC"));//true
        System.out.println(qq.offer("ABC"));//true
        System.out.println(qq.offer("ABC"));//false

        //all collection 都可以用
        //諗吓 data structure 先用
        //LinkedList and ArrayList can use
        for (String s : strings) {
            System.out.println(s); //Queue 都可以 for each loop
        }

        //contains, 都可以 for loop search

        //strings.clear()

        List<String> newStrings = new ArrayList<>();
        newStrings.add("AAA");
        newStrings.add("BBB");
        strings.addAll(newStrings);
        System.out.println(strings);

        


    }
    
}
