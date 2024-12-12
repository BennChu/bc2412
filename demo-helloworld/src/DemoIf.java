public class DemoIf {
  public static void main(String[] args){

    // if -> check event -> get result
    int x = 3;
    if (x >2) {
      System.out.println("x is > 2"); 
    }

    // check length is > 3
    String s = "hello";
    if( s.length()>3){
      System.out.println("s length is >3");
    }


      // equals()
      if("hello".equals(s)){ // equals() return true or false

        System.out.println("String s equals hello");
      }

      //if charAt()
      if('h' == s.charAt(0)){  //primitive compare return true or false

        System.out.println("first letter is h");
      }

      if("hello" == s){

        System.out.println("String s equals hello");
      }

      // if else function
      if(x > 5){

        System.out.println("x > 5");
      }else {

        System.out.println("x <=5 ");
      }


      int y=10;
      //check if y is an even number
      if(y%2 == 0){

        System.out.println("y is an even number");
      }else{

        System.out.println("y is an odd number");
      }

      // check y1 is an odd number
      int y1 = 15;
      if(y1%2 != 0){

        System.out.println("y1 is an odd number");

      }

      //check if y > 3 and y is even number
      if(y>3 && y%2 == 0){
        System.out.println("y is " + y);
        System.out.println("y is >3 and an even number");
      }else{

        System.out.println("else");
      }

      int age = 17;
      boolean isAdult = age >=18;

      if( isAdult == false){
        System.out.println("it is not an adult");
      }

      if (!isAdult){
        System.out.println("it is not an adult");
      }


      int score = 80;
      char grade = ' ';
      char gender = 'M';
      // score >= 90, grade A
      // score between 85 and 89 for female, grade T
      // score between 87 and 89 for male, grade T
      // score between 80 and 84 for female, grade B
      // score between 80 and 86 for male, grade B
      // score between 70 and 79, grade C
      // under 70, grade F

      //test cases
      //1. M 90, A
      //2. F 90, A
      //3. M 86, B
      //4. F 86, T
      //5. M 85
      //6. F 85
      //7. M 79
      //8. F 79
      //9. M 69
      //10.F 69


      if(gender == 'M'){
        if (score >= 90){
          grade = 'A';
          System.out.println("male " + grade);
        }else if (score >=87 && score <=89){
         grade = 'T'; 
         System.out.println("male " + grade);
        }else if (score >= 80 && score <= 86){
         grade = 'B';
         System.out.println("male " + grade);
        }else if (score >=70 && score <=79){
          grade = 'C';
          System.out.println("male " + grade);
        }else{
          grade ='F';
          System.out.println("male " + grade);
      }
    }
      else{if (score >= 90){
        grade = 'A';
        System.out.println("female " + grade);
      }else if (score >=87 && score <=89){
       grade = 'T'; 
       System.out.println("female " + grade);
      }else if (score >= 80 && score <= 84){
       grade = 'B';
       System.out.println("female " + grade);
      }else {
        grade ='F';
        System.out.println("female " + grade);

      }
    }
  





























}
}