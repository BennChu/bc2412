import java.util.ArrayList;

public abstract class Hero1 {

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
     private Role1 role;


     public Hero1(Role1 role, long id, String name) {
        this.role = role;
        this.id = id;
        this.hp = 100;
        this.mp = 100;
        this.level = 1;
        this.name = name;
     }

     public Role1 getRole() {
        return this.role;
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

     @Override
     public String toString() {
         return "["
                + " Type: " + getRole() + ","
                + " Name: " + getName() + ","
                + " ID: " + getId() + ","
                + " HP: " + getHp() + ","
                + " MP: " + getMp() + ","
                + " Level: " + getLevel()
                + "]";
     }



     public void phyAtt() {

     }

     public void phyDef() {

     }

     public void magAtt() {

     }

     public void magDef() {

     }



 

    public static void main(String[] args) {

        // Hero1[] heros = new Hero1[1];
        // heros[0] = new Hero1(Role1.Warrior, 00001L, "Ben");
       //System.out.println(heros.length);
       
        ArrayList<Hero1> heros = new ArrayList<>();
        heros.add(new Warrior1(Role1.Warrior, 00001L, "WinWin"));
        heros.add(new Mage1(Role1.Mage, 00002L, "Lisa"));
        heros.add(new Archer1(Role1.Archer, 00003L, "Add oil"));


        //System.out.println(heros.size());
        //System.out.println(heros.get(0).getName());
        //System.out.println(heros.get(0).getHp());
        
        System.out.println(heros);

  
  
  
       }




   

}
