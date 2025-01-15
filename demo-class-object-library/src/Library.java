import Book;

package src;
public class Library {


    /* A library has many books
     * A book has attributes, title and author
     * The library has functions:
     *  1.Add a book, return void
     *  2.removeByTitle, return Book
     *  3.searchByTitle (keyword), return Book[]
     *  
     * Librarian (add/remove), Library(search), Book
     * 
     * 
     */

    private long id;
    private Book[] books;


    /**
     * constructor
     * every time new 一個 library 都比一個 id 佢
     * book list 係  0
     * 如果你知道一開始係 1000 本書, 都可以
     */
    public Library(long id) {
        this.id = id;
        this.books = new Book[0];//this.books, 因為係一個儲住 array object reference
    }


    /**
     * return type is a Book[] array
     * means return array 內的內容
     * means 所有書
     */
    public Book[] getBooks() { //return type is Book type array, so Book[]
        return this.books;
    }


    /**
     * return the length of the books array
     * means 有幾多本書
     */
    public int size() {
        return this.books.length;//this.books 係一個 array object reference, so .length
    }

    public void setBooks(Book[] book) {//input Book type array to this object books, this.books
        this.books = book;
    }


    // public void add(Book book) {
    //     Book[] books = new Book[this.books.length + 1];
    //     for (int i = 0; i < this.books.length; i++) {
    //       books[i] = this.books[i];
    //     }
    //     books[books.length - 1] = book;
    //     this.books = books;
    //   }


    /* removeByTitle method, return book
     * Assume remove the first book with same title
     * create a new book type array with length -1
     * copy old array to new array
     * stop till has a match with the title
     * then copy the rest
     */

    //  public Book removeByTitle(String title) {
    //     int targetRemoveIndex = -1;
    //     for (int i = 0; i < this.books.length; i++) {
    //       if (this.books[i].getTitle().equals(title)) {
    //         targetRemoveIndex = i;
    //         break;
    //       }
    //     }
    //     Book targetRemoveBook = null;
    //     if (targetRemoveIndex != -1) { // book found
    //       Book[] books = new Book[this.books.length - 1];
    //       int idx = 0;
    //       for (int i = 0; i < this.books.length; i++) {
    //         if (i != targetRemoveIndex) {
    //           books[idx++] = this.books[i];
    //         } else {
    //           targetRemoveBook = this.books[i]; // write down the address
    //         }
    //       }
    //       this.books = books;
    //     }
    //     return targetRemoveBook; // if not found, return nul
    //   }




    /* searchByTitle method by keyword, return Book[]
     * use subString
     * what book object you are going to return
     * didnt change the value of this.books
     * 你係比左 books object reference 比人
     */

     public Book[] searchByTitle(String title) {//result maybe more than 1 book, so return an array

         //for the seaching results, maybe more than 1
         int count = 0;

        //  for( int i = 0 ; i < this.books.length ; i++ ) {
        //      if( this.books[i].getTitle().contains(title) ) {
        //             results = new Book[arr.length+1];
        //             for( int j = 0 ; j < arr.length ; j++ ) { 
        //                 results[j] = arr[j];
        //             }
        //             results[results.length-1] = this.books[i];
        //      }


            for (int i = 0 ; i < this.books.length ; i++) {
                if( this.books[i].getTitle().contains(title) ) {
                    count++;
                }
            }

            int idx = 0;
            //睇下上面 count 係幾多, 就 new array length 幾多
            //searching maybe more than 1 book
            //create a Book type array called books to store object reference
            Book[] books = new Book[count];
            for( int i = 0 ; i < this.books.length ; i++ ) {
                
                if( this.books[i].getTitle().contains(title) ) {//this.books[1] 係一本 book, so can getTitle()
                    books[idx++] = this.books[i];
                }
            }

            return books; //return Book[] books array
        
         }


     



     public static void main(String[] args) {

     
        Library lb1 = new Library(001L);

        // /* old way to create books */
        // Book b1 = new Book(000001L, "how to be happpy", "Ben Chu");
        // Book b2 = new Book(000002L, "how to be rich", "bill gates");

        /* object way to add books */
        // lb1.add(new Book(000001L, "how to be happpy", "Ben Chu"));
        // lb1.add(new Book(000002L, "how to be rich", "bill gates"));
        // lb1.add(new Book(000003L, "how to be pretty", "emily"));
        // lb1.add(new Book(000004L, "not to be poor", "elon musk"));


        /**
         * book
         * library
         * librarian
         * create a new Librarian (lbn1), 指住 a library (lb)
         * Librarian has a method add, 會用 this.library 所以有加 book 去 library
         */
        Librarian lbn1 = new Librarian(lb1);
        lbn1.add(new Book(000005L, "how to write java", "vincent"));





        //prefer for each loop, if only read an array
        //loop all books in the library, 每本書放落 book 度, then getTitle and getAuthor
        for (Book book : lb1.getBooks()) 
            System.out.println(book.getTitle() + " " + book.getAuthor());


        for( Book book : lb1.searchByTitle("not") ) {
            System.out.println("search by not " + "'" + book.getTitle() + " " + book.getAuthor() + "'");
        }
    
        //this.books size before removedBook
        System.out.println("book size before remove is " + lb1.size());
            
        Book removedBook = lbn1.removeByTitle("not"); //return Book type

        if( removedBook == null )
        System.out.println("no removed book");

        System.out.println(removedBook.getTitle() + " " + removedBook.getAuthor());

        System.out.println(lb1.size());






     }//main

}//class
