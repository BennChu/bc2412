public class Printer {
    
    private Integer x;

    public Printer(Integer x) {
        this.x = x;
    }

    public String print() {
        return "this is " + this.x;
    }

    public static void main(String[] args) {
        Printer p1 = new Printer(10);
        System.out.println(p1.print());

        //what if Double Printer? Long Printer? BigDecimal Printer?
    
        //cannot put 10, must put 10L
        //10 -> Integer 10 -> Long 10, jump 2 times
        //"GeneralPrinter" is type
        //"<Long>" is input type
        GeneralPrinter<Long> longPrinter = new GeneralPrinter<>(10L);
        //you defined T as Long

        //"<Book>" is Book type
        GeneralPrinter<Book> bookPrinter = new GeneralPrinter<>(new Book("ABC"));
        System.out.println(bookPrinter.print());
    }
}
