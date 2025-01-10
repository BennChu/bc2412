import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DemoHashMap {

    //任何 class 內可以寫 class 只要係 static
    public static class Book {

        private int id;
        private String name;

        public Book(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        @Override
        public boolean equals(Object obj) {
            if(this == obj)
                return true;
            if (!(obj instanceof Book))
            return false;

            Book book = (Book) obj;
            return Objects.equals(this.name, book.getName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.name);
        }

        @Override
        public String toString() {
           return "["
               + "name = "
               + getName()
               + "]";
    }

    }




    public static void main(String[] args) {

        
        //儲 mapping
        
        
        //key and value
        HashMap<String, Integer> fruitMap = new HashMap<>();

        //put an entry to map
        //kep -> Apple
        fruitMap.put("Apple",1);
        fruitMap.put("Apple",3);

        //if the key is same (Apple), the entry will be replaced
        System.out.println(fruitMap);//Apple=3
        System.out.println(fruitMap.size());//1, entry count

        fruitMap.put("APPLE",3);
        System.out.println(fruitMap);//Apple=3, APPLE=3, 
        System.out.println(fruitMap.size());//2, entry count 
        //According to String.class equals() "Apple", "APPLE" are not same, String 作者決定大草細草話唔一樣

        //right side 好多 entry
        for (Map.Entry<String,Integer> entry : fruitMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue()); //Apple 3
        }

        
        //好多個 key -> strings
        // for (String Key : fruitMap.entrySet()) {
        //     System.out.println(Key);
        // }
        
        
        // for (Integer value : fruitMap.entrySet()) {
        //     System.out.println(value);
        // }
        
        
        
        //get value by key
        System.out.println(fruitMap.get("APPLE"));//3
        System.out.println(fruitMap.get("Apple"));//3

        //containsKey()
        System.out.println(fruitMap.containsKey("Apple"));//true, boolean





        if (fruitMap.containsKey("Apple")) {
            fruitMap.put("Apple", fruitMap.get("Apple") + 1);
        }

        Integer value = fruitMap.get("Apple");
        if (value != null) {
            fruitMap.put("Apple", value +1);
        }

        //find the entry of "Apple" and then +1 to the integer
        for (Map.Entry<String,Integer> entry : fruitMap.entrySet()) {
            if (entry.getKey().equals("Apple")) {
                entry.setValue(entry.getValue() + 1);
            }
        }


        for (Map.Entry<String,Integer> entry : fruitMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue()); //Apple 6, APPLE 3
        }

        //can we put null value to the entry
        fruitMap.put("ABC", null);
        System.out.println(fruitMap.size());//3


        //can we put null key to the entry
        fruitMap.put(null, 999);
        fruitMap.put(null, 1000);
        System.out.println(fruitMap);//null=1000, Apple=6, ABC=null, APPLE=3
        System.out.println(fruitMap.size());//4

        

        System.out.println(fruitMap.containsValue(1000));//true

        System.out.println(fruitMap.getOrDefault("Orange",0));//冇先會出 0
        System.out.println(fruitMap.getOrDefault("Apple",0));
        System.out.println(fruitMap.remove("APPLE"));//return the integer of the remove key


        fruitMap.clear();
        System.out.println(fruitMap.size());//0
        System.out.println(fruitMap.isEmpty());//true, map is here, but empty


        fruitMap.put("Cherry",fruitMap.getOrDefault("Cherry",0)+1);


        //put some books in map
        HashMap<Integer,Book> bookMap = new HashMap<>();
        //create books and put books into map
        //1 ABC
        //2 IJK
        //3 DEF
        //print Map size

        //Book class decide what is a book, id and name
        Book b1 = new Book(1, "ABC");
        Book b2 = new Book(2, "IJK");
        Book b3 = new Book(3, "DEF");
        

        bookMap.put(b1.getId(),b1);//(1, b1), not sure 1 is same as book id 1
        bookMap.put(b2.getId(),b2);
        bookMap.put(b3.getId(),b3);
        System.out.println(bookMap.size());//3


        //store the book count
        HashMap<Book, Integer> bookMap2 = new HashMap<>();
        //1 ABC
        //2 IJK
        //3 DEF
        //3 DEF
        Book b4 = new Book(1, "ABC");
        Book b5 = new Book(2, "IJK");
        Book b6 = new Book(3, "DEF");
        Book b7 = new Book(3, "DEF");

        bookMap2.put(b4, bookMap2.getOrDefault(b4,0)+1);
        bookMap2.put(b5, bookMap2.getOrDefault(b5,0)+1);
        bookMap2.put(b6, bookMap2.getOrDefault(b6,0)+1);
        bookMap2.put(b7, bookMap2.getOrDefault(b7,0)+1);


        System.out.println(bookMap2.size());//3 entry
        System.out.println(bookMap2);

        System.out.println(bookMap2.get(new Book(3, "DEF")));//2, get() return integer,
                                                             //之前已經2本, 今次 new Book, 冇 new 到
                                                             //所以都係 2


    }
    
}
