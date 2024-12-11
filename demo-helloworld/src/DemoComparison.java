public class DemoComparison {

  public static void main(String[] args){


    //>,<, >= , <=, !=, ==
    // == asking if they are equals
    // '=' assignment

    int age = 20;
    boolean isAdult = age > 18; // adult definition
    System.out.println("is age above 65 "+ isAdult);

    double pi = 3.14159;
    boolean isCorrect = (pi == 3.14159); // have bracket or not are the same
    System.out.println(isCorrect);

    char gender = 'M';
    boolean isMale = gender == 'M';
    System.out.println("he is male " + isMale);

    String genderF = "F";
    boolean isFemale = genderF == "F";
    System.out.println("she is female " + isFemale);

    float price = 10.2f; // 10.2 is double higher grade, that why you add f to force float
    System.out.println(price != 10.2f);
    System.out.println(price != 10.2); // true, during comparsion, convert price to double before comporison

    // ! operator
    boolean result = !isAdult;
    System.out.println(result); // false

    /*if(age >= 18)

      if (!isAdult) better 提升 readilability

    */


    // && and
    int age2 = 30;
    char gender2 = 'F';
    boolean result2 = age2>=30 && gender2 =='M';
    //event 1: age >=30, true
    //event 2: gender is M , false
    System.out.println("age2>=30 && gender2 =='M' " + result2); //  false


    // || or
    boolean result3 = age2>=30 || gender2 =='M';
    //event 1: age >=30, true
    //event 2: gender is M , false
    System.out.println("age2>=30 || gender2 =='M' " + result3); //  true


    // || or (false || false)
    boolean result4 = age2>=40 || gender2 =='M';
    //event 1: age >=40, false
    //event 2: gender is M , false
    System.out.println("age2>=20 || gender2 =='M' " + result4);


    // and or (true and (false or true))
    boolean result4 = (age2<30 || gender2 != 'F');


    boolean result5 = age2 >= 30 && (gender2 == 'M' || age2> 18);
    System.out.println(result5);

    //the ordering of event checking is different
    // and go first
    boolean result6 = age2 >18 || age2>=30 && gender2 == 'M';
    System.out.println(result6);
    //Step 1: 


















  }
  
}
