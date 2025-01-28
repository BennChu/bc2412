public class Builder {

    public static Builder builder() {
        return new Builder();
    }
    

    private String name;
    private long id;
    private Role1 role;
    private int level;


    public Builder name(String name) {
        this.name = name;
        return this;
    }


    public Builder id(long id) {
        this.id = id;
        return this;
    }

    public Builder role(Role1 role) {
        this.role = role;
        return this;
    }

    public Builder level(int level) {
        this.level = 1;
        return this;
    }

    public Warrior1 buildWarrior1() {
        Heros1.addRecord
        return new Warrior1(this.id, this.name, this.role);
    }

    public Mage1 buildMage1() {
        return new Mage1(this.id, this.name, this.role);
    }

    public Archer1 buildArcher1() {
        return new Archer1(this.id, this.name, this.role);
    }
}
