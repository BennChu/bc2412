public enum OrderStatus {
    
    PAID(1),
    READY_FOR_SHIP(2),
    DELIVERING(3),
    DELIVERED(4),
    ;

    private final int value;

    private OrderStatus (int value) {
        this.value = value;
    }


    public int getValue() {
        return this.value;
    }


    //DELIVERED.next() -> null
    public OrderStatus next() {
        for (OrderStatus orderStatus : values()) { //values() is a key word, 係another class, need to write OrderSatus.values
            if (orderStatus.value == this.value + 1) {//冇寫 getValue(), 可以用 this.value
                return orderStatus;
            }
        }
    }


    public static void main(String[] args) {

        System.out.println(OrderStatus.READY_FOR_SHIP.next().name());//in enum EAST SOUTH 已經係 object .name 係 object name
        System.out.println(OrderStatus.PAID.name());

        System.out.println(OrderStatus.valueOf("PAID"));//true, 搵 enum

        //好少反轉咁做, String 搵 enum
        //System.out.println(OrderStatus.valueOf("paid"));
        //
    }
}
