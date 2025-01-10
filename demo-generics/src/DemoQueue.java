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
        Queue<String> strings = new LinkedList<>();

        strings.add("Oscar");//add last
        strings.add("Vincent");//add last
        strings.add("Lucas");//add last
        System.out.println(strings);//有序, 但 LinkedList 狀態


        String head = strings.poll();//remove the first, is null if queue is empty
        System.out.println(head);
        System.out.println(strings);


        //Queue Interface hidden lots of funtions of LinkedList
        strings.remove();//similar to poll()


        System.out.println(strings.contains("Lucas"));//true, is for loop


        //lookup the head element, not pick up
        System.out.println(strings.peek());//Lucas
        System.out.println(strings.size());//1

        strings.offer("Jenny");

        //開箱即用 (工具), 睇你識唔識
        Queue<String> qq = new ArrayBlockingQueue<>(3);//知道長度一定係3, fixed length queue
        System.out.println(qq.offer("ABC"));//true
        System.out.println(qq.offer("ABC"));//true
        System.out.println(qq.offer("ABC"));//true
        System.out.println(qq.offer("ABC"));//false

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
