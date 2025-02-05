public class Librarian {


    private String name;
    private Library library;

    /* constructor
     * Librarian -> book
     * Librarian 內有 library or
     * Library 內有 Librarian
     */

     /* librarian 內有 library
      * this.library, once create librarian 就指住 library
      */
    public Librarian(Library library) {
        this.library = library;
    }




    public void add(Book book) {

        // 開一個新書庫
        Book[] books = new Book[this.library.size() + 1];

        /* 攞 librarian 指住的 library 的書庫放係 books 新書庫
         * i 由 0 去到 library 的 size 就停
         * 一本一本放過去
         * getBooks() 係 get library 內的書 array type
         */
        for (int i = 0; i < this.library.size() ; i++) {
            books[i] = this.library.getBooks()[i];
        }

        //將新書放係書庫最後位
        books[books.length - 1] = book;
        //setBooks() 係將新書庫放係 library 的書庫
        this.library.setBooks(books);
    }


      public Book removeByTitle(String title) {
          int targetRemoveIndex = -1;

          for (int i = 0; i < this.library.size(); i++) { //libaray.size same as length

              if (this.library.getBooks()[i].getTitle().equals(title)) {
                  targetRemoveIndex = i;
                  break;
              }
          }
        
          Book targetRemoveBook = null;
          
          if (targetRemoveIndex != -1) { // book found

          Book[] books = new Book[this.library.size() - 1];
          int idx = 0;
          for (int i = 0; i < this.library.size() ; i++) {
              if (i != targetRemoveIndex) {
                  books[idx++] = this.library.getBooks()[i];
            } else {
                  targetRemoveBook = this.library.getBooks()[i]; // write down the address
            }
          }
          this.library.setBooks(books);
        }
        return targetRemoveBook; // if not found, return nul
      }

}
