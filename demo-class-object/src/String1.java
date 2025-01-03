public class String1 {

    //purpose 儲底 user input
    //arr 係 harddisk
    //冇掛係 object, a description of an object
    private char[] arr;


    //constructor
    public String1(String s){

        this.arr = new char[s.length()];
        for( int i = 0 ; i < s.length() ; i++ ){
            this.arr[i] = s.charAt(i);
        }

    }


    public char charAt(int index) {
        //arr 係 memory
        return this.arr[index];
    }

    public int length() {
        return this.arr.length;

    }

    public boolean startsWith(char value) {
        return this.arr[0] == value;

        //if( this.arr[0] == value ){
        //true}
    }



  public static void main(String[] args) {

      String1 str = new String1("abc");
      System.out.println(str.charAt(1));
      System.out.println(str.length());
      System.out.println(str.startsWith('a'));
  }
  
}
