import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DemoPQ {


    public static class Person implements Comparable<Person> {

        private int age;

        public Person(int age) {
            this.age = age;
        }

        public int getAge() {
            return this.age;
        }

        @Override
        public String toString() {
            return "["
                    + this.age
                    + "]";
        }


    }


   

    public static void main(String[] args) {

        //Queue 入黎就排隊

        //可以自己安排次序
        //放果時冇 ordering
        //每次 add 左之後都 sort, 會好慢
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Vincent");
        System.out.println(pq);//[Vincent]
        pq.add("Oscar");
        System.out.println(pq);//[Oscar, Vincent]
        pq.add("Lucas");
        System.out.println(pq.size());//[Lucas, Vincent, Oscar]
        System.out.println(pq);

        //for poll(), ordering -> String natural order
        //poll 先排序
        System.out.println(pq.poll());//Lucas
        System.out.println(pq.poll());//Oscar
        System.out.println(pq.poll());//Vincent


        //poll 大年紀先
        PriorityQueue<Person> pq2 = new PriorityQueue<>(new SortByAge());
        Person p1 = new Person(55);
        Person p2 = new Person(65);
        Person p3 = new Person(70);

        pq2.add(p1);
        pq2.add(p2);
        pq2.add(p3);

        System.out.println(pq2);//[[70], [55], [65]]
        System.out.println(pq2.poll());//70
        System.out.println(pq2.poll());//65
        System.out.println(pq2.poll());//60

        //Comparator<Person> sortFormula = new SortByAge();
        // Collections.sort(pq2, sortFormula);

    }
    
}
