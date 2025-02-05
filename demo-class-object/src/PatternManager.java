public class PatternManager {

    //入 5 張cards
    private Card[] cards = new Card[5];

    public PatternManager(Card[] cards) {
        if (cards == null || cards.length != 5);
    }

    //boolean has or is 開頭會好D
    public boolean hasThreeKind() {
        int[] count = new int[13];
        for (int i = 0 ; i < this.cards.length ; i++) {
            if (++count[this.cards[i].getRank().getValue()-1] >= 3)
                return true;
        }
        return false;
    }

    public boolean isStright() {

        for (int i = 0 ; i < this.count)
    }

    public boolean hasPair() {

    }

    public boolean isFullHouse() {

    }
    
}
