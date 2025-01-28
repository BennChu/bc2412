public class Book {

  //This is Book class
  
    private long id;
    private String title;
    private String author;


    //constrcutor
    public Book(long id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    //getters and setters
    public long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    //assume cannot change id
    //public void setId(long id) {
    //  this.id = id;
    //}

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }







}
