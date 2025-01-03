public class Card {

      //static: shared values
      //final: cannot be modified after initialization
      //static and final can be together
      //"static final" -> 係 constant 唔會改
      //constant has naming convention 全大寫, Math.PI (static final)
      //final array object 
      public static final char[] SUITES = new char[] {'D', 'C', 'H' ,'S'};
      public static final char[] RANK = new char[] {'A', '2', '3', '4', '5',
                                                    '6', '7', '8', '9', 'T',
                                                    'J', 'Q', 'K'};

      public static final int x = 3;





    //string (more than one char) vs char (single character)
    //char use ==, no space
    //A to K
    private char rank;
    private char suite;
  
    //constructor
    public Card(char rank, char suite) {
        this.rank = rank;
        this.suite = suite;
    }

    //getters
    public char getRank() {
        return this.rank;
    }

    public char getSuite() {
        return this.suite;
    }


}
