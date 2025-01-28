public class DemoSwitchExpression {

    public static void main(String[] args) {
        
        System.out.println(getColorValue(Color.RED));



    }
    

    public static char getColorValue(Color color) {
        
        //new switch(color), it will make sure cover all enum values
        //no need break between case
        //will check dipulicate cannot compile
        //加一個 enum 冇既 field 會 underline eg GREEN
        //can use 'yield' as return
        // return switch (color) { 
        //     case RED -> 'R';
        //     case YELLOW -> 'Y';
        //     case BLUE -> 'B';
        // };

        return switch (color) {
            case RED -> {
                yield 'R';//yield also mean return, 因為唔咁寫會有2個 return
            }
            case YELLOW -> {
                yield 'Y';
            }
            case BLUE -> {
                yield 'B';
            }
        };

    }





    public static enum Color {

        RED,
        YELLOW,
        BLUE,
        ;

    }//Color


}
