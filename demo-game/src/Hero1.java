import java.util.ArrayList;
import java.util.List;

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
    private String name;
    private Role1 role;


     public Hero1(long id, String name, Role1 role) {
        this.role = role;
        this.id = id;
        this.name = name;
     }

     /**
      * getters -> can get id, name, role
      * setters -> can change name, setName()
      *            cannot change id and role
      */
     public long getId() {
         return this.id;
     }

     public String getName() {
         return this.name;
     }

     //can change name
     public void setName(String name) {
        this.name = name;
     }

     public Role1 getRole() {
        return this.role;
     }




     @Override
     public String toString() {
         return "["
                + " ID: " + getId() + ","
                + " Name: " + getName() + ","
                + " Type: " + getRole() + ","
                + "]\n"
                ;
     }



     public int physicalAtt() {
        return -1;
     }

     public int physicalDef() {
        return -1;
     }

     public int magicalAtt() {
        return -1;
     }

     public void magcialDef() {

     }



 

    public static void main(String[] args) {

      

        Warrior1 hero1 = new Warrior1(00001L, "WinWin", Role1.Warrior);
        Mage1 hero2    = new Mage1(00002L, "Lisa", Role1.Mage);
        Archer1 hero3  = new Archer1(00003L, "Add oil", Role1.Archer);
        Warrior1 hero4   = new Warrior1(00004L, "Brave", Role1.Warrior);

        System.out.println(hero1);

        hero1.levelUp();
        System.out.println(hero1);//Level: 2, HP: 180, MP: 100]

        hero1.setHp(100);
        System.out.println("assume under attack setHp100 " + hero1);

        hero1.levelUp();
        System.out.println(hero1);//Level: 3, HP: 260, MP: 100]

        //System.out.println(Heros1.WAR_VAL[3][4]);

        List<Hero1> heros = new ArrayList<>();
        //heros[0] store an object reference
        heros.add(hero1);
        heros.add(hero2);
        heros.add(hero3);
        heros.add(hero3);


        //test change name
        //heros is an ArrayList, if go to specific position get()

        //heros is an ArrayList object reference
        //System.out.println(heros.size());
        //if print need to override toSting() method
        //System.out.println(heros);  
  



       }




   

}
