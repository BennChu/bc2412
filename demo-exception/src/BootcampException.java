public class BootcampException extends RuntimeException {

    //once you extends Exception Family, your class become an exception class
    
    public static void main(String[] args) {
        
        //throw new BootcampException();
        //throw new Cat(); //Cat class didnt extends Exception Family, it cannot be thrown



        //caller: call the below method by try-catch
        try {
            Bomb(1, 1);
        } catch (BootcampException e) {
            System.out.println("There is a bomb");
        }
        System.out.println("There is no bomb");

        
    }// end main


    //write a method to throw BootcampException
    public static int Bomb(int x, int y) {
        if (x == 0)
            throw new BootcampException();

        return x+y;
    }
    
}
