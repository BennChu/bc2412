import java.util.ArrayList;

public class ArrayList1<T> {

    private T[] values;

    public ArrayList1() {
        this.values = (T[]) Object[0];
    }

    public void clear() {
        //this.values = null;//唔係null
        this.values = (T[]) Object[0];
    }


    public void add(T value) {
        T[] newValues = (T[1]) new Object[values.length +1];
        for (int i = 0 ; i < this.values.length ; i++) {
            newValues[i] = this.values[i];
        }
        newValues[newValues.length - 1] = value;
        this.values = newValues;
    }

    // public boolean add(T value) {
    //     for (int i = 0 ; i < this.values.length ; i++ ) {
    //         if (this.values.equals(value)) //equals
    //         return false;
    //     }
    // }


    public int size() {
        return this.values.length;
    }

    public static void main(String[] args) {
        
        
        //Array: fixed length
        String[] ss = new String[3];
        String[] ss2 = new String[] {"abc", "ijk", "xyz"};
        //ss is an address of the array, ss2[0]
        System.out.println(ss2[1]);//ijk, read the ijk position directly

        //ArrayList is array
        ArrayList<String> strings = new ArrayList<>();
        System.out.println(strings.get(1));


        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("ABC"));
        //System.out.println(books.add(new Book("IJK")));

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
