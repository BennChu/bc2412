import java.util.ArrayList;
import java.util.Iterator;

public class DemoArrayList {
     

    public static void main(String[] args) {

    
        //Array is fixed length
        String[] ss = new String[3];
        String[] ss2 = new String[] {"abc", "ijk", "xyz"};
        
        //ss is an address of the array, ss2[0]
        System.out.println(ss2[1]);//ijk, read the ijk position directly


        //ArrayList variable length 底層都係 array
        ArrayList<String> strings = new ArrayList<>();
        //.add() at the end of the list
        //can add repeated value
        strings.add("ABC");//index = 0, size = 1
        System.out.println(strings.add("IJK"));//index = 1, size = 2
                                               //.add() 到 return true

        //initial capacity of 2. 
        //This means that the internal array has space for 2 elements before it needs to be resized
        ArrayList<String> strings1 = new ArrayList<>(2);//lenght is 2, index 0 & 1
        strings1.add("ABC");
        strings1.add("CDE");
        System.out.println(strings1.add("EFG"));//true
        System.out.println(strings1);//[ABC, CDE, EFG]
        System.out.println(strings1.size());//3
        
        //the actual coding is like this
        strings.add(2, "XYZ"); //2 is index, "XYZ" is strings, size = 3
        System.out.println(strings.get(2));//XYZ
        
        strings.add(2, "VBN");//add "VBN" to index 2, add at specified index
                              //before index 2 is XYZ, now index 2 is VBN
                              //index 3 is XYZ, 
                              //the rest of the elements are shifted
        
        System.out.println(strings);//[ABC, IJK, VBN, XYZ]
        System.out.println(strings.size());//4, ArrayList length is 4
        
        //set() is replace
        System.out.println(strings.get(1));//IJK
        strings.set(1,"ZZZ");
        System.out.println(strings.get(1));//ZZZ

        //indexOf(), lastIndexOf()
        System.out.println(strings.indexOf("VBN"));//2, return the index of the first occurance of the element in the list, return -1 if not found
        System.out.println(strings.lastIndexOf("ABC"));//return the index of last occurance of the element in the list, -1 of not found

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("ABC"));//
        System.out.println(books.get(0));//return Book[name=ABC]


        System.out.println(books.remove(0));//remove book by index, need to check index
                                            //remove() return Book type
                                            //return Book[name = ABC]
        System.out.println("size" + books.size());//0
        System.out.println("is empty " + books.isEmpty());//true, but books still exit
        //System.out.println(books.get(0));//list is emtpy Index 0 out of bounds for length 0


        //.remove .add .contains .isEmpty .indexof .lastIndexOf are very important
        books.add(new Book("IJK"));
        System.out.println(books.size());//1

        books.add(new Book("XYZ"));
        System.out.println(books.size());//2

        System.out.println("removed " + books.remove(new Book("IJK")));// no override return false, remove by object, 但現實世界, 同一個書名就係同一本書
                                                                       // yes override return true
 
        System.out.println(books.size());//return 2, 如果冇 override equals(), remove 唔到 return 2
                                         //return 1, 寫左 override can remove
                                         //1, remove 唔到, 因為一 new 就係唔同 object
                                         //就算書名唔一樣, 同名就當同一本書
                                         //after @Override equals() in Book.class
                                         //因為 ArrayList 作者會 call
                                         //Generic Design ensure the Type must contains equals()

        //.contains 背後都要用 .equals(), require @Override equals()
        System.out.println(books.contains(new Book("XYZ")));//有 override return true
                                                            //inside contains() 有 equals(), 所以冇 override 會 return false 

        books.isEmpty();
        System.out.println(books.indexOf(new Book("XYZ")));//0, -1 is no such index

        books.clear();//create a new array with size 0
                      //delete books, 但 array 仲係度

        System.out.println(books.add(new Book("ABCD")));//true, .add() return boolean

        System.out.println(books.isEmpty());//false

        //search "ABCD" book - for loop
        //for each loop support ArrayList, java 係令到用家舒服
        boolean found = false;
        String bookName = "Not Found";
        for (Book book : books) {
            if (book.getName().contains("BC")) {
                found = true;
                bookName = book.getName();
                break;
            }
        }
        if (found) {
            System.out.println("Book " + bookName + " is available");
        }


        Iterator<String> iterator = strings1.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            System.out.println(string);
        }





    }
}
