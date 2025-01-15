public class SuperBox<T extends Animal1,U extends Hero1,V extends Weapon> {
    
    private T animal;
    private U hero;
    private V weapon;

   

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void setHero(U hero) {
        this.hero = hero;
    }
    
    public void setWeapon(V weapon) {
        this.weapon = weapon;
    }

    public int totalAttack() {
        return this.animal.run() + this.hero.attack() + this.weapon.onTopAttack();
    }

    public static void main(String[] args){

        SuperBox<Animal1, Hero1, Weapon> s1 = new SuperBox<>();
        s1.setAnimal(new Tiger());
        s1.setHero(new Mage());
        s1.setWeapon(new Bow());
        System.out.println(s1.totalAttack());//6 = 1 + 2 + 3 (Animal 1 + Hero 2 + weapon 3)
        //s1.setAnimal(new Panda());
        //System.out.println(s1.totalAttack());//105 = 100 + 2 + 3

    }
}
