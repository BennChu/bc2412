import java.util.ArrayList;
import java.util.List;

public abstract class Heros1 {

    /**
     * Heros values
     * 1st row is level (LV)
     * 2nd row is Max HP (HP), Warrior > Mage > Archer
     * 3rd row is Max MP (MP), Mage > Archer > Warrior
     * 4th row is Physical Attack (PA), Warrior > Archer > Mage
     * 5th row is Phsical Defence (PD), Warriro > Archer > Mage
     * 6th     is Magical Attack (MA), Mage > Archer > Warrior
     * 7       is Magical Defence (MD), Mage > Archer > Warrior
     * 8th     is Agility (AG)
     * 9th     is Critical Damage Chance (CC), Archer > Mage >> Warrior
     * 10th    is Critical Damage (CD), Warrior >> Mage > Archer
     * 11      is Experience Point (EP)
     */

    public static final int[][] WAR_VAL = new int[][] {{0,  1,  2,  3,  4,  5,  6,  7,  8,  9,  10}, //index 0, Level
                                                       {0,100,200,300,400,500,600,700,800,900,1000}, //1, Max HP
                                                       {0,100,180,260,320,400,480,560,640,720, 800}, //2, Max MP
                                                       {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100}, //3, Physical Attack (PA)
                                                       {0,  8, 16, 24, 32, 40, 48, 56, 64, 72,  80}, //4, Phsical Defence (PD)
                                                       {0,  1,  2,  3,  4,  5,  6,  7,  8,  9,  10}, //5, Magical Attack (MA)
                                                       {0,  1,  2,  3,  4,  5,  6,  7,  8,  9,  10}, //Magical Defence (MD)
                                                       {0,  1,  2,  3,  4,  5,  6,  7,  8,  9,  10}, //Agility (AG)
                                                       {0,  1,  2,  3,  4,  5,  6,  7,  8,  9,  10}, //Critical Damage Chance (CC)
                                                       {0, 20, 40, 60, 80,100,120,140,160, 180, 200},//Critical Damage (CD)
                                                       {0, 20, 40, 60, 80,100,120,140,160, 180, 200}};//Experience Point (EP)

    public static final int[][] ARC_VAL = new int[][] {{0,  1,  2,  3,  4,  5,  6,  7,  8,  9,  10}, //Level
                                                       {0, 80,150,250,200,300,400,500,600,700, 800}, //Max HP
                                                       {0,100,180,260,320,400,480,560,640,720, 800}, //Max MP
                                                       {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100}, //Physical Attack (PA)
                                                       {0,  8, 16, 24, 32, 40, 48, 56, 64, 72,  80}, //Phsical Defence (PD)
                                                       {0,  1,  2,  3,  4,  5,  6,  7,  8,  9,  10}, //Magical Attack (MA)
                                                       {0,  1,  2,  3,  4,  5,  6,  7,  8,  9,  10}, //Magical Defence (MD)
                                                       {0,  1,  2,  3,  4,  5,  6,  7,  8,  9,  10}, //Agility (AG)
                                                       {0,  1,  2,  3,  4,  5,  6,  7,  8,  9,  10}, //Critical Damage Chance (CC)
                                                       {0, 20, 40, 60, 80,100,120,140,160, 180, 200}};//Critical Damage (CD)                                                 
    
    public static final List<Hero1> heroList = new ArrayList<>();
   
    //max hp 唔會變, 唔使跟 object, static 跟 static method
    //  private static final int[] ARC_MAX_HP_TAB;
    //  private static final int[] WAR_MAX_HP_TAB;
    //  private static final int[] MAG_MAX_HP_TAB;

    // static {
    //     ARC_MAX_HP_TAB = new int[] {1,2,3,4,5,6,7,8,9,10};
    //     WAR_MAX_HP_TAB = new int[] {1,2,3,4,5,6,7,8,9,10};
    //     MAG_MAX_HP_TAB = new int[] {1,2,3,4,5,6,7,8,9,10};
    // }




//  public static int getMaxHp(Role role, int level) {
    //     switch (role) {

    //     }

    //  }

    //public static int getMaxMp(Role role, int level)

    public static int levelUp(int ep, int level) {
        if (ep > level = level + 1;
     }


     public static void addRecord(Hero1 hero) {

        heroList.add(hero);

     }


}
