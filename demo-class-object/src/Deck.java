import java.util.Arrays;
import java.util.List;

public class Deck {

    /* 行完, memory 就會有 Deck
     * press run, 所有 class 都會去晒 stack memory
     */

  
    /* create Card[] for storing all cards */
    private Card[] cards;


    /* constructor can put for loop
     * 做乜都得, switch, while loop, if else
     */
    public Deck() {

        /* 放左係 class card, 做 public static variable
         * char[] suites = new char[] {'D', 'C', 'H' ,'S'};
         * char[] rank = new char[] {'A', '2', '3', '4', '5',
         *                           '6', '7', '8', '9', 'T',
         *                           'J', 'Q', 'K'};
         */
        
        this.cards = new Card[Card.SUITES.length * Card.RANK.length];//13 * 4
        // for( int i = 0 ; i < suites.length ; i++ ) {

        //     for( int j = 0 ; j < rank.length ; j++ ) {

        //         if( i == 0 ) {
        //             cards[i] = new Card(suites[i],rank[j]);
        //         }

        //     }

        // }


        int idx = 0;
        //去公家地方攞 rank array, suite array
        //唔會 create object array
        //object 係可以, 但用左資源
        //for each loop
        for (char rank : Card.RANK) {
            for (char suite : Card.SUITES) {
                this.cards[idx++] = new Card(rank, suite);
            }
        }
    }

    public List<Card> getCards() {
        return Arrays.asList(this.cards);
    }






    public static void main(String[] args) {

        /* 當 new Deck(), 就一定每張咭都係唔樣
         * 每次都係咁
         * 唔使自己 new
         * 都可能有錯
         * Card c1 = new Card ('A', 'D');
         */
        Deck deck = new Deck();


      //唔可以改寫, 因為有 final
      //Math 唔可以 new object, 因為都冇 constructor
      //the final field card.x cannot be assigned
      //Card.x = 10;
      //System.out.println(Card.x);
      
      //Card.suites = new char[3];

    }
  
}
