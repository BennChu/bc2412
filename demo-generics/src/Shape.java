import java.util.ArrayList;

public abstract class Shape {//shape 抽象
    
    abstract double area();

    //public static <T extends Shape> double totalArea(T[] shapes)
    //public static double totalArea (List<? extends Shape>) shapes)

    public static void main(String[] args) {

        //一堆 strings, strings array String[]
        //Variable Length
        ArrayList<String> strings = new ArrayList<>();
        strings.add("ABC");
        strings.add("IJK");
        System.out.println(strings.size());//2
        System.out.println(strings.get(1));//IJK


        //
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("ABC"));
        books.add(new Book("IJK"));

        books.remove(0);//remove book by index, check index
        System.out.println(books.size());//1

        //.remove and .add .contains .isEmpty are very important
        books.add(new Book("XYZ"));
        books.remove(new Book("IJK"));//remove by object
        System.out.println(books.size());//2, remove 唔到, 因為一 new 就係唔同 object
                                         //就算書名唔一樣, 同名就當同一本書
                                         //after @Override equals() in Book.class
                                         //因為 ArrayList 作者會 call
                                         //Generic Design ensure the Type must contains equals()
        //.contains 背後都要用 .equals(), require @Override equals()
        System.out.println(books.contains(new Book("XYZ")));//true

        books.isEmpty();
        System.out.println(books.indexOf(new Book("XYZ")));//0

        books.clear();//create a new array with size 0
                      //delete books, 但 array 仲係度

        System.out.println(books.add(new Book("ABCD")));//true

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
            System.out.println("Book " + bookName + "is available");
        }




    }

}
