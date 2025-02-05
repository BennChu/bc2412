public class Student2 {

      /* Question 2
       * Candy.class has attribute color (RED, BLUE, YELLOW)
       * Student2.class to store his own candies
       * make candies, 裝 candy
       * 20 candies -> distribute to students according to their score
       * Rule: every round of distribution, Above 80 score -> RED; between 60 - 79 score -> BLUE candy, else YELLOW
       * Student 1: 67
       * Student 2: 89
       * Student 3: 50
       * Student 4: 99
       * Student 5: 60
       * Student 6: 59
       * 
       * Expected output: return Student[] (Student[] should have candy attribute)
       */
    
    private long id;
    private int score;
    private Candy2[] candies;

    /* constructor */
    public Student2(long id, int score) {
        this.id = id;
        this.score = score; 
        this.candies = new Candy2[0]; //student 有個 candy2[] receive candy
    }


    //student receive candies
    public void receiveCandy(Candy2 candy) {

        //create new array for copy old candies array and put the candy on the last index
        //like customer add item
        Candy2[] candies = new Candy2[this.candies.length+1];

        //將舊 candy 係舊 this.candies[], 放去新 candies[]
        //因為 array[] 係 fixed length
        for (int i = 0 ; i < this.candies.length ; i++) {
            candies[i] = this.candies[i];
        }
        //place the new candy at the 新 candies[] tail
        candies[candies.length-1] = candy;

        //replace candies object reference
        //因為當我地 construct this.candies 係指住 new Candy2[0]
        this.candies = candies;
    }

    public long getId() {
        return this.id;
    }

    public int getScore() {
        return this.score;
    }

    public Candy2[] getCandies() {
        return this.candies;
    }

    public String getCandiesInfo() {
        String info = "[";
        for( Candy2 candy : this.candies ) {
            info += candy.getColor();
        }
        return info.substring(0, info.length()-1) + "]";
    }

    public int getCandyCount() {
        return this.candies.length;
    }




 



    public static void main(String[] args) {


        // Student2[] students = new Student2[] {new Student2(67),
        //                                       new Student2(89),
        //                                       new Student2(50),
        //                                       new Student2(99),
        //                                       new Student2(60),
        //                                       new Student2(59)};

        //System.out.println(students[1].getScore());//89
        //System.out.println(students[5].getScore());//59

  
  
    
    
    
    
    
    }
}
