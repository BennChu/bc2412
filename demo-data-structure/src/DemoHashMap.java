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
        //檢查 3 個 steps
        //1. 檢查 object
        //2. 檢查 真身
        //3. 檢查 attribute
        public boolean equals(Object obj) {
            if(this == obj) //step 1. 如果 同一個 object return true, 佢地係 equals
                return true;
            
            if (!(obj instanceof Book)) //step 1. object 係同一個 step 2. 但真身係唔一樣 -> not equals
                return false;

            Book book = (Book) obj; //step 1. object 係同一個 step 2. 真身都一樣 step 3. 睇下 attribute 係咪一樣
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
        //a data structure that provides a way to store and retrieve key-value pairs efficiently
        //does not maintain any specific order of its entries
        //pairs are stored based on the hash of the keys
        
        
        //前面係 key and 後面 value
        //key type is String
        HashMap<String, Integer> fruitMap = new HashMap<>();

        //put(), add an entry to map
        //kep -> Apple
        fruitMap.put("Apple",1);
        fruitMap.put("Apple",3);


        //if the key is the same, in this case (Apple), the previsous entry will be replaced
        System.out.println(fruitMap);//Apple=3
        System.out.println(fruitMap.size());//1, entry count


        //case sensitive
        fruitMap.put("APPLE",3);
        System.out.println(fruitMap);//{Apple=3, APPLE=3}
        System.out.println(fruitMap.size());//2, entry count 
        //because i set HashMap<String, Integer>
        //According to String.class equals(), "Apple" "APPLE" are not same, String 作者決定大草細草話唔一樣


        //for each loop format
        //right side is "entrySet()" 好多 entry
        //getKey(), 攞番 key
        //getValue(), 攞番 value
        for (Map.Entry<String,Integer> entry : fruitMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue()); //Apple 3
        }


        //for each loop, print all key, 睇下有咩 key
        //好多個 key -> strings
        for (String Key : fruitMap.keySet()) {
            System.out.println(Key);//Apple, APPLE
        }
        

        //for each loop, print all values
        for (Integer value : fruitMap.values()) {
            System.out.println(value);//3,3
        }
        
        
        //get() value by key
        System.out.println(fruitMap.get("APPLE"));//3
        System.out.println(fruitMap.get("Apple"));//3


        //containsKey()
        System.out.println(fruitMap.containsKey("Apple"));//true, boolean


        //put() method, 3種寫法都係想 value + 1
        //if 整個 fruitMpa 有 key "Appple", put a new entry
        if (fruitMap.containsKey("Apple")) {
            fruitMap.put("Apple", fruitMap.get("Apple") + 1);
            System.out.println(fruitMap.get("Apple"));//4
        }

        //
        Integer value = fruitMap.get("Apple");
        if (value != null) {
            fruitMap.put("Apple", value +1);
            System.out.println(fruitMap.get("Apple"));//5
        }


        //find the entry of "Apple" and then +1 to the integer
        //this one use setValue
        //因為會 replace, 所以 put 同 setValue almost the same
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
        System.out.println(fruitMap.size());//3, yes


        //can we put null key to the entry
        fruitMap.put(null, 999);
        fruitMap.put(null, 1000);
        System.out.println(fruitMap);//null=1000, Apple=6, ABC=null, APPLE=3
        System.out.println(fruitMap.size());//4

        
        //containsValue()
        System.out.println(fruitMap.containsValue(1000));//true


        System.out.println(fruitMap.getOrDefault("Orange",10));//冇先會 return 後面 integer, 因為冇 orange 所以出 10
        System.out.println(fruitMap.getOrDefault("Apple",100));//有 key "Apple" value is "6", so 唔會出後面你 set 的 integer, 會 return 6
       

        //remove(key)
        System.out.println(fruitMap.remove("APPLE"));//3, return the value of the remove key


        fruitMap.clear();
        System.out.println(fruitMap.size());//0
        System.out.println(fruitMap.isEmpty());//true, map is here, but empty


        //fruitMap.getOrDefault("Cherry",0) -> 如果冇 cherry will return 0
        //then put(), add an entry, key "Cherry", value "1"
        //全句意思, 如果冇 cherry, then 我地加一條 entry cherry value 1
        fruitMap.put("Cherry",fruitMap.getOrDefault("Cherry",0)+1);


        //Book type 都可以
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
        bookMap2.put(b7, bookMap2.getOrDefault(b7,0)+1);//bookMap2.getOrDefault(b7,0) -> return 1, 所以 put(b7,2)

        //因為書同名同作者, 都可以當2本, 因為 2 copies

        //如冇 override 所有 new object 都會唔同, so size() is 4, bookMpa2 有4本書
        //但現實世界, 就算 new object, 但同名同 attribute 可以係同一本書, 所以要寫 override
        //size() = 4
        //{[name = DEF]=1, [name = ABC]=1, [name = DEF]=1, [name = IJK]=1}
        //null
        //if overrided
        //size() = 3
        //{[name = ABC]=1, [name = DEF]=2, [name = IJK]=1}
        //get(new Book(3,"DEF")) 有2本
        System.out.println(bookMap2.size());//3 entry, 但 4本書
        System.out.println(bookMap2);

        System.out.println(bookMap2.get(new Book(3, "DEF")));//如冇 override 所有 new object 都會唔一樣, get(new Book(3,"DEF")) 會 get 唔到野 will return null
                                                             //如有 override, will return 2
                                                           


    }
    
}
