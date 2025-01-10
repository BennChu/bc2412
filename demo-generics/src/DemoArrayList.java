import java.util.ArrayList;

public class DemoArrayList {
     

    public static void main(String[] args) {

    
        //Array is fixed length
        String[] ss = new String[3];
        String[] ss2 = new String[] {"abc", "ijk", "xyz"};
        
        //ss is an address of the array, ss2[0]
        System.out.println(ss2[1]);//ijk, read the ijk position directly


        //ArrayList 底層都係 array
        ArrayList<String> strings = new ArrayList<>();        
        strings.add("ABC");//index = 0, size = 1
        System.out.println(strings.add("IJK"));//index = 1, size = 2
                                               //.add() return boolean true

        
        //the actual coding is like this
        strings.add(2, "XYZ"); //2 is index, "XYZ" is strings, size = 3
        System.out.println(strings.get(2));//XYZ
        strings.add(2, "VBN");//add "VBN" to index 2
                              //before index 2 is XYZ, now index 2 is VBN
                              //index 3 is XYZ, 
                              //the rest of the elements are shifted
        System.out.println(strings.get(2));//now index 2 = VBN    
        System.out.println(strings.get(3));//so get(index 3) = XYZ
        System.out.println(strings.size());//4, ArrayList length is 4
        System.out.println(strings.get(1));//IJK
        


        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("ABC"));//add to index 0
        System.out.println(books.get(0));//return Book[name=ABC]


        System.out.println(books.remove(0));//remove book by index, need to check index
                                            //remove() return Book type
        System.out.println("size" + books.size());//0
        //System.out.println(books.get(0));


        //.remove .add .contains .isEmpty .indexof are very important
        books.add(new Book("IJK"));
        System.out.println(books.size());//1

        books.add(new Book("XYZ"));
        System.out.println(books.size());//2

        books.remove(new Book("IJK"));//remove by object, 但現實世界, 同一個書名就係同一本書
        System.out.println(books.size());//2, 如果冇 override equals(), 唔會 remove 到 return 2
                                         //1, 寫左 override can remove return 1
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
    }
}
