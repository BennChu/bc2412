import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DemoDeque {

    public static void main(String[] args) {

        //a type of data structure
        //left 範圍 : right speed
        //有 add first add last
        //之前 FIFO, 宜家多左
        Deque<String> strings = new LinkedList<>();//ArrayDeque 底層係 array
        strings.add("Lucas");//add last
        strings.add("Vincent");
        strings.add("Oscar");
        strings.addFirst("Jenny");//打尖, 如要打尖, choose LinkedList

        System.out.println(strings);

        strings.poll();//poll Jenny
        strings.pollLast();//poll Oscar
        System.out.println(strings);//Lucas, Vincent

        System.out.println(strings.peek());
        System.out.println(strings.peekLast());

        //support for loop
        //support remove 
        //contains
        //size
        //isEmpty
        //offer
        //ArrayDeque

        //Parent control 範圍, child methods
        Queue<String> ss3 = null;

         int x = 3;
         if (x>2) {
            ss3 = new ArrayDeque<>();
         } else {
            ss3 = new LinkedList<>();
         }

         ss3.poll(); //different implementions -> peformance according to scenario

         Deque<String> ss2 = new ArrayDeque<>();
         ss2 = new LinkedList<>();
        //Deque has wider scope (ie add/remvoe/poll/peek first & last)
    }
    
}
