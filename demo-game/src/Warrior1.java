public class Warrior1 extends Hero1 {
    
    private int hp;
    private int mp;
    private int ep;
    private int level;
    private int maxHp;
    //private Weapon1 weapon;



    public Warrior1(long id, String name, Role1 role) {
        super(id, name, role);
        this.hp = 100;
        this.mp = 100;
        this.level = 1;
        this.ep = 0;
        //this.weapon = null;
    }

    /**
     * getters -> level
     */
     public int getHp() {
        return this.hp;
     }

     public int getMp() {
        return this.mp;
     }

     public int getLevel() {
        return this.level;
     }

     public void setLevel(int level) {
        this.level = level;
     }

     public void setHp(int hp) {
         this.hp = hp;
     }

     public void setMp(int mp) {
      this.mp = mp;
     }


     
      public int physicalAtt() {
         return Heros1.WAR_VAL[3][this.level];
      }

      public int magicalAtt() {
          return Heros1.WAR_VAL[5][this.level];
      }

      public int attack() {
            return physicalAtt() + magicalAtt();
      }

      public void levelUp() {
         int level = this.level + 1;
         setLevel(level);
         setHp(Heros1.WAR_VAL[1][level]);
         setMp(Heros1.WAR_VAL[2][level]);
         setMaxHp(level);
         setMaxMp(level);
      }

      public void setMaxHp(int level) {
         setHp(Heros1.WAR_VAL[1][level]);
      }

      public void setMaxMp(int level) {
         setHp(Heros1.WAR_VAL[2][level]);
      }




     @Override
     public String toString() {
         return "["
                + " ID: " + getId() + ","
                + " Name: " + getName() + ","
                + " Type: " + getRole() + ","
                + " Level: " + getLevel() + ","
                + " HP: " + getHp() + "/" + Heros1.WAR_VAL[1][this.level] + ","
                + " MP: " + getMp() + "/" + Heros1.WAR_VAL[2][this.level]
                + "]\n"
                ;
     }

}
