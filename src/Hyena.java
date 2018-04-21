public class Hyena {


    private String name = "Hyena";
    private int attackPower;
    private int defensePower;
    private int regenPower;

    public Hyena() {
        //super (InitialStats.HIPPO_ATK, InitialStats.HIPPO_DEF,InitialStats.HIPPO_REG);
        this.attackPower = InitialStats.LION_ATK;
        this.defensePower = InitialStats.LION_DEF;
        this.regenPower = InitialStats.LION_REG;


    }

    //@Override
    public int special(int initialStat) {
        return initialStat * (int) 2.5;
    }

    @Override
    public String toString() {
        return "Select a " + name + "?\n" +
                "Its attack is " + InitialStats.HYENA_ATK + ".\n" +
                "Its defense is " + InitialStats.HYENA_DEF + ".\n" +
                "Its heal power is " + InitialStats.HYENA_REG + ".\n\n";
    }



}
