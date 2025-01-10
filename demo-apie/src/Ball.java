public class Ball {

    private Color color;//has a enum Color, color type
    public int number;

    public Ball (Color color) {
        this.color = color; //放 color 地址, java create color RED YELLOW BLUE
    }

    public Color getColor() {
        return this.color;
    }

    public static void main(String[] args) {
        Ball b1 = new Ball(Color.RED);
        //Ball b2 = new Ball(Color.RED);

        System.out.println(b1.getColor() == Color.RED);//true, 唔使次次都 new 一個 RED
    }
}
