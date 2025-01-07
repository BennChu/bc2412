public interface Walkable {
    
    /* interface a contract
     * 1. No instance object
     * 2. All methods are abstract 100% abstract
     * 3. Everything in Interface Implicityly public, so no need to write public
     * 4. Support "static final" variable
     * 5. no constructor
     * 6. after Java 8, change
     */

    int x = 3;//唯一可做就係 static final, implicityly static final
    void walk();//abstract mehtod

    //before java 8
    //After Java 8, we can use default instance method
    default void walkFaster() {
        System.out.println("A way to walk faster");
    }

    //after java 8, we can use static default instance method
    static int calculateDistance() {
        return -1;
    }

    //任何地方都可以開 main
    public static void main(String[] args) {

        System.out.println(Walkable.x);//3
        //Walkable.x=4, cannot change, x is final

        System.out.println(Walkable.calculateDistance());//同隻cat 冇關係

    }
}
