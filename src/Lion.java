public class Lion extends Animals{

    private String name = "Lion";
    private int attackPower;
    private int defensePower;
    private int regenPower;

    public Lion() {
        super (InitialStats.LION_ATK, InitialStats.LION_DEF,InitialStats.LION_REG);
        this.attackPower = InitialStats.LION_ATK;
        this.defensePower = InitialStats.LION_DEF;
        this.regenPower = InitialStats.LION_REG;


    }

    @Override
    public int special(int initialStat) {
        return initialStat * 2;
    }

    @Override
    public int attack(Animals animals) {
        int damage = InitialStats.LION_ATK;
        return super.getHealthPts()-damage;

    }

    @Override
    public String toString() {
        return "Select a " + name + "? Its attack is " + InitialStats.LION_ATK + ".\n" +
                "His defense is " + InitialStats.LION_DEF + ".\n" +
                "His Healing power is " + InitialStats.LION_REG + ".";
    }
}
