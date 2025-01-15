import java.util.Comparator;

public class SortByColor implements Comparator<Ball1> {

    //開一個 class 做 sorting method
    public int compare(Ball1 b1, Ball1 b2) {
        if (b1.getColor() == Ball1.Color.RED)
            return -1;

        if (b2.getColor() == Ball1.Color.RED)
            return 1;
            
        if (b1.getColor() == Ball1.Color.BLUE)
            return -1;

        return 1;
    }
    
}
