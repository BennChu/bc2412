import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//收窄 area, cannot write T write Ball
//因為轉 sort 
public class Ball1 implements Comparable<Ball1> {

    private Color color;
    private int value;


    public Ball1(Color color, int value) {
        this.color = color;
        this.value = value;
    }

    public Color getColor() {
        return this.color;
    }

    public int getValue() {
        return this.value;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setValue(int value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "Ball ["
                + "Color: " + this.color
                + ", "
                + "Value: " + this.value
                + "]";
    }

    //compare by object
    @Override
    public int compareTo(Ball1 ball) {
        //compare 2 balls
        //(-1) this.ball 排前面,  (1) 排前面pp
        //our task, lower value, return first
       
        //小至大
        // if (this.value < ball.getValue())  
        //     return -1;
        // return 1;

        //order by color: RED, BLUE, YELLOW for same color, descending orde of value
        
        if (this.color == ball.getColor()) {
            if (this.value > ball.getValue())
                return -1;
            else    
                return 1;
        }

        if (this.color == Color.RED)
            return -1;

        if (ball.getColor() == Color.RED)
            return 1;//ball 排前面

        if (this.color == Color.BLUE)
            return -1;
         
        return 1;
    }


    //相對個波佢係 static
    //need to set public for SortByColor.class to get
    public static enum Color {

        RED, YELLOW, BLUE,;

    }
    


    public static void main(String[] args) {
        //Ball list
        //RED 1
        //YELLOW 9
        //BLUE 7
        //YELLOW 3
        //RED 8
        List<Ball1> balls = new ArrayList<>();
        balls.add(new Ball1(Ball1.Color.RED,1));//to be exect Ball.Color.RED
        balls.add(new Ball1(Ball1.Color.YELLOW,9));
        balls.add(new Ball1(Ball1.Color.BLUE,7));
        balls.add(new Ball1(Ball1.Color.YELLOW,1));
        balls.add(new Ball1(Ball1.Color.RED,8));

        System.out.println(balls);
        //follow the .add order
        //[Ball [Color: RED, Value: 1], Ball [Color: YELLOW, Value: 9], 
        //Ball [Color: BLUE, Value: 7], Ball [Color: YELLOW, Value: 3], 
        //Ball [Color: RED, Value: 8]]

        //approach 1: comparable<Ball>
        //sort by values
        //disadvantage: only one formula for sorting
        //Ball class comply with the contract of Collections.sort()
        //public static <T extends Comparable<? super T>> void sort(List<T> list)
        //入黎 sort.() 要 compareTo() 因為佢寫左 <T extends Comparable
        
        Collections.sort(balls);
        
        System.out.println("test...." + balls);
        //sort by color
        //[Ball [Color: RED, Value: 8], Ball [Color: RED, Value: 1], 
        //Ball [Color: BLUE, Value: 7], Ball [Color: YELLOW, Value: 9], 
        //Ball [Color: YELLOW, Value: 1]]


        //approach 2: comparator
        //可以地址去唔同 sorting formula
        //Comparator is a class 被比較
        Comparator<Ball1> sortFormula;//係一個地址
        int x = 1;

        if (x>2) {
            sortFormula = new SortByColor();
            //sort by color and value
            //[Ball [Color: RED, Value: 1], Ball [Color: RED, Value: 8], 
            //Ball [Color: BLUE, Value: 7], Ball [Color: YELLOW, Value: 9], 
            //Ball [Color: YELLOW, Value: 1]]
        }else {
            sortFormula = new SortByValue();
            //[Ball [Color: YELLOW, Value: 9], Ball [Color: RED, Value: 8], 
            //Ball [Color: BLUE, Value: 7], Ball [Color: RED, Value: 1],
            //Ball [Color: YELLOW, Value: 1]]
        }

       //collections.sort can set formula
       Collections.sort(balls, sortFormula);
        System.out.println(balls);

    }









}
