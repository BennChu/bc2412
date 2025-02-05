public enum Direction {
    
    //有須序
    EAST(90,1),
    SOUTH(180,2),
    WEST(270,-1),
    NORTH(360,-2),
    ;

    //private final
    //want to tell ppl, dont want ppl change it
    private final int angle;
    private final int value;

    //constructor 用 private
    //although enum cannot be new object, we want to presice
    private Direction (int angle, int value) {
        this.angle = angle;
        this.value = value;//唔開 get 都得, only for 計數
    }


    public int getAngle() {
        return this.angle;
    }

    //Direction.NORTH.opposite() -> Direction SOUTH
    //用 1, -1 手法
    public Direction opposite() {

        //for each loop, loop 乜野 ? 
        //咩 type : loop乜野 values() 
        for (Direction d : values()) { //values is Direction[]
            if (d.value == this.value * -1) //自己 class can d. , 可以唔使用 getAngle()
                return d;
        }
        return null;//throw exception
    }

    // public String angleFindDirection(int angle) {
    //     for (Direction d : values()) {
    //         if (d.angle == angle)
    //             return d.name();
    //     }
    // }

    public static void main(String[] args) {

        System.out.println(Direction.EAST.getAngle());//90

        System.out.println(Direction.EAST.opposite());//WEST
    }
}
