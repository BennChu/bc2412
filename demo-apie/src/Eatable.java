public interface Eatable {
    
    /* is a contract for class to use
     * no need write public, implicitly public
     * no need to write abstract, only abstract
     */

    //method implicitly public, so no need write public on methods
    //if you write public also ok but not professional
    //method only abstract
     void eat();

     


    public static void main(String[] args) {


        //System.out.println(x);

        //interface cannot new object
        //cannot instantiate the type Eatable
        //Eatable eat = new Eatable();


    }
    
}
