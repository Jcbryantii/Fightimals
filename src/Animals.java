public abstract class Animals {

    private int healthPts;
    private int attack;
    private int defense;
    private int regen;

    public int getHealthPts() {
        return healthPts;
    }

    public void setHealthPts(int healthPts) {
        this.healthPts = healthPts;
    }

    Animals(int attack, int defense, int regen) {
        this.healthPts = 100;
        this.attack = attack;
        this.defense = defense;
        this.regen = regen;
    }

    public abstract int special(int InitialStat);

    public abstract int attack(Animals opponent);
   // public int defend(Animals animals);
    //public int heal(Animals animals);


}
