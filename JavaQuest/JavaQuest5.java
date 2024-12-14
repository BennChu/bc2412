public class JavaQuest5 {
  /**
   * Expected output:
   * The index of the last character of c is 11
   */
  public static void main(String[] args) {
    String str = "          "; // You should not change this line
    char target = 'c';               // Update this target to test the logic
    int index = 0;                   // to store the index c
    boolean found = false;           // check whether find letter c
    
    // if not found, print "Not Found."
    

    for( int i = 0 ; i < str.length(); i++ ){

      if( str.charAt(i) == target){
        index = i;
        found = true;
      }

    }// end loop

    if( found ){
      System.out.println("The index of the last character of c is " + index);
    }else
      System.out.println("Not Found.");

    // test cases
    //1. cding bootamp -> should return index 0
    //2. coding bootcamp.cc -> should return index 17
    //3. "          " -> should return not found
    //4. coding bootcamp. -> should return index 11


  }
}