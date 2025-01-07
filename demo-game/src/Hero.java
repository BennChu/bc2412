public abstract class Hero {

    /* hp - Health Point
     * mp - Magic Point
     * Level
     * attackPower
     * 
     * Method:
     * Presentation: isAlive
     * Action: if Level up -> Increase Max HP, Max MP, 
     * 
     * Hero is a Parent class
     * Child class: Archer, Mage, Warrior
     * 
     * attackPower
     * Weapon
     * 
     */
    
     private long id;
     private int hp; //背後計數可能 double
     private int mp;
     private int level;
     private String name;

     public Hero(long id, String name) {
        this.id = id;
        this.hp = 100;
        this.mp = 100;
        this.level = 1;
        this.name = name;
     }

     public long getId() {
         return this.id;
     }

     public int getHp() {
         return this.hp;
     }

     public int getMp() {
         return this.mp;
     }

     public int getLevel() {
         return this.level;
     }

     public String getName() {
         return this.name;
     }


     public static void main(String[] args) {

      Hero[] heros = new Hero[3];
      heros[0] = new Warrior("Strong");

      System.out.println(heros[0].getName());



     }

}
